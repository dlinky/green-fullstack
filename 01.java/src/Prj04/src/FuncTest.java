/*
입력
번호 이름 국어 영어 수학
num, name, kor, eng, mat
1,안유진,90,80,70
2,카리나,100,90,90
3,장원영,100,100,100
4,닝닝,79,80,0

출력
번호 이름   총점 평균
num,name,tot, avg
1   안유진 240 80
*/

import java.util.Scanner;

public class FuncTest {
	// Field 전역변수
	// 입력
	private static int num;
	private static String name;
	private static int kor;
	private static int eng;
	private static int mat;
	
	// 출력
	private static int tot;
	private static int avg;
	
	// 메소드
	public static void main() {
		input();
		process();
		output();
		System.out.println("end .....");
		
	}
	
	// input
	private static void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("번호,이름,국어,영어,수학");
		String line = sc.nextLine();
		String [] li = line.split(","); // 문자열 -> 문자열 배열로 변환
		
		num = Integer.parseInt(li[0].trim());
		name = li[1];
		kor = Integer.parseInt(li[2].trim());
		eng = Integer.parseInt(li[3].trim());
		mat = Integer.parseInt(li[4].trim());
	}
	
	// process
	private static void process() {
		tot = kor + eng + mat;
		avg = (int) ((tot * 100 + 0.5) / 3 / 100.0); // int형으로 안전하게 변형
	}
	
	// output
	private static void output() {
		System.out.printf("%d %s %d %d\n", num, name, tot, avg);
}

}
