import java.util.Locale;
import java.util.Scanner;

public class pont {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner a = new Scanner(System.in);
	
		double d, g, h, j, i, k , l, m;
		
		d = a.nextDouble();;
		g = a.nextDouble();
		h = a.nextDouble();
		
		j = (d * h)/2;
		i = (h * h)* 3.14;
		k = ((d+g)*h)/2;
		l = g * g;
		m = d * h;

		System.out.printf("Triangulo=%.3f%n", j);
		System.out.printf("Circulo=%.3f%n", i);
		System.out.printf("Trapezio=%.3f%n", k);
		System.out.printf("Quadrado=%.3f%n", l);
		System.out.printf("Retangulo=%.3f%n", m);
		
		a.close();
	}

}
