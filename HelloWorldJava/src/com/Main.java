package com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("--health-check")) {
            System.out.println("OK");
            return;
        }
        int wybor;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            //DESIGN A
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Powitanie");
            System.out.println("2. Informacje");
            System.out.println("3. Wyjście");
            System.out.println("4. Calculator");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            slashN();

            switch (wybor) {
                case 1:
                    System.out.println("Hello, world!");
                    break;
                case 2:
                    System.out.println("Autor: Sviatoslav Hnatiuk. V1");
                    break;
                case 3:
                    System.out.println("Koniec");
                    break;
                case 4:
                    runCalculator(scanner, calculator);
                default:
                    System.out.println(" ");
            }

        } while (wybor != 3);
    }

    public static void slashN(){
        System.out.println("\n");
    }
    public static String choice(int wybor) {
        switch (wybor) {
            case 1:
                return "Hello, world!";
            case 2:
                return "Autor: Sviatoslav Hnatiuk. V1";
            case 3:
                return "Koniec";
            default:
                return " ";
        }
    }
    public static void runCalculator(Scanner scanner, Calculator calculator) {
        int calcChoice;
        do {
            System.out.println("---- Kalkulator ----");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Potęgowanie");
            System.out.println("6. Powrót do menu głównego");
            System.out.print("Wybierz działanie: ");
            calcChoice = scanner.nextInt();

            if (calcChoice >= 1 && calcChoice <= 5) {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = scanner.nextInt();
                System.out.print("Podaj drugą liczbę: ");
                int b = scanner.nextInt();

                try {
                    int result = 0;
                    switch (calcChoice) {
                        case 1:
                            result = calculator.add(a, b);
                            break;
                        case 2:
                            result = calculator.subtract(a, b);
                            break;
                        case 3:
                            result = calculator.multiply(a, b);
                            break;
                        case 4:
                            result = calculator.divide(a, b);
                            break;
                        case 5:
                            result = calculator.power(a, b);
                            break;
                    }
                    System.out.println("Wynik: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Błąd: " + e.getMessage());
                }
            } else if (calcChoice != 6) {
                System.out.println("Niepoprawny wybór.");
            }

            slashN();

        } while (calcChoice != 6);
    }
}
