#FROM adoptopenjdk:11-jre-hotspot
#VOLUME /tmp
#ADD target/*.jar app.jar
#CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]
#EXPOSE 8084
FROM maven

WORKDIR /src

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

CMD ["java", "-jar", "target/DockeEx1Application-0.0.1-SNAPSHOT.jar"]