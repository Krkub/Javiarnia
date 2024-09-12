package pdf2;

import java.util.ArrayList;
import java.util.Scanner;

public class Runners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź biegaczy w formacie imie:czas  (x aby zakończyć)");
        String toParse = sc.nextLine();
        ArrayList<Runner> runners = new ArrayList<>();
        while (!toParse.toLowerCase().equals("x")) {
            try {
                runners.add(Runner.fromString(toParse));
            } catch (Runner.ParseError err) {
                System.out.println("Wystąpił bład: " + err.toString());
            }
            toParse = sc.nextLine();
        }
        System.out.println(runners.stream().sorted((a, b) -> Double.compare(a.time, b.time)).toList());
    }

    private static record Runner(String name, double time) {
        public static Runner fromString(String str) throws ParseError {
            try {
                var split = str.trim().split(":");
                return new Runner(split[0], Double.parseDouble(split[1]));
            } catch (Exception ex) {
                throw new ParseError("Format to imie:czas " + ex.toString());
            }
        }

        public static class ParseError extends Exception {
            ParseError(String msg) {
                super(msg);
            }
        }
    }
}
