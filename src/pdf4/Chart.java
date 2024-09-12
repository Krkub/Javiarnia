package pdf4;

import pdf2.Runners;

import java.util.Scanner;

public class Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj elementy wykresów w formacie nazwa:liczba");

    }

    private static record Value(String name, double value) {
        public static Value fromString(String str) throws Value.ParseError {
            try {
                var split = str.trim().split(":");
                return new Value(split[0], Double.parseDouble(split[1]));
            } catch (Exception ex) {
                throw new Value.ParseError("Format to imie:czas " + ex.toString());
            }
        }

        public static class ParseError extends Exception {
            ParseError(String msg) {
                super(msg);
            }
        }
    }
}
