FROM openjdk:17

ARG JAR_FILE=target/person-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} person-1.0-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/person-1.0-SNAPSHOT.jar"]