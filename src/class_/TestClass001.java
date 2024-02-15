package class_;

import java.util.Scanner;

public class TestClass001 {
	public int inputData() {
		System.out.println("입력받는 기능");
		Scanner input= new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		return num;
	}
	public void opData(int a) {//a랑 맞춘다
		System.out.println("연산 기능");
		//int nu=0;
		if(a%3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
		return ;
	}
	//public void printData(int b) {
		//System.out.println();
}





