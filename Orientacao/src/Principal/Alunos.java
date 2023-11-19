package Principal;

import java.util.Locale;
import java.util.Scanner;

import Ent.Notas;

public class Alunos {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        Notas cal = new Notas();
        System.out.println("Nome:");
        cal.nome = ab.nextLine();
        System.out.println("Notas:");
        cal.not1 = ab.nextDouble();
        cal.not2 = ab.nextDouble();
        cal.not3 = ab.nextDouble();
        double cb = 60.00 - cal.Calculo();

        System.out.println("FINAL GRADE = " + cal.Calculo());

        if (cal.Calculo() > 60.00){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("MISSING "+ cb + " POINTS");
        }


    }
}
