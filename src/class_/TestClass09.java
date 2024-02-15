package class_;

public class TestClass09 {
	public void test1() {
		for(int i=0 ; i<5; i++) {
			System.out.println(i);
			if(i==3)
				//break;
				return ;//값없이 사용가능, 반환값이있을때 사용(void), 매소드를 끝내는것
		}
		System.out.println("test1 종료");
	}
	public int test2() {
		int n = 10;
		if(n >100)
			return 100;
		
		return 0; //변수 초기화같은, else로 대신 쓸수도있다
	}
	public String test3() {
		int num = 100;
		if(num>10)
			return "문자열";
		else
			return "100";//return 100;사용x
	}
	public String test4() {
		return "aaaa";//, "bbb", "cccc"; //여러개x 배열, collection 으로
	}
	
}








