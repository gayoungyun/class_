package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass003 {
	public int inputData() {
		Scanner input = new Scanner(System.in);
		//ArrayList<num> arr = new ArrayList<>();
		
		int num1=0, num2=0;
		int []arr = {num1, num2};
		System.out.println("두수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		return arr;
	}
}
