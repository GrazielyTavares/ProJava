import java.util.Arrays;
import java.util.Scanner;

public class cres {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int[] var = new int[3];
		
		var[0] = a.nextInt();
		var[1] = a.nextInt();
		var[2] = a.nextInt();
		
		b = Arrays.sort(var[0], var[1], var[2]);
		
		System.out.print("valores: " + var);
		
		
	}
}
