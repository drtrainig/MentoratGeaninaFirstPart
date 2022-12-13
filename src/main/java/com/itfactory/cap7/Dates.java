package com.itfactory.cap7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateWithFormatter = LocalDate.parse("2022-11-10", dateTimeFormatter);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(7);

        System.out.println(localDate);
        System.out.println(localDate1);

        if (localDate.isAfter(localDate1)) {
            System.out.println("Produsul a expirat");
        } else {
            System.out.println("Produsul va expira in " + Duration.between(localDate1.atStartOfDay(), localDate.atStartOfDay()).toDays());
        }
    }
}
