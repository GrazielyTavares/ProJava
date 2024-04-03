import java.util.Scanner;

public class aula_condicional {

	public static void main(String[] args) {
		
		double a,b,c;
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Lado a:");
		a = d.nextDouble();
		
		System.out.println("Lado b:");
		b = d.nextDouble();
		
		System.out.println("Lado c:");
		c = d.nextDouble();
		
		if(a < (b+c) || b < (a+c) || c < (a+b)) {
			System.out.println("FOII");
		}else {
			System.out.println("NÃO FOI");
		}
	}

}
