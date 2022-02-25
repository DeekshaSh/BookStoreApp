FROM adoptopenjdk:8-jre-hotspot-bionic
ADD target/authmodule-0.0.1-SNAPSHOT.jar authmodule.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar" , "authmodule.jar"]
