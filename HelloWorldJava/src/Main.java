import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            //DESIGN A
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Powitanie");
            System.out.println("2. Informacje");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            emptySpace();

            switch (wybor) {
                case 1:
                    System.out.println("Hello, Git!");
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
    public static void emptySpace() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
