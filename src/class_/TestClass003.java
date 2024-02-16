package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass003 {
	public int num1, num2,max;

	public void inputData() {
		Scanner input = new Scanner(System.in);
		//ArrayList<num> arr = new ArrayList<>();
		//	int arr[] = new int[2];
		//int num1=0, num2=0;
		//int []arr = {num1, num2};
		System.out.println("두수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
	}
	public int opData() {
		
		for(int i=0; i<3 ;i++) {
			if(num1>max) {
				max = num1;
			}else  {
				max = num2;
			}
		}
		return max;
	}
	public void printData(int max) {
		System.out.println("더 큰수는 "+max);
	}
}
