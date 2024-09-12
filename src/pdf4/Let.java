package pdf4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Let {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String str = sc.nextLine();
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        System.out.println(counts.entrySet().stream().sorted((a, b) -> -Integer.compare(a.getValue(), b.getValue())).toList());
    }
}
