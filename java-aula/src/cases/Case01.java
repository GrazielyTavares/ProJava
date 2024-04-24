import java.util.Scanner;

public class Case01{

    public static void main(String[]args){

        Scanner ab = new Scanner(System.in);
        String a;

        System.out.println("Informe uma vogal: ");
        a = ab.next();

//Diminuindo a entrada para minuscula
        a = a.toLowerCase();

        if (a.equals('a') || a.equals('e') || a.equals('i') || a.equals('o') || a.equals('u')){
            System.out.println("A letra é uma vogal");
        }else{
            System.out.println("A letra não é uma vogal");
        }
    }
}