FROM openjdk:17

ARG JAR_FILE=target/goods-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} goods-1.0-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/goods-1.0-SNAPSHOT.jar"]