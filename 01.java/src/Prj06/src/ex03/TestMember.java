package ex03;

import java.util.*;

class Member {
	// Fields
	private String name;
	private String phone;
	
	// Constructor
	public Member() {
		
	}
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	// Getter / Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Method
	public void info() {
		System.out.println("이름:" + name + ", 전화:" + phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return true;
		if (getClass() != obj.getClass()) return false;
		
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone,  other.phone);
	}
}

public class TestMember {
	public static void main() {
		Member m1 = new Member("손흥민", "010-1111-1111");
		Member m2 = new Member("안정환", "010-1111-2222");
		Member m3 = new Member("차범근", "010-1111-2632");
		m1.info();
		m2.info();
		m3.info();
		
		System.out.println("=============");
		System.out.println(m1); // ex03.Member@58644d46
		System.out.println(m1.toString()); // ex03.Member@58644d46
		System.out.println(m1.hashCode()); // 1482968390 = 메모리주소 십진수
		System.out.println(m1.getClass()); // class ex03.Member
		
		System.out.println(m1.equals(m2));
	}
}
