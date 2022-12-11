package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	
	
	public void pr1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + "\s");
			
			if(i < 0) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}	
		
		
	}
	public void pr2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = input; i > 0; i--) {
			
			if(input >= 1) {
				System.out.print(i + "\s");
				
				
			} else {
				System.out.println("1이상의 숫자를 입력");
			
			}
	
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
		
		for(int i = input2; i < input; i++ ) {
			if(i > 0) {
				System.out.print(i);
			} else { 
				System.out.print("1이상의 숫자를 입력해주세요");
			}
				
			
			
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
		
		for(int i = input; i <= 9; i++) {
			for(int i2 = 1; i2 <= 9; i2++) {
				
				if(i > 1) {
					System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
					System.out.println();
					
				} else if(i < 10 ) {
					
				
				System.out.printf("%2d X %2d = %2d", i ,i2 , i * i2);
				System.out.println();
					}else {
						System.out.println("맞는 숫자를입력");
					}
				
			}
			
			
			}
		
		
	}
	
	public void pr7() {
		
		
		//감도 안옵니다 선생님
		
	}

}




