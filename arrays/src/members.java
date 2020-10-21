
public class members {
	
	
	//attributes
	
	protected String name;
	protected String address;
	protected char gender;
	protected int age;
	protected int telephone;
	protected boolean fulltime;
	
	//default constructor
	public members() {
		this.name = null;
		this.address = null;
		this.gender = ' ';
		this.age = 0;
		this.telephone = 0;
		this.fulltime = false;
	}
	
	//two overloaded constructor
	/**
	 * 
	 * @param name of members
	 * @param telephone of members
	 */
	public members(String name, int telephone) {
		
		
		this.name = name;
		this.telephone = telephone;
	}
	
	//overloaded constructor
	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param gender
	 * @param age
	 * @param telephone
	 * @param fulltime
	 */
	
	public members(String name, String address, char gender, int age, int telephone, boolean fulltime) {
		
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.telephone = telephone;
		this.fulltime = fulltime;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getTelephone() {
		return this.telephone;
	}
	
	public boolean getFulltime() {
		return this.fulltime;
	}
	
	public String toString() {
		return "Members [ name = " + name + " address = " + address + " gender = " 
				+ gender + " age = " + age + " telephone = " + telephone + " fulltime? " + 
				fulltime;
	}
	
	

	
	
	

}
