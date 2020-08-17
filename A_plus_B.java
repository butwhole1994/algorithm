//https://www.acmicpc.net/problem/1000
import java.util.*;//scanner클래스를 사용하기 위해 라이브러리 import해줌

public class A_plus_B {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner클래스를 이용하기위해 인스턴트 생성.
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		//next자료형() 와 같은 형태를 가지는 함수. 대표적으로 nextInt()와 nextDouble()이 있다.
		//자신이 설정한 자료형에 맞는 값을 입력할 수 있다.
		
		
		System.out.println(a+b);
	}
}
