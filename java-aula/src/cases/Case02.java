import java.util.Scanner;

public class Case02{

    public static void main(String[] args){

        Scanner ab = new Scanner(System.in);
        String a;

        System.out.println("Informe uma vogal: ");
      
        a = ab.next();

        //Diminuindo a entrada para minuscula
        a.toLowerCase();


        switch(a){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra é uma vogal");
                break;
            default:
                System.out.println("A letra não é uma vogal");
        }
       
    }
}