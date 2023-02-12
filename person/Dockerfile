FROM openjdk:17

ARG JAR_FILE=target/person-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} person-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/person-0.0.1-SNAPSHOT.jar"]