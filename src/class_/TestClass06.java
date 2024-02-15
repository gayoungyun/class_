package class_;

public class TestClass06 {
	public int sumFunc(int n) { //값만 넘어가서 이름 같을필요없다
		//t.sumFunc(num)에 숫자 문자 확인하고 int, String사용
		int sum=0;
		for(int i=1 ; i<=n ; i++) {
			sum+=i;
		}
		return sum;//void와 문법이 일치해야 리턴된다(문자면 string)
	}
	public int test(int n, String s) {
		return 100;
	}
}