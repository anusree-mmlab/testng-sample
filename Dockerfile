FROM openjdk:11-jdk-slim
RUN apt-get update
RUN apt-get install -y maven

COPY . /app/

CMD ["java", "-jar",  "app/target/testngsample-testng-0.0.1-SNAPSHOT.jar"]
