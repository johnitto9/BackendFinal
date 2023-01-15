
FROM amazoncorretto:11-alpine-jdk
MAINTAINER JuanPablo    
COPY target/argprograma-0.0.1-SNAPSHOT.jar argprogramaJpa-app.jar
ENTRYPOINT ["java","-jar","/argprogramaJpa-app.jar"]