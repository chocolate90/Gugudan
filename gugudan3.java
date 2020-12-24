import java.util.Scanner;

public class gugudan3 {
	public static void  main(String[] args) {
		System.out.println("몇 단을 출력할까요?");
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int n = scan.nextInt();
		while(i < 10) {
			System.out.println(n + " x " + i + " = " + n*i);
			i++;
		}
	}
}
