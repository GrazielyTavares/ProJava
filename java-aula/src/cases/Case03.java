import java.util.Scanner;

public class Case03{

    public static void main(String[] args){

        Scanner ab = new Scanner(System.in);
        int a, b;

        System.out.println("Informe o numero: ");
      
        a = ab.nextInt();

        //Diminuindo a entrada para minuscula
        b = a%2;


        switch(b){
            case 0:
                System.out.println("Numero é par");
                break;
            default:
                System.out.println("Numero é impar");
        }
       
    }
}