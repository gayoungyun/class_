package class_;

public class TestClass08 {// 각각 기능따로 만드는게 좋다
	public void inputData() {
		int num = 100;
		//return num;
		op(num);
	}
	public void op(int num) {
		num += 1000;
		printN(num);
		
	}
	public void printN(int n) {
		System.out.println("n : "+n);
		
	}
}

