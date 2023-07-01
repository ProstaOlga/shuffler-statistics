FROM bellsoft/liberica-openjdk-alpine:17
MAINTAINER https://github.com/ProstaOlga
ARG JAR_FILE=build/libs/*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]