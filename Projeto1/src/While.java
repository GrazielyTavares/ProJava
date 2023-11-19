import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // 1 TESTE
//        Scanner ab = new Scanner(System.in);
//        int b = ab.nextInt();
//
//        while(b != 2002) {
//            System.out.println("Senha invalida");
//            b = ab.nextInt();
//        }
//
//        System.out.println("Acesso Permitido");
//
//        ab.close();

        // 2 TESTE
//        Scanner ab = new Scanner(System.in);
//
//        int y = ab.nextInt();
//        int x = ab.nextInt();
//
//        while (y != 0 & x != 0){
//            if ( y>0 && x>0) {
//                System.out.println("PRIMEIRO");
//            } else if ( y >0 && x < 0)  {
//                System.out.println("QUARTO");
//            }else if ( y < 0 && x < 0)  {
//                System.out.println("TERCEIRO");
//            } else{
//                System.out.println("SEGUNDO");
//            }
//            y = ab.nextInt();
//            x = ab.nextInt();
//
//        }
//
//        ab.close();

        //3 TESTE
        Scanner ab = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        int y = ab.nextInt();

        while (y != 4) {
            if (y == 1){
                a += 1;
            } else if (y == 2) {
                b += 1;
            } else if (y == 3) {
                c += 1;
            }

            y = ab.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool:"+a);
        System.out.println("Gasolina:"+b);
        System.out.println("Diesel:"+c);




        ab.close();

    }
}



