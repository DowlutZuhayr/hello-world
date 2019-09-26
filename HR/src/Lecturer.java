/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Lecturer extends Person {
	// define attributes
	private String speciality;
	private String academy;
	private double hoursWorked;
	private double rate;

	/**
	 * Default constructor
	 */
	public Lecturer() {
		super(); //calling the default constructor from parent class
		
		// TODO Auto-generated constructor stub
		this.speciality = null;
		this.academy = null;
		this.hoursWorked = 0.0;
		this.rate = 0.0;
	}

	/**
	 * 7 overloaded constructors
	 * @param nid of Lecturer
	 * @param name of Lecturer
	 * @param height of Lecturer
	 * @param weight of Lecturer
	 * @param speciality of Lecturer
	 * @param academy of Lecturer
	 * @param hoursWorked by Lecturer
	 * @param rate of Lecturer
	 */
	public Lecturer(String nid, String name, double height, double weight, String speciality, String academy, double hoursWorked, double rate) {
		super(nid, name, height, weight);
		
		// TODO Auto-generated constructor stub
		
		this.speciality = speciality;
		this.academy = academy;
		this.hoursWorked = hoursWorked;
		this.rate = rate;
	}
	
	
	

	/**
	 * @return the speciality of Lecturer
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return the academy of Lecturer
	 */
	public String getAcademy() {
		return academy;
	}

	/**
	 * @param academy the academy to set
	 */
	public void setAcademy(String academy) {
		this.academy = academy;
	}

	/**
	 * @return the hoursWorked by Lecturer
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * @return the rate of Lecturer
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	
	@Override
	public String toString() {
		return "This is a Lecturer [Name of Lecturer : " + super.getName() + ". NID of lecturer is : " + super.getNid() + " . The height of lecturer is : " 
				+ super.height() + " . The weight of lecturer is :  " + super.weight() + " . The speciality is : " + this.speciality + " . The name of the academy is " 
				+ this.academy + " . Hours worked by lecturer is : " + this.hoursWorked + " . The rate is : " + this.rate + ".";
	}


	

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		double salary = hoursWorked * rate;
		double tax = 0.15 * salary; 
		
		return (salary - tax);
	}

}
