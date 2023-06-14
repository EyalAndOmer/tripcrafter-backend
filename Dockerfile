FROM maven:3.9.2-amazoncorretto-17-debian-bullseye

WORKDIR /src

COPY target/tripcrafter.jar /src

EXPOSE 8080

CMD ["java", "-jar", "tripcrafter.jar"]
