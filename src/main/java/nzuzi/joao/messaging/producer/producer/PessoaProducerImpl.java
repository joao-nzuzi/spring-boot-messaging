package nzuzi.joao.messaging.producer.producer;

import nzuzi.joao.messaging.producer.dto.PessoaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PessoaProducerImpl implements IPessoaProducer{
    private static final Logger logger = LoggerFactory.getLogger(PessoaProducerImpl.class);
    private final String topic;
    private KafkaTemplate<String, PessoaDTO> kafkaTemplate;

    public PessoaProducerImpl(@Value("${topic.name}") String topic, KafkaTemplate<String, PessoaDTO> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void send(PessoaDTO pessoaDTO) {
        kafkaTemplate.send(topic, pessoaDTO).addCallback(
                success -> logger.info("Enviando mensagem " + success.getProducerRecord().value()),
                failure -> logger.info("Falha no envio da mensagem" + failure.getMessage())
        );
    }
}
