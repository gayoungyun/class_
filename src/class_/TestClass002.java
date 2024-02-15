package class_;

import java.util.Scanner;

public class TestClass002 {
	public int inputData() {
		System.out.println("입력 기능");
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("숫자 입력");
		num = input.nextInt();
		return num;
	}
	public void opData(int s) {
		System.out.println("연산 기능");
		
		if(s%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		return ;
	}
	
}
