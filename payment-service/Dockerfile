FROM store/oracle/serverjre:8
COPY payment-web/target/payment-web-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]