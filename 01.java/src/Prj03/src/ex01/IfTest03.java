package ex01;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class IfTest03 {
    static void main() {
        LocalDateTime now = LocalDateTime.now();
        int dayWk = now.getDayOfWeek().getValue();
        String wkday = "";

        if (dayWk == 1) wkday = "月";
        else if (dayWk == 2) wkday = "火";
        else if (dayWk == 3) wkday = "水";
        else if (dayWk == 4) wkday = "木";
        else if (dayWk == 5) wkday = "金";
        else if (dayWk == 6) wkday = "土";
        else if (dayWk == 7) wkday = "日";
        System.out.println("한자로 "+wkday+"曜日");

        String wkday2 = "";
        switch(dayWk) {
            case 1: wkday2 = "월"; break;
            case 2: wkday2 = "화"; break;
            case 3: wkday2 = "수"; break;
            case 4: wkday2 = "목"; break;
            case 5: wkday2 = "금"; break;
            case 6: wkday2 = "토"; break;
            case 7: wkday2 = "일"; break;
        }
        System.out.println("한글로 "+wkday2+"요일");

        java.time.DayOfWeek dayOfWeek = now.getDayOfWeek();

        String koreanDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        String[] dayStr = {"월", "화", "수", "목","금","토", "일" };
        System.out.println( dayStr[ dayWk - 1 ]  + "요일" );

    }
}
