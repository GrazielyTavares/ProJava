package Principal;

import Ent.entra;

import java.util.Locale;
import java.util.Scanner;


public class Cadatros {


     public static void main(String[] args){

         Locale.setDefault(Locale.US);
         Scanner ab = new Scanner(System.in);

         entra produto = new entra();
         System.out.println("PRODUTOS:");
         System.out.print("Nome: ");
         produto.nome = ab.nextLine();
         System.out.print("Preço: ");
         produto.preco = ab.nextDouble();
         System.out.print("Quantidade: ");
         produto.quant= ab.nextInt();

         System.out.println();
         System.out.println("PRODUTOS:" + produto);

         System.out.println();
         System.out.println("Enter the number of products to be added in stock:" );
         int quant = ab.nextInt();
         produto.AddProducts(quant);

         System.out.println();
         System.out.println("Updated data: " + produto);

         System.out.println();
         System.out.println("Enter the number of products to be removed from stock:");
         quant = ab.nextInt();
         produto.RemoveProducts(quant);

         System.out.println();
         System.out.println("Updated data: " + produto);

         ab.close();
     }
}
