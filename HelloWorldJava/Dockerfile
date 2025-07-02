FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

# Kopiujemy skompilowane klasy (używając ścieżki względnej do kontekstu builda)
COPY out/production/HelloWorldJava/com ./com

# Domyślne polecenie (uruchomienie main class)
CMD ["java", "-cp", "com", "com.Main"]
