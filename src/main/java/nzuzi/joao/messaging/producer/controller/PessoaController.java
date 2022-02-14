package nzuzi.joao.messaging.producer.controller;

import nzuzi.joao.messaging.producer.dto.PessoaDTO;
import nzuzi.joao.messaging.producer.producer.IPessoaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/kafka/pessoas")
public class PessoaController {

    @Autowired
    private IPessoaProducer producer;

    @PostMapping
    public ResponseEntity<PessoaDTO> create(@RequestBody PessoaDTO pessoaDTO){
        PessoaDTO pessoa = PessoaDTO.builder()
                .id(UUID.randomUUID().toString())
                .nome(pessoaDTO.getNome())
                .sobrenome(pessoaDTO.getSobrenome())
                .sexo(pessoaDTO.getSexo())
                .estadoCivil(pessoaDTO.getEstadoCivil())
                .dataNascimento(pessoaDTO.getDataNascimento())
                .build();
        producer.send(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaDTO);
    }
}
