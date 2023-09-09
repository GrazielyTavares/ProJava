import java.util.Locale;
import java.util.Scanner;

public class peca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner a = new Scanner(System.in);
		
		int b, c, e, f;
		double d, g, h, j, i;
		
		b = a.nextInt();
		c = a.nextInt();
		d = a.nextDouble();
		
		e = a.nextInt();
		f = a.nextInt();
		
		g = a.nextDouble();
		
		h = d * c;
		j = g * f;
		
		i = h + j;
		
	
		System.out.printf("Valor a pagar = %.2f%n", i);

	}

}
