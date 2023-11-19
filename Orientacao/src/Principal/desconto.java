package Principal;

import java.util.Locale;
import java.util.Scanner;

import Ent.funcio;

public class desconto {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        funcio descontos = new funcio();
        System.out.println("Nome:");
        descontos.nome = ab.nextLine();
        System.out.print("Gross salary: ");
        descontos.salario = ab.nextDouble();
        System.out.print("Tax: ");
        descontos.taxa= ab.nextDouble();


        System.out.println();
        System.out.println("Employee:"+descontos.nome + ", $ " + descontos.NetSalary());


        System.out.println();
        System.out.println("Which percentage to increase salary?");
        descontos.porcen = ab.nextDouble();

        System.out.println();
        System.out.println("Updated data: " + descontos);

    }
}
