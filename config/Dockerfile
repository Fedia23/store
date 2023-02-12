FROM openjdk:17

ARG JAR_FILE=target/config-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} config-1.0-SNAPSHOT.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/config-1.0-SNAPSHOT.jar"]