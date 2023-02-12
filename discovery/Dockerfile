FROM openjdk:17

ARG JAR_FILE=target/discovery-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} discovery-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","/discovery-0.0.1-SNAPSHOT.jar"]