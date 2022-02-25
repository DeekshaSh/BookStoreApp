FROM adoptopenjdk:8-jre-hotspot-bionic
ADD target/bookorder-0.0.1-SNAPSHOT.jar bookorder.jar
EXPOSE 9001
ENTRYPOINT [ "java", "-jar" , "bookorder.jar"]
