
public class HelloString_01 {

	public static void main(String[] args) {
		

		System.out.println("30 + 40 = " + 30 + 40);
		
		//1. 30 + 40 = 은 문자열이므로 그대로 표시하려고 준비
		//2. "30 + 40 = " + "30" 으로 계산식 변환
		// 결과 " 30 + 40  = 30" 가 되고
		//3. "30  + 40 - 30" + "40"
		
		// 아래 명령문은 "30 - 40  = 30" - 40의 계산으로 변환되어
		// 문자열을 minus(-)연산하라는 명령문이 되어
		// 문법오류 명령문이 된다.
		// System.out.println("30 - 40 = " + 30 - 40);
		
		
	}

}
