package comp;

import java.util.Locale;
import java.util.Scanner;

public class negativo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        int an = ab.nextInt();

        //linha que referência a variavel, como vetor no objeto
        Product[] vect = new Product[an];

        for (int i = 0; i < vect.length; i++) {
            ab.nextLine();
            String nome = ab.nextLine();
            double preco = ab.nextDouble();
            vect[i] = new Product(nome,preco);
        }


        for (int i=0; i<vect.length; i++){
            ;
        }

        double av = sum / vect.length;
        System.out.println("AVERAGE HEIGHT: " + av);

        ab.close();

    }
}
