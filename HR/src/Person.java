/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public abstract class Person {
	//attributes
	private String nid;
	private String name;
	private double height;
	private double weight;

	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
		//default constructor
	    /**
	     * Default Constructor with values initialised to default
	     */
		this.nid = null;
	    this.name = null;
	    this.height = 0.0;
	    this.weight = 0.0;
		
		
	}
	/**
	 * overloaded 4 parameter constructor
	 * @param nid of Person
	 * @param name of Person
	 * @param height of Person
	 * @param weight of Person
	 */
	public Person(String nid, String name, double height, double weight) {
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	/* behaviours*/
	/**
	 * 
	 * @return
	 */
	public String getNid() {
		return this.nid;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double height() {
		return this.height;
	}
	public double weight() {
		return this.weight;
	}
	
	
	
	
	
	
	/*setters*/
	/**
	 * 
	 * @param nid
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * calculate BMI of Person
	 * @return BMI
	 */
	public double calculateBmi() {
		return(this.weight / Math.pow(height/100, 2));
	}
	
	/**
	 * compare if two persons are the same
	 * @param p is the person with whom we are comparing
	 * @return true if both persons have the same nid
	 */
	public boolean equals(Person p ) {
		if(this.nid.equalsIgnoreCase(p.nid)){
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public abstract String toString();
	
	
	/**
	 * calculate salary of person based on hours worked and rate per hour
	 * @param hoursWorked per month
	 * @param rate per hour
	 * @return salary per month
	 */
	public abstract double calculateSalary(double hoursWorked, double rate);
	
}


















