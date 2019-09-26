

/**
 * @author DELL PC
 *
 */
public class Person {
	
	private String nid;
	private String firstName;
	private String lastName;
	private char gender;
	private String dob;
	private double weight;
	
	private double height;
	
	/*constructors*/
	
	/**
	 * 
	 * Default constructor
	 */
	public Person() {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = null;
		this.gender = '-';
		this.height = 0.0;
		this.weight = 0.0;
	}
	
	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	
	public Person(String dob, double weight) {
		this.dob = dob;
		this.weight = weight;
	}
	
	/**
	 * overloaded 7 constructor
	 * @param nid of person
	 * @param firstName of person
	 * @param lastName of person
	 * @param gender of person
	 * @param dob of person
	 * @param weight of person
	 * @param height of person
	 */
	
	public Person(String nid, String firstName, String lastName, char gender,String dob, double weight, double height) {
		this.nid = nid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.weight = weight;
		this.height = height;
		
	}
	
	/* behaviours */
	/**
	 * 
	 * @return
	 */
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public String getNid() {
		return this.nid;
	}
	
	public char getGender() {
		return this.gender;
	}
	 
	public double getBmi() {
		/* convert height from cm to m*/
		
		return (weight / Math.pow((height/100), 2));
		
	}
	public String getDob() {
		return this.dob;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getheight() {
		return this.height;
		
	}
	
	/* setters */
	/**
	 * 
	 * @param nid of person
	 */
	
	public void setNid(String nid) {
		this.nid = nid;
	}
	/**
	 * 
	 * @param firstName of person
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @param lastName person
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 * @param gender person
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * 
	 * @param dob of person
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * 
	 * @param weight of person
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	
	}
	/**
	 * 
	 * @param height of person
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [nid=" + nid + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dob=" + dob + ", weight=" + weight + ", height=" + height + "]";
	}
	/**
	 * a method to compare if two Persons objects are the same based on their NID
	 * @param p is the other Person with whom we are trying to compare
	 * @return true if they are the same
	 */
	
	public boolean equals(Person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
