/*
 * Copyright y.moskalenko
 * https://t.me/MorpheusVN
 */

package Lesson_4.Task_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import static java.time.temporal.ChronoUnit.*;

class TimeSinceYourBirth {
    static void TimeFromBirthday(int year, int month, int day, int hour, int minutes) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDateTime input = LocalDateTime.of(year, month, day, hour, minutes);
        LocalDate inputDate = LocalDate.of(year, month, day);

        Period diff = Period.between(inputDate, nowDate);

        long diffSec = Math.abs((SECONDS.between(now, input)) % 60);
        long diffMin = Math.abs((MINUTES.between(now, input)) % 60);
        long diffHour = Math.abs(HOURS.between(now, input) % 24);


        System.out.println("В даний момент прожито: " + diff.getYears() + " років, " + diff.getMonths() +
                " місяці, " + diff.getDays() + " дні, " + diffHour + " годин, " + diffMin + " хвилин, "
                + diffSec + " секунд");
    }

    public static void main(String[] args) {

        System.out.println("Мій день народження: 07.02.1983 15:40, хоча точно час я не впевнений ;)");
        System.out.print("\n");
        TimeFromBirthday(1983, 2, 07, 15, 40);
    }
}
