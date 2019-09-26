/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Student extends Person {
	//define attributes
	private String sid;
	private String course;
	private String responsibleParty;

	/**
	 * Default constructor
	 */
	public Student() {
		/**
		 * 
		 */
		super(); // calling the default constructor from parent class
		
		// TODO Auto-generated constructor stub
		this.sid = null;
		this.course = null;
		this.responsibleParty = null;
		
	}
	

	/**
 	 * 7 overloaded constructor
	 * @param nid of Student
	 * @param name of Student
	 * @param height of Student
	 * @param weight of Student
	 * @param sid of Student
	 * @param course of Student
	 * @param responsibleParty of Student
	 */
	public Student(String nid, String name, double height, double weight, String sid, String course, String responsibleParty) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.course = course;
		this.responsibleParty = responsibleParty;
	}
	

	/**
	 * @return the sid of Student
	 */
	public String getSid() {
		return sid;
	}


	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}


	/**
	 * @return the course of Student
	 */
	public String getCourse() {
		return course;
	}


	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}


	/**
	 * @return the responsibleParty of Student
	 */
	public String getResponsibleParty() {
		return responsibleParty;
	}
	
	
	/**
	 * @param responsibleParty the responsibleParty to set
	 */
	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}


	@Override
	public String toString() {
		return "This is a student [Name of Student is :" + super.getName() + " and the NID is " + super.getNid() +
				" . The height of student is " + super.height() + " and the weight of student is " + super.weight() + " . The sid of the student is " 
				+ this.getSid() + " . The course name is " + this.getCourse() + " and the responsible party is " + this.getResponsibleParty(); 
		
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
