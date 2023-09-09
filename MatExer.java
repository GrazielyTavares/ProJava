import java.util.Locale;
import java.util.Scanner;

public class MatExer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ab = new Scanner(System.in);
			
		double c, f, e = 3.14159;
		
		c = ab.nextDouble();
		
		f = e * c * c;
		
		
		System.out.printf("Area=%.4f%n", f);
	
		ab.close();
		

	}

}
