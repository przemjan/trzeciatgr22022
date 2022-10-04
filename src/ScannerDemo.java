import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj swoją średnią: ");
        double srednia = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj imię: " );
        String name = klawiatura.nextLine();

        System.out.println("Numer Buta: " + numerButa + ", średnia: " +
                srednia + ", imię: " + name);
    }
}
