package study;

//변수
//임의의 메모리 공간에 이름을 붙여 사용하는 방법
//변수를 사용하여 RAM 공간을 활용할 수 있음

//변수를 사용하기 위해서는 자료형이 필요
//자료형
//1. 정수
//- byte (1 byte)
//- short (2 byte)
//- int (4 byte)
//- long (8 byte)
//2. 실수
//- float (4 byte)
//- double (8 byte)
//3. 문자
//- char (2 byte) -> 유니코드 문자를 저장
//4. 진리형
//- boolean (1 byte)
//- true / false 의 값만을 저장하는 타입

public class Ex03_Variable01 {
	public static void main(String[] args){
		
		// 4byte 정수형의 num 변수를 선언하세요.
		int num = 0;
		
		/* num 변수 공간에 정수 100을 저장(할당)하세요.
		    변수에 값을 할당하려면 대입연산이 필요합니다.
		    대입(할당) 연산은 = 기호를 사용합니다
		    변수이름 = 대입값;		
		*/
		
		num = 100;
		
		// num 변수공간에 할당된 값(100)을 
		// printf 메소드를 사용해서 출력하세요
		
		
		System.out.printf("num : %d%n", num);
		System.out.println("num : " + num);
		System.out.print("num : " + num + "\n");
	}
	
	
}
