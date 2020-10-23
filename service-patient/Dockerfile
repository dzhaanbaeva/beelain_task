FROM openjdk:11.0.8
VOLUME /tmp
ADD target/service-patient.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]