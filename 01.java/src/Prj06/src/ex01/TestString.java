package ex01;

public class TestString {
	public static void main() {
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = new String("이순신");
		String name4 = new String("이순신");
		
		System.out.print("name1, name2 / ");
		compare(name1, name2);
		System.out.print("name3, name4 / ");
		compare(name3,name4);
		System.out.print("name1, name3 / ");
		compare(name1,name3);
		
		String name5 = "이순신";
		String name6 = "이이";
		
		if (name5.compareTo(name6) > 0 ) {
			System.out.println("이순신이 크다");
		} else {
			if (name5.compareTo(name6) == 0) {
				System.out.println("이순신 == 이이");
			} else {
				System.out.println("이이가 크다");
			}
		}
		
	}
	public static void compare(String str1, String str2) {
		System.out.print("str1==str2 : ");
		if (str1 == str2)
			System.out.print("같은 이름");
		else
			System.out.print("다른 이름");
		System.out.print(" / str1.equals(str2) : ");
		if (str1.equals(str2))
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
	}
}
