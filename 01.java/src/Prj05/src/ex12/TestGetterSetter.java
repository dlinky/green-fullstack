package ex12;

class Emp {
	private int eno;
	
	public void info() {
		System.out.printf("%d\n", eno);
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	
}

public class TestGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp();
		emp1.setEno(1);
	}

}
