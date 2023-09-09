import java.util.Locale;
import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner a = new Scanner(System.in);
		
		int b, c;
		double d, f;
		
		b = a.nextInt();
		c = a.nextInt();
		d = a.nextDouble();
		
		
		f = c * d ;
		
		System.out.printf("Number = %d%n", b);
		System.out.printf("Salary = %.2f%n", f);

	}

}
