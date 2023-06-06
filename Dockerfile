FROM openjdk:11
COPY target/ms-config-client-0.0.1-SNAPSHOT.jar ms-config-client-0.0.1.jar
ENTRYPOINT ["java","-jar","/ms-config-client-0.0.1.jar"]