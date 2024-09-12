package pdf1;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj stan konta");
        double money = sc.nextDouble();
        sc.nextLine();
        System.out.println("Twój stan konta wynosi: " + money);
        System.out.println("Podaj oprocentowanie konta %");
        double rate = sc.nextDouble() / 100;
        sc.nextLine();
        System.out.println("Twoje oprocentowanie wynosi " + rate * 100 + "%");
        System.out.println("Ile razy w roku naliczają się odsetki?");
        int freq = sc.nextInt();
        sc.nextLine();
        System.out.println("Odsetki naliczają się " + freq + " razy w roku");
        System.out.println("Ile lat?");
        double years = sc.nextDouble();
        sc.nextLine();
        System.out.println(years + " lat");
        double res = Math.pow(1 + rate / freq, freq * years) * money;
        System.out.println("Miałbyś: " + res);
    }
}
