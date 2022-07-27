FROM openjdk:11-jdk
COPY build/libs/cicd-*.jar app.jar
ENTRYPOINT ["java", "-jar" , "app.jar"]