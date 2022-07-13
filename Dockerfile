FROM openjdk:11
ADD target/final-build.jar final-build.jar
#EXPOSE 8081
ENTRYPOINT ["java", "-jar", "final-build.jar"]