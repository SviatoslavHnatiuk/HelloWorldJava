package com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int wybor;
        Scanner scanner = new Scanner(System.in);

        do {
            //DESIGN A
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Powitanie");
            System.out.println("2. Informacje");
            System.out.println("3. Wyjście");
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
                default:
                    System.out.println("zła liczba");
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
                return "zła liczba";
        }
    }
}
