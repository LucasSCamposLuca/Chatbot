# Usando a imagem do OpenJDK como base
FROM openjdk:23-jdk-slim

LABEL authors="lucassc"

# Diretório de trabalho no container
WORKDIR /chatbotAPI-0.0.1-SNAPSHOT

# Copiando o arquivo .jar gerado para dentro do container
COPY target/chatbotAPI-0.0.1-SNAPSHOT.jar /chatbotAPI-0.0.1-SNAPSHOT/chatbotAPI-0.0.1-SNAPSHOT.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "chatbotAPI-0.0.1-SNAPSHOT.jar"]

# Se precisar rodar o "top" em vez da aplicação, descomente a linha abaixo
# ENTRYPOINT ["top", "-b"]
