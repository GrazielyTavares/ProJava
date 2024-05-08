package loops;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int contador = 0;
		
		int numAtual;
		int numMaior = 0;
		
		while(contador < 5) {
			System.out.println("Numero:");
			numAtual = in.nextInt();
			if(numAtual > numMaior) {
				numMaior = numAtual;
			}
			contador ++;
		}
		
		System.out.println("numero:" + numMaior);

	}

}
