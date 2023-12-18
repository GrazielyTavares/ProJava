package memorias.arrays.princ;

import java.util.Locale;
import java.util.Scanner;

public class negativo{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        System.out.print("Quantos nmero vc vai digitar?");
        int n = ab.nextInt();

        int[] vect = new int[n];

        for(int i =0 ; i< n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = ab.nextInt();
        
        }

        System.out.println("Numero Negativos:");
        for(int i = 0; i<n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
         ab.close();
    }

}
        
       