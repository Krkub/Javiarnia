package pdf2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Podaj imiona (oddziel enterem, x żeby zakończyć)");
        String name = sc.nextLine();
        while (!name.toLowerCase().equals("x")) {
            names.add(name);
            name = sc.nextLine();
        }
        System.out.println(names.stream().sorted().toList());

    }
}
