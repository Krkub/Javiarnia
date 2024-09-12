package pdf3;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar fingury:");
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("#");
            System.out.print(new String(new char[i]).replace('\0', ' '));
            System.out.print("#");
            System.out.print("\n");
        }
    }
}
