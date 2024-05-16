import java.util.Scanner;
public class diarias {

	public static void main(String[] args) {
	
		double a,b,c,f;
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Quantos dias?");
		a = d.nextDouble();
		
		System.out.println("Valor da diária:");
		
		if(a > 15) {
			b = (250*a) + (a*15.5);
			System.out.println("Valor " + b);
		}else if(a == 15) {
			c = (250*a) + ( a*36);
			System.out.println("Valor " + c);
		}else if(a < 15) {
			f = (250*a) + (a*58);
			System.out.println("Valor " + f);
		}else {
			System.out.println("Deu erro");
		}
			

	}

}
