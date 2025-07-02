FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

# Kopiujemy katalogi src i lib
COPY src ./src
COPY lib ./lib

# Kompilujemy kod
RUN mkdir -p out/production && \
    javac -classpath "lib/*" -d out/production $(find src -name "*.java")

# Uruchamiamy program
CMD ["java", "-cp", "lib/*:out/production", "com.Main"]
