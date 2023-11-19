import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Jack";
        String type = "Corrente";
        Integer saldo = 2500;
        Scanner ab = new Scanner(System.in) ;
        int a;

        while (true) {
            System.out.println("Digite a opção desejada:");
            a = ab.nextInt();
            switch (a){
                case 1:
                    System.out.println("Saldo da conta:"+ saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    Scanner ac = new Scanner(System.in) ;
                    int b = ac.nextInt();
                    saldo = b + saldo;
                    System.out.println("Valor atualizado da conta: R$"+ saldo);
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir?");
                    Scanner ad = new Scanner(System.in) ;
                    int d = ad.nextInt();
                    saldo = saldo - d;
                        if (d < saldo) {
                            System.out.println("Valor acima da saldo");
                        } else {
                            System.out.println("Valor atualizado da conta: R$"+ saldo);
                        }
                    break;
                case 4:
                    System.out.println("Saindo da conta");
                    return;
                default:
                System.out.println("Número invalido");
                    break;

            }
        }
    }
}
