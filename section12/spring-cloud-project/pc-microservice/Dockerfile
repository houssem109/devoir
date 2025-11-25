#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk-jammy
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="houssembenjaafar105@gmail.com"
# Add the application's jar to the image
COPY target/pc-microservice-0.0.1-SNAPSHOT.jar pc-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "pc-microservice-0.0.1-SNAPSHOT.jar"]