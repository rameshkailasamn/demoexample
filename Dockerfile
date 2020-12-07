FROM java:8
ADD /target/rameshdocker.jar rameshdocker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","rameshdocker.jar"]