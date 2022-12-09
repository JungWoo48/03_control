package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
		
	/*
		 *  while문
		 *  -별도의 초가, 증감식이 존재하지 않고
		 *   반복 종료 조건을 자유롭게 설정하는 반복문
		 *   
		 *   **확실히 언제 끝날지는 모르지만
		 *   	언젠가 false가 되는 경우 반복을 종료
		 *   
		 *   [작성법]
		 *   
		 *   while( 조건식) {
		 *   		조건식이 true일 동안 반복 수행될 구문
		 * }
		 * 
		 * 
		 */
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input != 9) { //input이 9가 아닐때 반복한다 // 9를 누르기 전까지는 계속 메뉴를 선택 //input 9는 탈출조건
			System.out.println("=====키오스크=====");
			System.out.println("=====메뉴선택=====");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이 주문 완료"); break;
			case 2 : System.out.println("김밥 주문 완료"); break;
			case 3 : System.out.println("쫄면 주문 완료"); break;
			case 9 : System.out.println("키오스크 종료"); break;
			default : System.out.println("잘못된 입력");
			}
		}
	}
	public void ex2() {
		//입력되는 모든 정수의 합 구하기
		//단, 0이 입력되면 반복 종료후 결과 출력
		//0이 입력 되지 않으면 계속 반복
		
		Scanner sc = new Scanner(System.in);
		int input = 1;// 0만 아니면 무엇이든 상관 없다
		int sum = 0; //초기값이 0이어야 input과 더해졌을때 오류가 없다
		
		
		while(input != 0) {
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input; //sum에 input값을 누적시킴********** += a += 10 : a = a+10
			
		}
		
		System.out.println("합계: " + sum);
		
		
		
	}
	public void ex3() {
		//1부터 입력한 값의 합
		//단, 0을 초과한 숫자 입력
		//> 0이하의 숫자를 입력할 시 "1이상의 숫자를 입력해주세요"
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		if(input > 0) {
			int e = 1; //증감 할것이기 때문에 변수 i를 정한다//1부터 증감 시작
			
			while(e <= input) {
				sum += e; //2를 넣는다고 가정하면 input에 2대입. e는 1이고 조건식이 true여서 sum =1이 되고 증감 시작
			              // 증감후 e는 2. 다시 조건식에 대입 하면 true. sum에 2를 대입하면 1 +2 =3.
						// 이후 증감후 식에 대입하면 false 탈출후 sum값 출력
				e++;
			
			}
			System.out.println("1부터" + input + "까지의 합은" + sum + "입니다");
			
		}else {
			System.out.println("1이상의 숫자 입력하세요");
		}
		
			
	}
	
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		//0이 입력되면 종료된다
		//이전에 입력한 정수를 합한다
		int input = 0;
		int sum = 0;
		
		//do  while문
		//> 최소 한번은 수행하는 반복문
		
		do {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			sum += input;// do 안의 내용 먼저 실행
						// 조건식 확인후 true면 문장 수행, false 면 종료한다
		} while(input != 0);
		
		System.out.println("합계:" + sum);
		
		
	}
	
					

}
