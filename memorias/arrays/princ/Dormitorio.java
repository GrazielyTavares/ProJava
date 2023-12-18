package memorias.arrays.princ;
import memorias.arrays.comp.InfoDormi;
import memorias.arrays.comp.Product;

import java.util.Locale;
import java.util.Scanner;

public class Dormitorio {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        String c = ab.nextLine();
        int d = ab.nextInt();

        InfoDormi[] vet = new InfoDormi[d];

        for (int i = 0; i < vet.length; i++) {
            ab.nextLine();
            System.out.println("Rent #" + vet.length );
            String nome = ab.nextLine();
            String email = ab.nextLine();
            int rom = ab.nextInt();
            vet[i] = new InfoDormi(nome, email, rom);
        }


        ab.close();

    }
}
