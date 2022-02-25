FROM adoptopenjdk:8-jre-hotspot-bionic
ADD target/bookcatalog-0.0.1-SNAPSHOT.jar bookcatalog.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar" , "bookcatalog.jar"]
