package pdf4;

import java.util.Scanner;

public class Fractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość przepracowanych dni:");
        int days = sc.nextInt();
        sc.nextLine();
        while (days < 1) {
            System.out.println("Prosimy nie zaginać czasoprzestrzeni?");
            days = sc.nextInt();
            sc.nextLine();
        }
        double sum = 0;
        double salary = 0.01;
        for (int i = 0; i < days; i++) {
            System.out.printf("%d | %.2f\n", i, sum);
            sum += salary;
            salary *= 2;
        }
    }

}
