#Użycie lekkiego JDK 24 od Eclipse Temurin
FROM eclipse-temurin:24-jdk-alpine

#Ustawienie katalogu roboczego wewnątrz kontenera
WORKDIR /app

#Kopiowanie skompilowanego pliku aplikacji do kontenera
COPY HelloWorldJava/out/production/HelloWorldJava/ ./

#Domyślne polecenie do uruchomienia aplikacji
CMD ["java", "com.Main"]
