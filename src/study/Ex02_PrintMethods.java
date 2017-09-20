package study;

public class Ex02_PrintMethods {
	// Java의 출력 메소드들
	// print, println, printf
	
	//1.print 메소드
	// 메소드의 인자값을 콘솔화면에 출력함.
	// 자동 개행(줄바꿈)(x)
	// Hello java !!!
	
	public static void main(String[] args){
		
		System.out.print("Hello ");
		System.out.print("java !!!");
		System.out.print("\n"); // \n 이 줄바꿈
		System.out.print("Hello ChoongAng");
		System.out.print("\n\n");
		
		
	// 2. println 메소드
	// 메소드의 인자값을 화면에 출력하고
	// 자동 개행(줄바꿈) 하는 메소드
		
	// Hello
	// java !!!
		
		System.out.println("Hello");
		System.out.println("java !!!");
		
	// 3. printf 메소드
	// 서식문자(변환문자)를 사용해서 정의한 폼에 맞추어서
	// 콘솔화면에 출력함.
	// 자동개행(줄바꿈) (x)
	// %s : 문자열 %d : 10진수(정수) 
	// %c : 문자   %f : 실수
		
		System.out.printf("%s", "Hello ");
		System.out.printf("%s", "Java!!");
		System.out.printf("\n%s : %d 점입니다%n", "국어", 100);
		System.out.printf("%5s : %5d 점입니다 %n", "영어", 99);
		System.out.printf("%-5s : %-5d 점입니다","수학",98);
		
	}
	
	
	
}
