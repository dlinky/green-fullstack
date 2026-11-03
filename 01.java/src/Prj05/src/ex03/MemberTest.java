package ex03;

/* RESCENE
원이 리브 미나미 메이 제나
2004 2006 2006 18 17 
리더 보컬 보컬 랩 보컬
*/

class GirlMember {
	String name;
	int bYear;
	String role;
	
	public GirlMember(String name, int bYear, String role) {
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	public void info() {
		System.out.printf("이름 : %s\n출생연도 : %d\n역할 : %s", name, bYear, role);
	}
}

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlMember [] rescArr = new GirlMember[5];
		rescArr[0] = new GirlMember("원이", 2004, "리더");
		rescArr[0].info();
	}

}
