package study;

public class Ex05_Variable03 {
	static int a;
	static int b;
	// 맴버 변수는 자동초기화가 지원됨
	
	public static void main(String[] args){

		System.out.printf("a : %d, b : %d%n", a, b);
		// 여러 개의 변수 생성 방법
		// type 변수이름1, 변수이름2, 변수이름3...;
		// 변수들의 type이 모두 int인 경우에 사용함
		int num1, num2, num3;
		
		float flt1, flt2, flt3;
		
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		System.out.printf("num1 : %d%nnum2 : %d%nnum3 : %d%n" , num1, num2, num3);
		// 여러 개의 변수를 생성하면서
		// 동시에 초기화 하는 방법
		// type 변수이름1=값1, 변수이름2=값2, 변수이름3=값3,...;
		
		int num4 = 40, num5 = 50, num6 = 60;
		
		System.out.printf("num4 : %d%nnum5 : %d%nnum6 : %d%n", num4, num5, num6);
		
		// 여러 개의 변수를 생성하면서
		// 일부만 초기화하는 방법
		// type 변수이름1, 변수이름2=값2, 변수이름3,...;
		int num7, num8 = 80, num9;
			
/*		System.out.printf("num7 : %d%nnum8 : %d%nnum9 : %d%n", num7, num8, num9);
		num7 과 num9 는 초기화를 안해서 오류가 발생.  */
	}
}
