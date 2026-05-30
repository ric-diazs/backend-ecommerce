# Ejecucion de paquete '.jar' con JDK
FROM eclipse-temurin:25
WORKDIR /app
COPY target/*.jar app.jar

# Puerto por defecto para backend Ventas
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
