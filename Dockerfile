FROM openjdk:10-jre-slim
COPY ./target/k8stest-1.0-SNAPSHOT.jar /usr/src/k8stest/
WORKDIR /usr/src/k8stest
EXPOSE 8080
CMD ["java", "-jar", "k8stest-1.0-SNAPSHOT.jar"]