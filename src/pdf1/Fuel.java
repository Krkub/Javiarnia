package pdf1;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj obecną cenę paliwa");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podana cena paliwa wynosi: " + price);
        System.out.println("Ile pali twoje auto? (litry/100km)");
        double eff = sc.nextDouble();
        sc.nextLine();
        System.out.println("Twoje auto pali: " + eff + " l/100km");
        double pricePerKm = price * (eff / 100);
        System.out.println("Twój koszt to " + pricePerKm + " PLN/km");
        System.out.println("Ile kilometrów jeździsz?");
        double km = sc.nextDouble();
        sc.nextLine();
        System.out.println("Jeździsz " + km + " km");
        double pricePerTrip = pricePerKm * km;
        System.out.println("Koszt podróży to " + pricePerTrip);

    }
}
