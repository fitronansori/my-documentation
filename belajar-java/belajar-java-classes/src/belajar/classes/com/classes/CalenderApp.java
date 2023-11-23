package belajar.classes.com.classes;

import java.util.Calendar;
import java.util.Date;

public class CalenderApp {
    public static void main(String[] args) {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1996);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 10);

        Date result = calendar.getTime();
        System.out.println(result);
        long milisecond = calendar.getTimeInMillis();
        System.out.println(milisecond);
    }
}
