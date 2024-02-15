package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass003 {
	public static void main(String[] args) {
		ArrayList<num> arr = new ArrayList<>();
		/*Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("두수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1>num2) {
			System.out.println("더 큰수 : "+num1);
		}else if (num2>num1) {
			System.out.println("더 큰수 : "+num2);
		}
		*/
		TestClass003 tc= new TestClass003();
		int []a = tc.inputData();
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}
