package pdf3;

import java.util.Scanner;

public class Valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału od 10 do 24");
        double num = sc.nextByte();
        sc.nextLine();
        while (num > 24 || num < 10) {
            System.out.println("Podaj liczbę z przedziału od 10 do 24");
            num = sc.nextByte();
            sc.nextLine();
        }
        System.out.println("Podana liczba: " + num);
    }
}
