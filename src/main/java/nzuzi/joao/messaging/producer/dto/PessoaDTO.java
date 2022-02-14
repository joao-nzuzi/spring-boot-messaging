package nzuzi.joao.messaging.producer.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaDTO {
    private String id;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String estadoCivil;
    private String dataNascimento;
}
