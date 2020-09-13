package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SortingDate {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("15/SEP");
        arr.add("13/OCT");
        arr.add("15/DEC");
        arr.add("05/DEC");
        arr.add("17/MAR");
        arr.add("11/FEB");
        arr.add("20/JUL");
        solution(arr);
    }

    private static void solution(List<String> arr) {
        Map<String, String> monthInDigits  = new HashMap<String, String>() {{
            put("JAN", "01");
            put("FEB", "02");
            put("MAR", "03");
            put("APR", "04");
            put("MAY", "05");
            put("JUN", "06");
            put("JUL", "07");
            put("AUG", "08");
            put("SEP", "09");
            put("OCT", "10");
            put("NOV", "11");
            put("DEC", "12");
        }};

        for(String date : arr) {
            System.out.println(date.substring(date.indexOf('/')+1));
        }
    }

    private static void sortDateTimeObject() {
        List<LocalDateTime>dateTimeList=new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2012, 05, 12, 5, 16));
        dateTimeList.add(LocalDateTime.of(2014, 03, 23, 11, 26));
        dateTimeList.add(LocalDateTime.of(2011, 02, 13, 9, 36));
        dateTimeList.add(LocalDateTime.of(2013, 11, 12, 5, 16));
        dateTimeList.add(LocalDateTime.of(2017, 8, 11, 21, 26));
        dateTimeList.add(LocalDateTime.of(2016, 9, 05, 19, 36));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("MM/dd/yyyy '@'hh:mm a");
        System.out.println("---> Date & Time Object List Before Sort (MM/dd/yyyy '@'hh:mm a)");
        for(LocalDateTime dateTime:dateTimeList)
        {
            System.out.println(dateTime.format(dateTimeFormatter));
        }
        // LocalDateTime  internally having Comparable interface no need additional Comparator
        Collections.sort(dateTimeList);

        System.out.println("---> Date & Time Object List After Sort (MM/dd/yyyy '@'hh:mm a)");
        for(LocalDateTime dateTime:dateTimeList)
        {
            System.out.println(dateTime.format(dateTimeFormatter));
        }

    }
}
