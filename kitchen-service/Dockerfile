FROM store/oracle/serverjre:8
COPY kitchen-web/target/kitchen-web-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]