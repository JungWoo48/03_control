package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	
	
	public void pr1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			for(int i = 1; i <= input; i++)
				System.out.print(i + "\s");
				
		}else { System.out.println("1이상의 숫자를 입력");
		
		}
		
	}
	public void pr2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

			
			if(input >= 1) {
				for(int i = input; i > 0; i--)
				System.out.print(i + "\s");
				
				
			} else {
				System.out.println("1이상의 숫자를 입력");
			
			}
	
		
	}	
	
	public void pr3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= input; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void pr4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int input = sc.nextInt();
		
		System.out.print("두번쨰 숫자 : ");
		int input2 = sc.nextInt();
		
		for(int i = input2; i < input; i++ )
			

			if(i > 0) {
				
				System.out.print(i);
			} else { 
				System.out.print("1이상의 숫자를 입력해주세요");
			}
				
			
			
		
	}
	
	
	public void pr5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		 
		System.out.print("===== "  + input + "단 =======");
		 for(int i2 = 1; i2 <= 9; i2++ ) {
				int i = input;
				
				System.out.println();
				System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
				System.out.println();
			}

		
	}
	public void pr6 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input > 1 && input < 10) {
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.println("===== " + i + "단 =====");
				
				for(int i2 = 1; i2 <=9; i2++) {
					System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
				}
			}	System.out.println();
		} else {
			System.out.println("2~9 사이의 숫자를 입력하세요");
		}
					

		
	
	}
	
	public void pr7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {//행 가로
			
			for(int col = 1; col <= row; col++) //열 세로
			System.out.print("*");
			System.out.println();
			
		}
		
		
	}
	public void pr8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = input; row > 0; row--) {
			
			for(int col = row; col > 0; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}
	public void pr9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
					 
		for(int row = 1; row <= input; row++) {//행렬
			//1회전. 1< =4
			//2회전 2 <=4
			//3회전 3 <= 4
			//
			for(int col = 1; col <= input; col++) {
				//1회전 1<= 4 -2
				//2회전 2 <= 4 -2
				//3회전 3 <= 4 -2
				
				if(col <= input - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
	public void pr10() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input*2-1; row++) {//행
			if(row < input) {
				for(int col =1; col <=row; col++) {//row가 input 보다 작으면 증가
					System.out.print("*");
				}
			}else {
				for(int col = input; col > row-input; col--) {//row가 input보다 크면 감소
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	public void pr11() {
		//
		//		  *
		//		 ***
		//		*****
		//	   *******  //마지막줄은 항상 *2 -1 값이다
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input *2 -1; col++) {
				//마지막줄의 별 개수 == input *2-1값
				
				if( input - row >= col || input + row <= col) { //     row  col  || row col
					System.out.print(" ");						//   4-1 >= 1	|| 4+1 <= 1 true
				}else {
					System.out.print("*");					    //   4-1 >= 2   || 4+1 <= 2 true 
				}
			}	System.out.println();												//   4-1 >= 3	|| 4+1 <= 3 true
			
			
		}
	
	}
	
	public void pr12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
			
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				
				if(row == 1 || row == input || col == 1 || col == input) {// 이 경우를 제외하면 빈공간으로 만든다
					System.out.print("*");

			}else {
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
		
	}
		
	}
	public void pr13() {
		//공배수 구하기
		//조건1 2,3의 배수인 경우 출력 == 2나 3으로 나누어서 0
		//조건2 2와 3의 공배수 == 2로도 나누어지고 3으로도 나누어진다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || 1 % 3 == 0) {
				System.out.print(i + " "); //이 if문은 2와 3의 배수를 찾는건
			
				if(i % 2 == 0 && i % 3 == 0) {// 이 if문은 공배수를 찾는것
					count++;
				}
			
			}
		}
		
		System.out.println("\ncount: " + count);//for문 밖에서 출력
	}
	

}




