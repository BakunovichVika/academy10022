package by.academy.lesson1;

public class Cat {
	int age;
	String nickname;

	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}

	public void sleep() {
		System.out.println("Кот спит: " + nickname);

	}

	public void eat() {
		System.out.println("Кот ест: " + nickname);
	}

	public void grow(int addAge) {
		System.out.println("Кот вырос: " + addAge);
		this.age = age + addAge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void test () {
	}
	
	public void walk () {
		System.out.println("Кот гуляет");
		
	}
}