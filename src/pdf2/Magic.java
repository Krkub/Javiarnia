package pdf2;

import java.time.LocalDate;
import java.util.Date;

public class Magic {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < cores; i++) {
            Finder f = new Finder(1900 + (100 / cores) * i, 1900 + (100 / cores) * (i + 1));
            f.start();
        }
    }

    private static boolean isMagic(LocalDate date) {
        return date.getDayOfMonth() * date.getMonthValue() == (date.getYear() - 1900);
    }

    private static class Finder extends Thread {
        int startDate;
        int endDate;

        Finder(int startDate, int endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        @Override
        public void run() {
            LocalDate date = LocalDate.of(this.startDate, 1, 1);
            while (date.getYear() < this.endDate) {
                date = date.plusDays(1);
                if (isMagic(date)) {
                    System.out.println("Data: " + date + " jest magiczna");
                }
//            System.out.print(".");
            }
        }
    }
}
