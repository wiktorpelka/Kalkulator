import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator. Wprowadź dwie liczby i symbol operacji arytmetycznej (+, -, *, /).");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Wprowadź pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Wprowadź symbol operacji arytmetycznej (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            System.out.print("Wprowadź drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double wynik = 0;

            switch (symbol) {
                case '+':
                    wynik = liczba1 + liczba2;
                    break;
                case '-':
                    wynik = liczba1 - liczba2;
                    break;
                case '*':
                    wynik = liczba1 * liczba2;
                    break;
                case '/':
                    if (liczba2!= 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Błędny symbol operacji arytmetycznej!");
                    return;
            }

            System.out.println("Wynik: " + wynik);
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane wejściowe!");
        }

        System.out.println("Wciśnij Enter, aby zakończyć...");
        scanner.nextLine(); // czekamy na wciśnięcie Enter
        System.in.read(); // dodajemy pętlę, która czeka na wciśnięcie Enter
    }
}