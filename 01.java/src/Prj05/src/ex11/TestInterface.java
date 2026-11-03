package ex11;

interface Ipo {
	void input();
	void process();
	void output();
}

class Job implements Ipo {
	@Override
	public void input() {
		
	}
	public void process() {
		
	}
	public void output() {
		
	}
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job();
		job.input();
		job.process();
		job.output();
	}

}
