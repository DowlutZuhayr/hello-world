import java.math.*;
/**
 * 
 */

/**
 * @author Andish
 *
 */
@SuppressWarnings("unused")
public class person {
	/*static attributes*/
	private static int counter = 0;
	
	/* object attributes*/
	private String nid;
	private String firstName;
	private String lastName;
	
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	
	
	/*constructors*/
	
	/**
	 * Default constructor
	 */
	public person() {
		this.nid= null;
		this.firstName= null;
		this.lastName= null;
		this.dob= null;
		this.gender= '-';
		this.height= 0.0;
		this.weight= 0.0;
		
		setCounter(getCounter() + 1);//incrementing the count to track
	}
	
	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	public person(String dob, double weight) {
		this.dob= dob;
		this.weight= weight;
	}
	
	/**
	 * 
	 * @param nid of person
	 * @param firstName of person
	 * @param lastName of person
	 * @param dob of person
	 * @param gender of person
	 * @param height of person
	 * @param weight of person
	 */
	public person(String nid, String firstName, String lastName, String dob, char gender, double height, double weight) {
		this.nid= nid;
		this.firstName= firstName;
		this.lastName= lastName;
		this.dob= dob;
		this.gender= gender;
		this.height= height;
		this.weight= weight;
		
		setCounter(getCounter() + 1);//incrementing the count to track
	}
	/*behaviours*/
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public static double getBmi(double height, double weight) {
		//return ( (weight)/(height*height) );
		
		/*convert height from cm to m */
		return (weight / Math.pow( (height/100), 2));
    }
	
	public double calculateBmi() {
		return (this.weight / Math.pow( (this.height/100), 2));
	}
	public char getGender() {
		return this.gender;
	}
	
	public String getNid() {
		return this.nid;
	}
	
	public String getDob() {
		return this.dob;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	/*setters*/
	
	/**
	 * 
	 * @param nid of person
	 */
	public void setNid(String nid) {
		this.nid=nid;
	}
	
	/**
	 * 
	 * @param firstname of person
	 */
	public void setFirstname(String firstname) {
		this.firstName=firstname;
	}
	
	/**
	 * 
	 * @param lastname of person
	 */
	public void setLastname(String lastname) {
		this.lastName=lastname;
	}
	
	/**
	 * 
	 * @param dob of person
	 */
	public void setDob(String dob) {
		this.dob=dob;
	}
	
	/**
	 * 
	 * @param gender of person
	 */
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	/**
	 * 
	 * @param height of person
	 */
	public void setHeight(double height) {
		this.height=height;
	}
	
	/**
	 * 
	 * @param weight of person
	 */
	public void setWeight(double weight) {
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "person [nid=" + nid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", height=" + height + ", weight=" + weight + "]";
	}
	
	/**
	 * a method to compare if 2 persons objects are the same based on their NID
	 * @param p is the other person with whom we are trying to compare
	 * @return true if they are the same
	 */
	public boolean equals(person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public static void setCounter(int counter) {
		person.counter = counter;
	}

}
