import java.util.Scanner;

public class gugudan4 {
	public static void main(String[] args) {
		System.out.println("몇 단을 출력할까요?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
}
