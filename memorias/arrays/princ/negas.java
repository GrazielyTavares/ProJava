package memorias.arrays.princ;

import java.util.Locale;
import java.util.Scanner;


public class negas{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        System.out.print("Quantos pessoas vc vai digitar?");
        int n = ab.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] alt = new double[n];

        for(int i =0 ; i< n; i++){
            System.out.print("Digite o numero da " + (i+1) + "a pessoa:");
            System.out.println("Nome: ");
            nome[i] = ab.next();
            System.out.println("Idade: ");
            idade[i] = ab.nextInt();
            System.out.println("Altura: ");
            alt[i] = ab.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n ; i++){
            sum = sum + alt[i];
        }
        
        double av = sum / n;
        System.out.println("Media das alturas: %.2f%n " + av);

        int cont = 0;
        

        
         ab.close();

        }
     
    }


        
       