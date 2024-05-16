package cases;
import java.util.Scanner;

public class Case04{

    public static void main(String[]args){

        Scanner ab = new Scanner(System.in);
        int a;

        System.out.println("Informe um numero: ");
        a = ab.nextInt();

        

        if (a%2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("Não é par");
        }
    }
}