//https://www.acmicpc.net/problem/2588
import java.util.*;

public class multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int A = a * (b%10);
		int B = a * ((b%100)/10);
		int C = a * (b/100);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(a*b);

	}

}
