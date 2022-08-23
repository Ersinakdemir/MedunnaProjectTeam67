package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

//    public static void main(String[] args) {
//        System.out.println(getDate());
//    }


    public static String getDate(LocalDateTime dateTime, String format){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern(format);
        return dateTime.format(formatDate);
    }

    public static LocalDateTime addDayToDate(LocalDateTime dateTime, int day){
        return dateTime.plusDays(day);
    }
}