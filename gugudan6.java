import java.util.Scanner;

public class gugudan6 {
	public static void main (String[] args) {
	System.out.println("몇 단을 출력할까요?");
	Scanner scan = new Scanner(System.in);
		 int [] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 int n = scan.nextInt();
		 if (n < 2 || n > 9) {
			 System.out.println("2~9사이의 숫자만 입력해주세요");
		 } else {
			 for(int i = 1; i <= result.length; i++) {
				 System.out.println(n + " x " + i + " = " + n*i);
			 }
		 }
	}
}
