package pdf1;

import java.util.Scanner;

public class Croissant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość linii croissant");
        int lines = sc.nextInt();
        sc.nextLine();
        System.out.println("pdf1.Croissant będzie miało: " + lines + " linii");
        int halfLines = lines / 2;
        for (int i = 0; i < halfLines; i++) {
            int spaces = halfLines - i;
            System.out.print(new String(new char[spaces]).replace("\0", " "));
            System.out.print(new String(new char[(i * 2) + 1]).replace("\0", "*"));
            System.out.print(new String(new char[spaces]).replace("\0", " "));
            System.out.print("\n");
        }
        for (int i = halfLines-1; i >= 0; i--) {
            int spaces = halfLines - i;
            System.out.print(new String(new char[spaces]).replace("\0", " "));
            System.out.print(new String(new char[(i * 2) + 1]).replace("\0", "*"));
            System.out.print(new String(new char[spaces]).replace("\0", " "));
            System.out.print("\n");
        }
    }
}
