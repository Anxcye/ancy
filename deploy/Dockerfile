FROM openjdk:11

LABEL author=Anxcye

COPY ./ancy.jar /app.jar

EXPOSE 8083

# ENV MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}

ENTRYPOINT ["java","-jar","/app.jar", "--spring.profiles.active=prod"]
