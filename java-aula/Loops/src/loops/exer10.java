package loops;

import java.util.Scanner;

public class exer10 {

	//Faça um programa em Java que leia um número inteiro e positivo e 
	//imprima todos os seus divisores (positivos e negativos).
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a,b;
		
		a = in.nextInt();
		
		for(int cont = -a; cont <=a; cont++) {
			if(a % cont ==0) {
				System.out.println(cont + " ");
			}
		}

	}

}
