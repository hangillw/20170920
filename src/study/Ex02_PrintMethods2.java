package study;

import java.io.IOException;

public class Ex02_PrintMethods2 {
	public static void main(String[] args) {

		/*
		 * 개행문자를 지정할 때 사용하는 '\'는 Java의 문자열에서 의미를 가지는 문자입니다. '\' 자체를 출력하기 위해서는
		 * '\' 앞에 '\'을 추가합니다.
		 */
		System.out.print("\\ \n");

		// \t <--tab문자
		System.out.print("Hello\tJava\n");

		// \" : " 문자 자체를 출력하는 경우에 사용함
		System.out.print("지금은 \"Java\" 수업시간입니다\n");

		// \b : backspace 문자
		// \b 를 사용하면 커서를 오른쪽에서 왼쪽으로 한칸 이동합니다.
		System.out.print("메뉴를 선택하세요 : []\b\b\n");

		try {
			int num = System.in.read();
			System.out.printf("입력하신 수는 '%d' 입니다.%n", num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// %d의 자리에서 20의 값을 사용하여 출력하세요
		System.out.printf("10+ 10 = %d%n", 20);

		System.out.printf("%d + %d = %d%n", 10, 10, 20);

		// 실수 출력
		System.out.printf("평균 점수는 %f 점입니다%n", 95.123456789);
		// 자릿수를 지정해서 실수 출력하기
		System.out.printf("평균 점수는 %.2f 점입니다%n", 95.12345678);
		// 전체 자리수는 5자리, 소수점 이하는 2자리 출력하기
		System.out.printf("평균 점수는 %5.2f 점입니다%n", 95.12345678);
		// 전체 자리수는 5자리, 소수점 이하는 2자리 출력하기
		System.out.printf("평균 점수는 %5.2f 점입니다%n", 95.1);
		
		/*
		  문자를 출력하는 경우		  
		 */
		System.out.printf("당신의 학점은 '%c' 학점입니다%n", 'A');
		
		/*
		 진리형 값(true, false)을 출력하는 경우
		 %b를 사용해서 출력함 (b: boolean)
		 */
		System.out.printf("10>5= %b%n", 10>5);

	} // main() method
} // class
