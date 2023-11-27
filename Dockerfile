FROM openjdk:11
EXPOSE 8080
ADD target/kubernetesapp-0.0.1-SNAPSHOT.jar kubernetesapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "spring-boot-jenkins.jar.jar"]
