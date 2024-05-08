package loops;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int var, cont = 1, calc = 1, sum = 0;
		boolean per = true;
		
		System.out.println("Escreva um numero Fatorial:");
		var = in.nextInt();
		
		while(var >= 1) {
			calc *= var;
			var --;
			System.out.println(calc);
		}
		
	}

}
