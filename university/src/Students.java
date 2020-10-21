import java.util.Scanner;


public class Students {
	
	Scanner key = new Scanner(System.in);
	
	//attributes
	private String name;
	private String surname;
	private char gender;
	private int age;
	private String address;
	private String country;
	private int telno;
	private double height;
	private double weight;
	
	public Students(){
		
		
		//constructors
		this.name = null;
		this.surname = null;
		this.gender = ' ';
		this.age = 0;
		this.address = null;
		this.country = null;
		this.telno = 0;
		this.height = 0.0;
		this.weight = 0.0;
		
	}
	/**
	 * 
	 * @param name of student
	 * @param surname of student
	 * @param gender of student
	 * @param age of student
	 * @param address of student
	 * @param country of student
	 * @param telno of student
	 * @param height of student
	 * @param weight of student
	 */
	public Students(String name, String surname, char gender, int age, String address, String country, int telno, double height, double weight) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.country = country;
		this.telno = telno;
		this.height = height;
		this.weight = weight;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		System.out.print("Please enter your name: ");
		name = key.next();
		
		
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		System.out.println("Please enter your surname");
		surname = key.next();
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		System.out.println("Please enter your gender if applicable: ");
		gender = key.next().charAt(0);
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		System.out.println("Please enter your age: ");
		age = key.nextInt();
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		System.out.println("Enter your address: ");
		address = key.next();
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		System.out.println("The country of residence: ");
		country = key.next();
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the telno
	 */
	public int getTelno() {
		System.out.println("Enter the telephone number: ");
		telno = key.nextInt();
		return telno;
	}
	/**
	 * @param telno the telno to set
	 */
	public void setTelno(int telno) {
		this.telno = telno;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		System.out.println("The height of the student: ");
		height = key.nextDouble();
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		System.out.println("Enter the weight of the student if available: ");
		weight = key.nextDouble();
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
		
		
		
	}
	@Override
	public String toString() {
		return "Students [key=" + key + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", age="
				+ age + ", address=" + address + ", country=" + country + ", telno=" + telno + ", height=" + height
				+ ", weight=" + weight + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getCountry()=" + getCountry() + ", getTelno()=" + getTelno() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
