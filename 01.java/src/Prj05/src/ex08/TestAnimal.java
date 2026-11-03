package ex08;

abstract class Animal {
	String name;
	
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	abstract void sound();
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println(name + "(이)가 야옹");
	}

}

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.name = "나비";
		cat.sound();
		work(cat, "나비");
	}

	private static void work(Animal animal, String name) {
		// TODO Auto-generated method stub
		animal.name = name;
		animal.eat();
		animal.sound();
	}

}
