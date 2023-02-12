FROM openjdk:17

ARG JAR_FILE=target/discovery-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} discovery-1.0-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","/discovery-1.0-SNAPSHOT.jar"]