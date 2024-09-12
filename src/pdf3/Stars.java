package pdf3;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rozmiar trapezu:");
        int size = sc.nextInt();
        for (int i = size; i > 0; i--) {
            System.out.println(new String(new char[i]).replace('\0', '*'));
        }
    }
}
