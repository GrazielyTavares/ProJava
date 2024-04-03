import java.util.Scanner;

public class equacao2grau {

	public static void main(String[] args) {

		double a,b,c,delta,x1,x2,f,g;
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Valores equação:");
		System.out.println("A:");
		a = d.nextDouble();
		
		System.out.println("B:");
		b = d.nextDouble();
		
		System.out.println("C:");
		c = d.nextDouble();
		
		delta = Math.pow(b, 2);
		System.out.println(delta);
		f = delta - (4*a*c);
		System.out.println(f);
		g = Math.sqrt(f);
		
		x1 = (-b + g)/(2*a);
		x2 = (-b - g)/(2*a);
		
		System.out.println("Equação x1: " + x1 + "  Equação x2: " + x2);
	}

}
