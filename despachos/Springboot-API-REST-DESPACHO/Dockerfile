# Ejecucion con JDK
FROM eclipse-temurin:25
WORKDIR /app
COPY target/*.jar app.jar

# Puerto para backend Despachos
EXPOSE 8081

ENTRYPOINT ["java","-jar","/app/app.jar"]
