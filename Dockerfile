FROM maven:3-amazoncorretto-21-debian AS MAVEN_BUILD
WORKDIR /build/
COPY . .
RUN mvn clean install package -Dmaven.test.skip=true

FROM amazoncorretto:21
WORKDIR /run
COPY --from=MAVEN_BUILD /build/sparrow-server/target/app-jar-with-dependencies.jar /run/app.jar
EXPOSE 6666
ENTRYPOINT java -jar app.jar
