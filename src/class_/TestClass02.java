package class_;

import java.util.Scanner;

public class TestClass02 {
	public int inputData() {
		System.out.println("입력받는 기능");
		Scanner input= new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		return num;
		
	}

}
