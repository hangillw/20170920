package study;

public class Ex04_Variable02 {
	public static void main(String[] args) {
		// 변수의 초기화 방법

		// 4byte 크기의 정수를 보관할 수 있는 공간을 확보하고
		// num1이라는 이름표(변수)를 붙이고
		// num1변수공간에 값 10을 할당하세요

		// 1. 변수의 생성과 초기화를 분리하는 방법
		int num1;
		num1 = 10;
		 
		// num1변수공간에 값 20을 할당하세요		
		num1 = 20;
		
		System.out.printf("num1 : %d",num1);
		
		// 4byte 크기의 정수를 보관할 수 있는 공간을 확보하고
		// num2이라는 이름표(변수)를 붙이고
		// num2변수공간에 값 200을 할당하세요
		
		// 2. 변수의 생성과 초기화를 동시에 하는 방법
		int num2 = 200;
		
	}
}
