package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	
	/* for문
	 * - 끝이 정해져 있는(횟수가 정해진) 반복문
	 * -조건이 처음에 오기때문에 한번도 반복문이 수행되지 않을수 가 있다
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식;) {
	 * 		반복 수행될 코드
	 * }
	 * 
	 * - 초기식 : for문응 제어하는 용도의 변수 '선언'
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식 ( 보통 초기식에 사용된 변수를 조건식에 작성함)
	 * 
	 * - 증감식 : 초기식에 사용된 변수를 for문이 끝날떄마다 증감 or 감소 시켜
	 * 			조건식의 결과를 변하게 함
	 * 
	 */
	
	
	public void ex1() {
		// 1~ 10 출력하기
		for(int i = 1; i <= 10; i++) {
		  //1.초기식	   2.조건식  3.증감식 
			System.out.println("i:" + i);
			//3. 반복될 코드
			
			//for문의 순서 : 1.초기식을 확인 2. 조건식을 확인 3. 출력(후위증감이므로 출력후 증감) 4. 증감
			// 5. 증감된 값을 조건식에 대입 6. 조건 확인후 true면 출력 ...... false 까지 반복		
		}
	
	}
	
	public void ex2() {
		//3 에서 7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		
		for(int i = 3; i <=7; i++) {
			System.out.print(i +"\s" );
		}
		
	}
	
	public void ex3() {
		//1부터 입력 받은 수까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
		
		
	}
	
	public void ex4() {
		// 1.0부터 입력받은 실수 까지 0.5씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		double input = sc.nextDouble();
		
		for(double i = 1.0; i <= input; i += 0.5) { // i = i + 0.5
			System.out.println(i);
		}
		
		
	}
	public void ex5() {
		//영어 알파벳 A 부터 Z까지 한줄로 출력
		// char 자료형- 유니코드
		
		for(char i = 65; i <= 90; i++) {
			System.out.print(i);
		}
		
	}
	public void ex6() {
		//1 부터 10까지의 모든 정수의 합 구하기
		
		int sum = 0; //반복 되어 증감 되는 i값의 합계를 저장할 변수
						//0으로 시작하는 이유 : 아무것도 더하지 않아 정확히 결과를 도출할수 있기 떄문
		
		for(int i = 1; i <=10; i++ ) {
			sum += i; //sum = sum + i
			// 1.sum = 0 + 1 2. 증감 +1 3.sum= 1+ 2 4.증감 5. sum + 3 + 3....... 
		}
		System.out.println(sum);
		
		
		
	}
	public void ex7() {
		//1부터 20까지 1씩 증가하면 출력
		//단 5의 배수에는 ()를 붙여서 출력-조건문
		
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0) {
				System.out.print("(" + i + ")");
			} else {
				System.out.print(i + " ");
			}
			
		
		}
		
	
	}
	public void ex8() {
		//구구단 모두 출력하기
		
		
		for(int i = 2; i <= 9; i++) { //2-9단 까지 차례로 증가 //단
			for (int i2 = 1; i2 <= 9; i2++ ) {//각 단을 1-9까지 곱한다 //수
				System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
			}
			System.out.println(); //줄바꿈
		}
		
		
	}
	public void ex9() {
		//구구단 역순 출력
		//9단 에서 2단
		
		for(int i = 9; i >= 2; i--) {
			for (int i2 = 1; i2 <= 9; i2++ ) {
				System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
			}
			System.out.println();
		}
		
	}
	public void ex10() {
		//12345
		//12345
		//12345
		//12345
		//12345를 출력
		
		for(int i = 1; i <= 5; i++) {//5번 반복할것이다
			for(int i2 = 1; i2 <= 5; i2++)//5번의 반복은 각각 1-5로 커지는 구문이 들어갈것이다 
				
			System.out.print(i2);
			System.out.println();
		}
		
			
	}
	public void ex11() {
		//54321
		//54321
		//54321
		for(int i = 1; i <= 3; i++){//1. 3번반복할것이다.
			for(int i2 = 5; i2 >= 1; i2--)//2. 반복되는 3번은 각각 5-1로 줄어드는 구문이다.	
				
			System.out.print(i2);
			System.out.println();
		}
		
		
	}
	public void ex12() {
		//1
		//12
		//123
		//1234
		//=========
		//4321
		//321
		//21
		//1
		
		for(int x = 1; x <= 4; x++) {
			for(int y = 1; y <= x; y++) // x 와 y가 같다는 것이 핵심*
										//1. 1번문의 초기식 대입
										//2. 1번문의 조건식 에서 true
										//3. 1번식 조건문을 갖고 2번문 조건식으로 진입
										//4. 2번식 조건문에서 true	 
										//5. 2번식에서 증감
										//6. 증감이후 2번식에서 false
										//7. true 값 출력
										//7. 1번식으로 복귀
										//8. 증감
										//9. 증감값을 가지고 1번 조건에 대입
										//10. true면 다시 2번식으로 진입
										//11. 1번식에서 false가 나올때까지 반복 
				System.out.print(y);	
				System.out.println();
				
		
		}
		System.out.println("===============");
		{
		for(int x = 4; x >= 1; x--) {
			for(int y = x; y >= 1; y--)
					
				System.out.print(y);
				System.out.println();
				
			}
		
		}
	}
	
	
	
}
