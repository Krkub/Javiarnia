package pdf3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość startową:");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Wartość startowa: " + start);
        double sum = 0;
        for (int i = 0; i < start; i++) {
            sum += i / (double) (start - i);
        }
        System.out.println("Sum:" + sum);
    }
}
