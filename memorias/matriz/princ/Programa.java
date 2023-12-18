package memorias.matriz.princ;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        int n = ab.nextInt();
        
        //Os colchetes represetam a quantidade de dimensão da memória, neste caso seria Bidimensional
        int [][] mat = new int[n][n]; 

        //vai adicionando as informações por fila, ex: 0.0 0.1 0.2
        //                                             1.0 1.1 1.2
        //mat.length -> acessa a quantidade de posições do VETOR 0|1|2, sendo a quantidade de colunas
        for(int i=0; i<mat.length; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = ab.nextInt();
            }
        }

        //filtrando a diagonal principal, ou seja com i iguais ex 1.1 0.0
        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        //Numeros negativos
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<n; j++){
                if(mat [i][j] < 0){
                    count ++;
                    
                }
            }
        }
         System.out.println("Negative numbers:" + count);

        ab.close();
    }
}
