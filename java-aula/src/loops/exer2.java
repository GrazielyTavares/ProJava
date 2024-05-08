package loops;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int var, cont = 0;
		boolean per = true;
		

		while(per != false) {
			System.out.println("Numero a ser mult:");
			var = in.nextInt();
			while(cont < 10) {
				System.out.println(var*cont);
				cont ++;
			}
			
			System.out.println("Deseja continuar?");
			per = in.nextBoolean();
			if(per == false) {
				break;
			}
		}
	}

}
