FROM openjdk:11.0.8
VOLUME /tmp
ADD target/server-discovery.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]