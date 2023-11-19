package Principal;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

import Ent.trigo;

public class calTrigo {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        trigo calculo = new trigo();
        System.out.println("Medidas do retângulo");
        System.out.print("Largura: ");
        calculo.larg = ab.nextDouble();
        System.out.print("Altura: ");
        calculo.alt = ab.nextDouble();

        System.out.println("Area = " + calculo.Area());
        System.out.println("Perimetro = " + calculo.Perimetro());
        System.out.println("Diagonal = " + calculo.Diagonal());


        ab.close();
    }
}
