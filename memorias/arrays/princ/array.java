package memorias.arrays.princ;


import java.util.Locale;

import java.util.Locale;
import java.util.Scanner;

import memorias.arrays.comp.Product;

public class array {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        int an = ab.nextInt();

        //linha que referência a variavel, como vetor
        double[] vect = new double[an];

        for (int i = 0; i < vect.length; i++) {
          vect[i] = ab.nextDouble();
        }

        //media entre os valores inseridos no vetor
        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i];
        }
        double av = sum/vect.length;
        System.out.println("AVERAGE HEIGHT: " + av );

        ab.close();

    }
}
