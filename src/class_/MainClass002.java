package class_;

import java.util.Scanner;

public class MainClass002 {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		int num;
		System.out.println("입력 숫자");
		num = input.nextInt();
		
		if(num%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		*/
		TestClass002 t = new TestClass002();
		int n = t.inputData();
		t.opData(n);
	}

}
