package Bonus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class coverLoGlo {
    
    // // data-hora para Texto
    LocalDate d04 = LocalDate.parse("2023-12-17");
    LocalDateTime d05 = LocalDateTime.parse("2023-12-17T22:06:45");
    Instant d06 = Instant.parse("2023-12-17T22:07:15Z");

    //Converte 
    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

    //Converte para o nome escrito dentro dos parentesês
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

    // //Quantidades de dias
    // System.out.print("d04 dia:" + d04.getDayOfMonth());

    // //Quantidades de Meses
    // System.out.println("d04 meses:" + d04.getMonthValue());

    // System.out.print("r1 = " + r1);
    // System.out.print("r4 = " + r4);
}
