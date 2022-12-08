package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	//기능 정의
	
	public void ex1() {
		// if문
		// 조건식이 true일때만 내부코드를 수행
		/*
		 * 
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true일때 수행될 코드
		 * }
		 * 
		 * if else문 
		 * - 조선식 결과가 true면 if문이 수행
		 * false면 else문이 수행된다
		 * 
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true일때 수행될 코드
		 * } else {
		 * 		조건식이 false일때 수행될 코드
		 * }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다");
		} else {
			System.out.println("양수가 아니다");
		}
		
		/*if(input < 0) {
			System.out.println("양수가 아니다");
		}*/
				
	}
	
	public void ex2() {
		//홀짝 검사
		//입력 받은 값이 홀 짝 검사
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀짝 입력 : ");
		int input = sc.nextInt();
		
	    if(input % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	    
	}
	
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		// 사용자에게 온도를 받음
		System.out.print("온도 :");
		double temperature = sc.nextDouble();
		
		String season;
		//봄 3, 4, 5
		//여름 6, 7, 8
		//가을 9, 10, 11
		//겨울 12, 1, 2
		
		if(month == 3 || month == 4 || month ==5 ) {
			season = "봄";
		} else if( month >= 6 && month <= 8) {
			season = "여름";
			
			if(temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33) {
				season += " 폭염 주의보"; // 이미 season안에 여름이 들어있는것으로 계산
										// +=으로 여름에 폭염경보만 추가해준다
			} 
		
		
		} else if( month >= 9 && month <= 11) {
			season = "가을";
		} else if( month == 12 || month ==1 || month == 2) {
			season ="겨울";
			
			
			if(temperature <=5) {
				season += " 한파 주의보";
			} else if(temperature <= -5) {
				season += " 한파 경보";
			}
		} else {
			season = "해당하는 계절 없음";
		}
		
		System.out.println(season);
		
		
	}
	
	public void ex4() {
		//나이를 입력받아
		//13세 이하면 "어린이 입니다"
		//13세 초과 19세 이라면 : "청소년 입니다"
		//19세 초과시 : "성인입니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.print("어린이 입니다");	
		} else if(age > 13 && age <= 19) {
			System.out.print("청소년 입니다");
		} else if(age > 19) {
			System.out.print("성인입니다");
		}
		
	}
	public void ex5() {
		//점수 (100점 만점)을 입력받아
		//90점 이상 A
		//80점 이상 90점 미만 B
		//70점 이상 80점 미만 C 
		//60점 이상 70점 미만 D
		//60점 미만 F
		//0점 미만, 100점 초과 : "잘못 입력"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수(100점 만점) :");
		int score = sc.nextInt();
		
		String grade;//결과값은 if문 밖에 있어야 한다
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80 && score < 90) {
			grade = "B";
		} else if(score >= 70 && score < 80) {
			grade = "C";
		} else if(score >= 60 && score < 70) {
			grade = "D";
		} else if(score < 60) {
			grade = "F";
		}  else {
			grade = "잘못 입력하셨습니다";
		}
		
		System.out.println(grade);//결과값은 if문 밖에 있어야 한다
		
	}
	public void ex6() { 
		//놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 12세이상
		// 	   - 140.0 cm이상
		
		//나이를 0~100세 사이로 입력하지 않은 경우 : 나이를 잘못 입력
		//키를 0~250.0cm 사이로 입력하지 않은 경우 : 키를 잘못 입력
		// 입력 되자마자 검사를 진행하여 잘못될 경우 프로그램 종료
		
		//나이  O, 키 X 나이는 적절하나 키가 적절치 않음
		//나이  X, 키 O
		//나이  X, 키 X
		//나이  O, 키 O
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력");
		int age = sc.nextInt();
		
		String result; //결과값은 if문 밖에 있어야 한다
		
		if (age < 0 || age > 100) {
			result = "나이를 잘못 입력";
		} else { //나이 오류를 제외하고 else로 시작
			
			System.out.print("키 입력");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result = "키를 잘못 입력";
			} else { // 키 오류를 제외하고 시작
				
				if(age < 12 && height >= 140.0) { // 정상범주의 키와 나이를 조건과 비교 시작
					result = "키는 적절하나 나이는 적절치 않음";
				} else if(age >= 12 && height < 140.0) {//나이는 맞는데 키가 맞지 않음
					result = "나이는 적절하나 키가 적절치 않음";
				} else if(age < 12 && height < 140.0) {
					result = "나이와 키가 적절치 않음";
				} else {
					result = "탑승가능";
				}
			
			}
	
		
		}
		System.out.println(result);//결과값은 if문 밖에 있어야 한다
	}		
}