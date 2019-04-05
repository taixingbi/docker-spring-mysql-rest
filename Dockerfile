FROM openjdk:8
ADD target/bike-rent.jar bike-rent.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "bike-rent.jar"]