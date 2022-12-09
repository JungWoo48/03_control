package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	//break문 : 자신이 포함된 가까운 반복문을 탈출하는 구문
	
	public void ex1() {
		//1부터 10까지  1씩 증가하며 출력하는 반복문 작성 (for)
		// 5를 출력하면 반복문 정지 (if)
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i + " ");
			if(i == 5) {
				break;//반목문 정지
				
			}
			
		}
		
	}
	
	public void ex2() {
		//0이 입력될때 까지 모든 정수의 합구하기
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			
			System.out.print("정수 입력: ");
			i = sc.nextInt();
			
			if(i == 0) {
				break;
			}
			sum += i;//누적
			
		}
		System.out.println("합계: " + sum);//출력 구문은 밖에 써주는것이 좋다
	}
	public void ex3() {
		//break 반복문을 바로 멈춤
		//continue 다음 반복으로 넘어감
		
		//3의 배수를 제외하고 1~10까지 출력
		for(int i = 1; 1 <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	public void ex4() {
		//1~100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고 증가값이 40이 되면 반복문을 멈춤
		
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {
				break;
			}
			if(i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
				
}
