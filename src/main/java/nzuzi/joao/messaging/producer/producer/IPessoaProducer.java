package nzuzi.joao.messaging.producer.producer;

import nzuzi.joao.messaging.producer.dto.PessoaDTO;

public interface IPessoaProducer {

    void send(PessoaDTO pessoaDTO);
}
