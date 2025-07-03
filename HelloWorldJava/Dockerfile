FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

COPY src ./src
COPY lib ./lib

RUN mkdir -p out && \
    javac -cp "lib/*" -d out $(find src -name "*.java")

CMD ["java", "-cp", "out:lib/*", "com.Main"]
