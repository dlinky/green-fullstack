package ex04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class FuncTest2 {
	static String name;
	static int bYear;
	static String phone;
	static String man;
	static String gender;
	static int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		process();
		output();
	}

	private static void input() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름              : ");
		name = in.nextLine();
		System.out.print("전화번호           : ");
		phone = in.nextLine();
		System.out.print("성별(1:남자 2:여자) : ");
		man = in.nextLine();
		System.out.print("탄생년도(4자리)     : ");
		bYear = in.nextInt();
		
		in.close();
	}

	private static void process() {
		// TODO Auto-generated method stub
		gender = man.equals("1")?"남자":"여자";
		age = getAge(bYear);
				
	}

	private static int getAge(int bYear) {
		// TODO Auto-generated method stub
		return LocalDateTime.now().getYear() - bYear;
	}

	private static void output() {
		// TODO Auto-generated method stub
		System.out.println("이름   전화   성별   나이");
		System.out.printf("%s     %s    %s    %d",
						   name,  phone,gender,  age
						   );
	}

}
