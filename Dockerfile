FROM openjdk:8-alpine3.9

ADD target/*.jar dsjms.jar

ENTRYPOINT ["java", "-jar", "dsjms.jar"]