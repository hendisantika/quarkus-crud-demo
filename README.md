# Quarkus Simple Rest Crud

A simple project to test quarkus rest features

## Command used to create the project

```
mvn io.quarkus:quarkus-maven-plugin:0.15.0:create \
    -DprojectGroupId=com.hendisantika.quarkus.sample \
    -DprojectArtifactId=crud-sample \
    -DclassName="com.hendisantika.quarkus.sample.PersonResource" \
    -Dpath="/person" \
    -Dextensions="resteasy-jsonb,quarkus-smallrye-openapi,quarkus-swagger-ui"
```

## Running the application

```
mvn compile quarkus:dev
```

## Accessing

- Application will be accessible on http://localhost:8080
- Swagger UI will be accessible on http://localhost:8080/q/swagger-ui

## Image Screen Shot

Swagger UI

![Swagger UI](img/ACME%20API.png "Swagger UI")

![Logo](img/logos.png "Logos")
