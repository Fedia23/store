FROM openjdk:17

ARG JAR_FILE=target/config-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} config-0.0.1-SNAPSHOT.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/config-0.0.1-SNAPSHOT.jar"]