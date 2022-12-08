package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0 && input % 2 ==0) {
			result = "짝수 입니다.";
		} else if(input > 0 && input % 2 !=0) {
			result = "홀수 입니다.";
		} else if(input < 0) {
			result = "양수만 입력해주세요";
			
			System.out.println(result);
		}
		
	}
	
}
