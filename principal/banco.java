package principal;
import java.util.Locale;
import java.util.Scanner;
import comp.conta;

public class banco {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);
        conta conta;

        System.out.println("Enter account number: ");
        int num = ab.nextInt();
        System.out.println("Enter account name: ");
        ab.nextLine();
        String nome = ab.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char res = ab.next().charAt(0);

        if(res == 'y'){
            System.out.println("Enter initial deposit value: ");
            double deposInicial = ab.nextDouble();
            conta = new conta(num, nome, deposInicial);
        } else{
            conta = new conta(num, nome);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposito = ab.nextDouble();
        conta.deposit(deposito);
        System.out.println("Uptade account data: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a saque value: ");
        double saq = ab.nextDouble();
        conta.saque(saq);
        System.out.println("Uptade account data: ");
        System.out.println(conta);



    ab.close();
    }
}

