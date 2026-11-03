package ex09;

// class 다중상속
// 오리너구리 class = 오리 class + 너구리 class

interface Duck {
	void swim();
}

interface Racoon {
	void dig();
}

class DuckRacoon implements Duck, Racoon {
	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
	}
	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

public class TestDuckRacoon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
	}

}
