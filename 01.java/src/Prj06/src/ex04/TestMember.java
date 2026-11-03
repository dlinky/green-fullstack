package ex04;

import java.util.Objects;

class Member {
	// Fields
	private String name;
	private String phone;
	private int bYear;

	// Constructor
	public Member() {
	}
	public Member(String name, String phone, int bYear) {
		super();
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getbYear() {
		return bYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return Objects.equals(name, other.getName());
	}
}

public class TestMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] mArr = new Member[3];
		mArr[0] = new Member("강호동", "010-2222-3333", 1980);
		mArr[1] = new Member("서장훈", "010-2533-3343", 1982);
		mArr[2] = new Member("이수근", "010-2533-3343", 1983);
		
		// 이수근 정보 출력하기
		for (int i=0; i<mArr.length; i++) {
			if (mArr[i].getName().equals("이수근")) {
				System.out.println(mArr[i]);
			}
		}
		
	}

}
