import java.util.Scanner;

public class gugudan5 {
	public static void main(String[] args) {
		System.out.println("몇 단을 출력할까요?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 2 || n > 9) {
			System.out.println("2~9까지만 입력해주세요.");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(n + " x " + i + " = " + n*i);
			}
		}
	}
}
