package Bonus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {
        
        // //pacote de data Local
        // LocalDate d01 = LocalDate.now();
        // LocalDateTime d02 = LocalDateTime.now();
        // Instant d03 = Instant.now();


        //  //aaaa-mm-dd;
        // System.out.println(d01);
        // //aaaa-mm-dd Thh-mm-ss.ml;
        // System.out.println(d01);
        // //aaaa-mm-dd Thh-mm-ss.ml convertendo de londres;
        // System.out.println(d03);

        // // data-hora para Texto
        LocalDate d04 = LocalDate.parse("2023-12-17");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-17T22:06:45");
        Instant d06 = Instant.parse("2023-12-17T22:07:15Z");

        DateTimeFormatter fnt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fnt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Atualiza e realiza a formatação da data
        DateTimeFormatter fnt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        //Convertendo para texto
        System.out.println(d04.format(fnt1));
        
        System.out.println(fnt1.format(d04));
     
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fnt1));
        System.out.println(d05.format(fnt2));
    }
}
