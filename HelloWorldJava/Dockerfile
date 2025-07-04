FROM eclipse-temurin:24-jdk-alpine

FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

COPY production ./out
HEALTHCHECK --interval=30s --timeout=5s --start-period=5s --retries=3 \
  CMD java -cp /app/out com.Main --health-check || exit 1

#CMD ["java", "-cp", "out:lib/*", "com.Main", "--health-check"]
