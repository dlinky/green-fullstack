package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class ArrayTest03 {
    static void main() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: "+now);

        String wkDay = getWkDay();
        System.out.println("요일 한자:" + wkDay);
    }

    private static String getWkDay() {
        String[] y = new String[] {"月","火","水","木","金","土","日"};

        LocalDate now = LocalDate.now();
        int wk = now.getDayOfWeek().getValue();
        String wkDay = y[wk-1];
        return wkDay+"曜日";
    }

}
