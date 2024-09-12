package pdf2;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile minut miesięcznie dzwonisz?");
        int minutes = sc.nextInt();
        sc.nextLine();
        System.out.println("Dzwonisz " + minutes + " minut");
        double Aplan = 39.99 + ((minutes - 450) > 0 ? (minutes - 450) * 0.45 : 0);
        double Bplan = 59.99 + ((minutes - 900) > 0 ? (minutes - 900) * 0.40 : 0);
        double Cplan = 69.99;
        System.out.printf("Plan a:%.2f Plan b:%.2f Plan c:%.2f", Aplan, Bplan, Cplan);

    }
}

