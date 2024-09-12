package pdf1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź liczbę pomieszczeń:");
        int numberOfRooms = sc.nextInt();
        sc.nextLine();
        ArrayList<RoomSize> roomSizes = new ArrayList<RoomSize>();
        for (int i = 0; i < numberOfRooms; i++) {
            try {
                System.out.println("Wprowadź wymiary pomieszczenia (format np. 2x3, jednostka: m^2)");
                String textToParse = sc.nextLine();
                RoomSize room = RoomSize.fromString(textToParse);
                System.out.println("Podałeś wymiary: " + room.toString());
                roomSizes.add(room);
            } catch (ParseError err) {
                System.out.println("Coś poszło nie tak");
                System.out.println(err.toString());
                i--;
            }
        }
        List<Double> rooms = roomSizes.stream().map(RoomSize::area).toList();
        System.out.println("Pola pokoi: " + rooms.toString());
        Double area = rooms.stream().reduce(Double::sum).orElseThrow();
        System.out.println("Pole całkowite: " + area);
        System.out.println("Podaj liczbę osób w mieszkaniu (jeśli nie chcesz obliczać przestrzeni na osobę, podaj 0)");
        int personCount = sc.nextInt();
        sc.nextLine();
        if (personCount > 0) {
            System.out.printf("Polę na osobę wynosi(%d osób/%.2f metrów): %.2f", personCount, area, area / (double) personCount);
        }


    }

    private static record RoomSize(double x, double y) {
        public static RoomSize fromString(String input) throws ParseError {
            try {
                var splits = input.trim().split("x");
                double x = Double.parseDouble(splits[0]);
                double y = Double.parseDouble(splits[1]);
                return new RoomSize(x, y);
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new ParseError("Prawdopodobnie nie dałeś x\n" + ex.toString());
            } catch (NumberFormatException ex) {
                throw new ParseError("Źle sformatowana liczba\n" + ex.toString());
            }
        }

        public double area() {
            return this.x * this.y;
        }
    }

    private static class ParseError extends Exception {
        public ParseError(String errorMessage) {
            super(errorMessage);
        }
    }
}
