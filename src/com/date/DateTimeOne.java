package com.date;

import java.time.*;

public class DateTimeOne {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getYear());


        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());
        System.out.println(LocalTime.now().getNano());


        LocalDateTime dateTime = LocalDateTime.now();

        Integer dd = dateTime.getDayOfMonth();
        Integer mm = dateTime.getMonthValue();
        Integer yy =dateTime.getYear();

        System.out.printf("%d-%d-%d",dd,mm,yy);
        System.out.println();

        Integer hh=dateTime.getHour();
        Integer mi=dateTime.getMinute();
        Integer ss =dateTime.getSecond();

        System.out.printf("%d:%d:%d",hh,mi,ss);

        System.out.println();

        System.out.println(dateTime.plusMonths(6));
        System.out.println(dateTime.minusMonths(6));

        LocalDateTime dateTime1 = LocalDateTime.of(1995,10,12,13,05);

        System.out.println(dateTime1);

        System.out.println();

        LocalDate date = LocalDate.of(1986,07,10);
        Period p = Period.between(date,LocalDate.now());

        System.out.printf("Your age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());

        System.out.println();
        Year year =Year.now();
        System.out.println(year.isLeap()?"Leap Year":"Not a leap year");

        System.out.println(Year.of(2020).isLeap()?"Leap year":"Not a leap year");

        System.out.println(ZoneId.systemDefault());

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println();

        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        System.out.println(zonedDateTime);

        

    }
}
