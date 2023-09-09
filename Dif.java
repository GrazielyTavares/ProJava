import java.util.Scanner;

public class Dif {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int b, c, d, e, f;
		
		b = a.nextInt();
		c = a.nextInt();
		d = a.nextInt();
		e = a.nextInt();
		
		f = (c * b) - (d * e);
		
		System.out.printf("Diferença = %d%n",f);

	}

}
