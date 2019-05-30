
public class HelloVar_02 {

	public static void main(String[] args) {
			
		int num1 =  2147483647; //2147483647
		
		// 연산결과가 절대 (-)가 나올 수 없는 상황인데
		// 결과과(-)로 표현되는 상황은
		// 기억장소에 저장할 수 있는 값의 범위를 넘어선 오류 상황이다.
		System.out.println(num1 + 1);
		
		long num2 = 3020340230993923483l;
		long num3 = 2148483647l;
		
		System.out.println(num3 + 1);
	}

}
