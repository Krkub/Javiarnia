package pdf2;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Dur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund");
        int secs = sc.nextInt();
        sc.nextLine();
        int day = secs / (24 * 3600);

        secs = secs % (24 * 3600);
        int hour = secs / 3600;

        secs %= 3600;
        int minutes = secs / 60;

        secs %= 60;
        int seconds = secs;

        System.out.println(day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }
}
