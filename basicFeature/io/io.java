package basicFeature.io; // 패키지 선언

import java.util.Scanner;

public class io {
	public static void main(String args[]){
		// Scanner 인스턴스 생성
		Scanner input = new Scanner(System.in); 

		// Scanner 내부 method : nextDouble, nextInt ...
		double distance = input.nextDouble();

		System.out.println("distance : " + distance);
		
		int cc = 20; int yy = 19;
		System.out.println("CC : " + cc + "yy : " + yy);
		System.out.println("ADD: " + cc + yy + "!");
		System.out.println("MUL: " + cc * yy + "!");
		
		// 계행 문자를 만날 때 까지 문자를 읽고, 계행 문자를 포함하지 않음
		int age = Integer.parseInt(input.nextLine());
		
		System.out.println("waiting input age... : " + age);

		input.close(); // Scanner 객체 자원 해제
	}	
}
