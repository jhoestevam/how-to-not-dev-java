package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main2 {

    public static void main (String... args) throws Exception{
        //Nova api de data
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        //antiga api de data
        System.out.println(new Date());

        //Data de ontem
        System.out.println(LocalDate.now().plusDays(-1));

        //Manipulando a nova api
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = LocalDate.now().plusDays(1);
        System.out.println(hoje.isBefore(amanha));
        System.out.println(hoje.isAfter(amanha));
        System.out.println(hoje.isEqual(amanha));

        //Comparando a diferença de dias entre duas datas
        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.of(1989, Month.JANUARY, 25);
        long dias = ChronoUnit.DAYS.between(outraData, agora);
        System.out.println(dias);
    }
}
