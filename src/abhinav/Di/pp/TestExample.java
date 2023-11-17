package abhinav.Di.pp;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;

public class TestExample {


    public static void main(String[] args) {

        Date dt = new Date();

        System.out.println(dt);

        System.out.println(OffsetDateTime.now());

        //System.out.println(Date.parse("Tue Nov 14 15:32:00 IST 2023"));


        Date birthDate = new Date();
        birthDate.setYear(1998);
        birthDate.setDate(6);
        birthDate.setMonth(4);


        Date currentDate = new Date();
        // validate inputs ...
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;

        System.out.println(age);


        Instant instant = Instant.ofEpochSecond(1699957638);
        LocalDate b = LocalDate.of(1998, 04, 04);


        ZoneId zoneId = ZoneId.of("America/Chicago");
        LocalDate cd = LocalDate.ofInstant(instant, zoneId);
        System.out.println(Period.between(b, cd).getYears());


        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");




        LocalDate datetime = LocalDate.parse("1990-11-10",pattern);
        System.out.println(datetime);


    }

}

