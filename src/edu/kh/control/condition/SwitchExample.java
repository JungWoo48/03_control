package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 *  switch문
	 *  식 하나의 결과로 많은 수를 처리할때 사용한다
	 *   식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 *    작성법
	 *    
	 *    switch(식) {
	 *    
	 *    case 결과값1 : 수행코드1; break:
	 *    case 결과값2 : 수행코드2; break:
	 * 	  case 결과값3 : 수행코드3; break:
	 * 	  .......
	 *    default : case를 모두 만족하지 않을 경우 수행하는 코드( == else)
	 */

	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력");
		int input = sc.nextInt();
		
		String result;
		
		switch(input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색"; break;
		}
		
		System.out.println(result);
		
				
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력");
		int month = sc.nextInt();
		
		String season;
		
		switch(month) {
		
		case 3 : case 4 : case 5 : season = "봄"; break;
		case 6 : case 7 : case 8 : season = "여름"; break;
		case 9 : case 10 : case 11 : season = "가을"; break;
		case 12 : case 1 : case 2 : season = "겨울"; break;
		default : season ="해당하는 계절 없음";
		}
		
		System.out.println(season);
		
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자: ");
		String op = sc.next();
		
		switch(op) {
		case "+" : System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2); break;
				
		case "/" : if(num2 == 0) {System.out.println("0으로 나눌수 없다");
			
		} else { System.out.printf("%d / %d = %d\n",
					num1, num2, num1 / num2);
		} break;
		
		
	}
		
		
	}
		
	
}
