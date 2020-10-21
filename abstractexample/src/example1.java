import java.util.Scanner;

public  class example1 {
	
	Scanner key = new Scanner(System.in);
	
	private String name;
	private char gender;
	private int age;
	
	public example1() {
		this.name = null;
		this.gender = ' ';
		this.age = 0;
	}
	
	public example1(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		System.out.println("Enter name: ");
		name = key.next();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		System.out.println("Please enter gender: ");
		gender = key.next().charAt(0);
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		System.out.println("Enter age: ");
		age = key.nextInt();
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}

