package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int ampm = now.get(Calendar.AM_PM);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일");

        switch (week) {
            case Calendar.MONDAY: System.out.print("월요일 "); break;
            case Calendar.TUESDAY: System.out.print("화요일 "); break;
            case Calendar.WEDNESDAY: System.out.print("수요일 "); break;
            case Calendar.THURSDAY: System.out.print("목요일 "); break;
            case Calendar.FRIDAY: System.out.print("금요일 "); break;
            case Calendar.SATURDAY: System.out.print("토요일 "); break;
            case Calendar.SUNDAY: System.out.print("일요일 "); break;
        }

        if (ampm == Calendar.AM) {
            System.out.println("오전");
        }
        else {
            System.out.println("오후");
        }

        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초");

    }
}
