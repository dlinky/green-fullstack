import java.util.*;

class Car {
	// Fields
	String name = "";
	String color = "";
	int year = 0;
	
	// Methods
	void input() {
		// TODO Auto-generated method stub
		System.out.println("값을 입력하세요(차이름 색상 연도)");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		color = sc.next();
		year = Integer.parseInt(sc.next());
		sc.close();
	}

	void info() {
		// TODO Auto-generated method stub
		System.out.println("차이름 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("연도 : " + year);
	}
}

public class TestCar02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "아빠차";
		car1.color = "Black";
		car1.year = 2024;
		car1.info();
	}

}
