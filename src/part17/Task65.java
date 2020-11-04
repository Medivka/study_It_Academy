package part17;

import java.io.OutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Task65 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();

        LocalDateTime end = start.plusMonths(2);


        int NumberDayofWeek = 3;
        int NumberHourofDay = 13;
        int differenceDay = (NumberDayofWeek - start.getDayOfWeek().getValue());
        int diffeerenceOfHour = NumberHourofDay - start.getHour();

        if (diffeerenceOfHour <= 0) {
            if (differenceDay == 0) {
                start = start.plusDays(7);
            }
        }
        if (differenceDay < 0) {
            start = start.plusDays(7);
        }

        start = start.plusDays(differenceDay);
        LocalDateTime date = LocalDateTime.of(start.getYear(), start.getMonth(), start.getDayOfMonth(), 13, 00);
        for (; date.isBefore(end); ) {
            System.out.println(date);
            date = date.plusWeeks(1);
        }
    }
}
