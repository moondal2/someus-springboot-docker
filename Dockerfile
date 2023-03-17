FROM       openjdk:oracle
RUN        mkdir /my-app
WORKDIR    /my-app
RUN 		mkdir /my-app/diaryimg
COPY       ./build/libs/someus-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT  ["java", "-jar", "app.jar"]
