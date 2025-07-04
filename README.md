# HelloWorldJava

Projekt demonstracyjny w Javie, pokazujący działanie Git, GitHub oraz podstawy uruchomienia aplikacji tekstowej.

## Instrukcje deploymentu

### Wymagania wstępne

- Java JDK 11 lub nowsza (do pobrania z [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) lub [OpenJDK](https://openjdk.java.net/install/))
- Maven (opcjonalnie, jeśli chcesz używać do zarządzania buildem)
- Git (do klonowania repozytorium)

### Kroki uruchomienia lokalnie

1. Sklonuj repozytorium:
   ```bash
   git clone https://github.com/SviatoslavHnatiuk/HelloWorldJava.git
   cd HelloWorldJava
   ```

2. Skonfiguruj środowisko (patrz dokumentacja poniżej).

3. Skompiluj i uruchom aplikację:
   ```bash
   javac src/main/java/*.java
   java -cp src/main/java HelloWorldMain
   ```

*Uwaga: Dostosuj ścieżki i nazwy klas w zależności od struktury projektu.*

## Workflow w repozytorium

Repozytorium zawiera konfigurację GitHub Actions, która automatyzuje procesy CI/CD:

- Budowanie aplikacji — automatyczne kompilowanie kodu przy każdym pushu.
- Analiza statyczna kodu — sprawdzanie zgodności z konwencjami kodowania (google_checks.xml).

Pliki workflow znajdują się w `.github/workflows/`.


## Uruchamianie z Docker

1. Zbuduj obraz:
   ```bash
   docker build -t helloworldjava .

2. Uruchom kontener:

    docker run -d -p 80:8080 helloworldjava

3. Otwórz przeglądarkę i przejdź do http://localhost (jeśli aplikacja ma interfejs HTTP).


---

### . Informacja o testach (JUnit)**  
Dodaj sekcję opisującą jak odpalać testy ręcznie lub z workflow:

```markdown

## Testy jednostkowe


Testy znajdują się w katalogu `Test/` i są uruchamiane automatycznie przez GitHub Actions.


Aby uruchomić je lokalnie:

```bash
javac -cp "lib/*:out/production" -d out/test $(find Test -name "*.java")
java -jar lib/junit-platform-console-standalone-1.10.2.jar \

  --class-path out/production:out/test \
  --scan-classpath






## Konfiguracja środowiska


Aby pracować nad projektem:


- Zainstaluj Java JDK 11 lub nowszy i dodaj `java` oraz `javac` do zmiennej PATH.

- Rekomendowane IDE: IntelliJ IDEA, Eclipse lub VS Code z rozszerzeniem Java.
- Maven jest opcjonalny, ale może ułatwić zarządzanie zależnościami i budowanie projektu.

- Git do zarządzania wersjami.

