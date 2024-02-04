package java10.unit_5;

import java.text.DateFormat;
import java.util.Calendar;

public class _05ExecuteClass {
    public static void main(String[] args) {
        DateFormat instance = DateFormat.getInstance();
        System.out.println(instance.getCalendar().getTime());
        System.out.println( Calendar.getInstance().getFirstDayOfWeek());
        System.out.println( Calendar.getInstance().getTime());

        /*
        Fri Feb 04 16:01:51 TRST 1944
        2
        Sun Feb 04 16:01:51 TRT 2024
         */
    }
}
