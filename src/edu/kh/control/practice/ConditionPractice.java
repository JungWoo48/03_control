package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0 && input % 2 ==0) {
			result = "짝수 입니다.";
		} else if(input > 0 && input % 2 !=0) {
			result = "홀수 입니다.";
		} else {
			result = "양수만 입력해주세요";
			
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		String result;
		
		int sum = kor + eng + math; 
		double avg = sum / 3.0;
		
		if((kor + math + eng) / 3 >= 60 && kor >= 40 && math >= 40 && eng >= 40) {
			System.out.printf("국어 : " + kor + "\n" + "수학 : " + math + "\n" +
					"영어 : " + eng + "\n" + "합계 : " + sum + "\n" + "평균 : " + avg + "\n" +
					"축하합니다, 합격입니다! ");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		
		switch(month) {
		
		case 2 : case 4 : case 6 : case 8 : case 10 : case 12 :
			System.out.printf(month +"월은 31일까지 있습니다." );	
		break;
		case 1 : case 3 : case 5 : case 7 : case 9 : case 11 : 
			System.out.printf(month +"월은 30일까지 있습니다." );
		break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		
		
		}
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double highet = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = (weight / (highet * highet));
		
		String result = null;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		} else if(bmi >= 23 && bmi < 25) {
			result = "과체중";
		} else if(bmi >= 25 && bmi < 30) {
			result = "비만";
		} else if(bmi > 30) {
			result = "고도비만";
		} 
		
		System.out.println(bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalt = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int assi = sc.nextInt();
		
		System.out.print("출석 횟수: ");
		int input = sc.nextInt();
		
		int sum
		
	}
}
