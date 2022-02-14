# Producer do Serviço de Mensageria com Kafka e Spring Boot
Este projeto visa construir um produtor de mensagem com Kafka e Spring Boot. 
Usaremos o objeto Pessoa para construirmos o nosso projeto. Também faremos uso do verbo HTTP Post para exemplificarmos como podemos produzir uma meensagem.

# Pré-requisitos
São necessários os seguintes pré-requisitos para o desenvolvimento e execução do projecto:
  - Java 8 ou superior;
  - Apache Maven 3.6.3 ou superior - para gestão de dependências;
  - Kafka versão 2.13-3.1.0 ou superior;
  - Zookepper versão 3.4.7 ou superior;
  - Conduktor versão 2.20.5 ou superior.
 
# Apache Kafka
 É uma plataforma de streaming de dados que entrega e recebe dados, e é usado para sitemas onde a comunicação é em tempo real.
   - ## Características
        - Apache Kafka é uma plataforma distribuída, open source, de streaming de eventos;
        - Alto throughput, disponibilidade, escalável, amazenamento permanente;
        - Fault-tolerant: se algum dos servidores falha, os outros continuam trabalhando para garantir continuidade das operações sem qqr perda de dados;
        - Processamento de streaming embutido;
        - Schema registry: permite que produtores e consumidores falem a mesma lingua;
        - Conecta-se a quase tudo: interface connect permite fácil integração.
        
   - ## Topicos, Partições, Broker e Offsets
        - **Tópico**: É uma fila de dados onde os dados são armazenados de forma sequencial. Também pode ser um nome de categoria na qual as mensagens são publicadas e da qual os consumidores podem receber mensagens;
        - **Partições**: são subdivisões do tópico. As mensagens publicadas em um tópico são espalhadas por um cluster Kafka em várias partições. Cada partição pode ser associada a um broker para permitir que os consumidores leiam de um tópico em paralelo.
            Por padrão o Kafka inicia com uma única partição;
        - **Broker**: Um broker recebe mensagens de produtores e consumidores buscam mensagens do broker por tópico, partição e deslocamento.
        - **Offset**: Cada partição tem um identificador incremental chamado offset.
    			
   - ## Produtores e Consumidores
        - **Produtores**: são aplicações que produzem sms em um determinado tópico;
        - **Consumidores**: são aplicações que ficam escutando tópico para consumir as sms.
        
# ZooKeeper
   - O ZooKeeper é um serviço centralizado para manter informações de configuração, nomear, fornecer sincronização distribuída e fornecer serviços de grupo. Todos esses tipos de serviços são usados ​​de uma forma ou de outra por aplicativos distribuídos.
   - O ZooKeeper é essencialmente um serviço para sistemas distribuídos que oferece um armazenamento hierárquico de chave-valor, que é usado para fornecer um serviço de configuração distribuído, serviço de sincronização e registro de nomenclatura para grandes sistemas distribuídos.
   
# Interface de Monitoramento - Conduktor
   - Em termos mais simples, o Conduktor é um aplicativo de desktop nativo completo que se conecta diretamente ao Apache Kafka para dar visibilidade ao gerenciamento de clusters, aplicativos e microsserviços do Kafka.
   
# Ferramentas Utilizadas
Para construção deste projecto foi usado as seguintes ferramentas:

  - IntelliJ;
  - Spring Framework;
  - Postman - para execução dos testes de verificação;
  - Swagger para documentação;
  - Conduktor - A interface de monitoramento;
  - Git/GitHub para versionamento.

# Execução do Projecto
    Para executar o projecto no terminal (do IntelliJ), basta rodar o camando abaixo:
      - [x] mvn spring-boot:run ou clicar no play

    Após a execução do projecto no terminal, digita o seguinte endereço no browser:
      - [x] localhost:8080/kafka/pessoas

# Documentação de referência
Para referência adicional, considere as seguintes seções:
* [Instalação, Configuração e Execução do Apache Kafka e ZooKeeper](https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/);
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-kafka)