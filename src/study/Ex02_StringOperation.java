package study;

public class Ex02_StringOperation {
	public static void main(String[] args){
		/*
		 문자열 연산 - 결합연산
		 문자열과 다른 type의 값이 '+'연산을 하면 다른 type의 값이 문자열 값으로 됩니다.
		 */
		
		System.out.println("Hello "+"Java");
		System.out.println(100+200);
		System.out.println("1 + 1 ="+2);
		System.out.println("100"+200);
		
		// 문자열 결합 연산은
		// 왼쪽부터 오른쪽으로 연속적으로 일어납니다.
		System.out.println("10 + 20 = "+ 10 + 20);
		
		// 소괄호 안쪽은 우선적으로 처리됩니다
		System.out.println("10 + 20 = "+ (10 + 20));
		
		
		
	}
}
