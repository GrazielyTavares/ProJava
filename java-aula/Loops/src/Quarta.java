import java.util.Scanner;

public class Quarta {

	public static void main(String[] args) {
	int a,b,c,e, f;
	
	Scanner d = new Scanner(System.in);
	
	System.out.println("Valor A:");
	a = d.nextInt();
	System.out.println("Valor B:");
	b = d.nextInt();
	System.out.println("Valor C:");
	c = d.nextInt();
	
	e = Math.min(a, b);
	f = Math.min(e, c);
	
	if (e < f) {
		System.out.println("Valor Minimo:" + e);
	}else {
		System.out.println("Valor Minimo:" + f);
	}
	
	}
}
