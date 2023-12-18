package memorias.matriz.princ;

import java.util.Scanner;

public class Filtragem {
    
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);

        int m = ab.nextInt();
        int n = ab.nextInt();
        //instanciando a matrix
        int [][] mat = new int[m][n];

        for(int i=0; i<mat.length; i++){
            for (int j=0; i<mat[i].length; j++){
                mat[i][j] = ab.nextInt();
            }
        }

        int x = ab.nextInt();


        //filtragem do número escolhido
        for(int i=0; i<mat.length; i++){
            //correr a matriz do inicio ao fim
            for(int j=0; i<mat[i].length; j++){
                //Posição
                if(mat[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    //Erquerdo
                    if(j>0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    //Acima
                    if(i>0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    //Direito
                    if (j < mat[i].length-1){
                        System.out.println("Right : " + mat[i][j+1]);
                    }
                    //Baixo
                    if (j < mat.length-1){
                        System.out.println("Down : " + mat[i+1][j]);
                    }
                }
            }
        }
    }
}
