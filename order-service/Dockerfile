FROM store/oracle/serverjre:8
COPY order-web/target/order-web-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]