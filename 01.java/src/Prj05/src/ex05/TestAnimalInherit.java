package ex05;

class Animal {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	static void work(Animal animal, String name) {
		animal.name = name;
		animal.eat();
		// animal이 Dog 타입에서 호출되었나?
		if (animal instanceof Dog) ((Dog) animal).bark();
		if (animal instanceof Cat) ((Cat) animal).meow();
		
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal {
	
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

public class TestAnimalInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog chu = new Dog();
		chu.name = "츄";
		chu.eat();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
	}

}
