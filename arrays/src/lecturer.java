
public class lecturer extends members {
	
	private String lecturerid;
	private String examinerid;
	
	public lecturer() {
		this.lecturerid = null;
		this.examinerid = null;
	}
	
	public lecturer(String name, String address, int age, int telephone, char gender, boolean fulltime, String lecturerid, String examinerid) {
		this.lecturerid = lecturerid;
		this.examinerid = examinerid;
		this.name = name;
		this.age = age;
		this.telephone = telephone;
		this.gender = gender;
		this.address = address;
		this.fulltime = fulltime;
	}
	
	public String getLecturerid() {
		return this.lecturerid;
	}
	
	public String getExaminerid() {
		return this.examinerid;
	}

	@Override
	public String toString() {
		return "lecturer [lecturerid=" + lecturerid + ", examinerid=" + examinerid + ", Lecturerid()="
				+ getLecturerid() + ", Examinerid()=" + getExaminerid() + ", Name()=" + getName()
				+ ", Address()=" + getAddress() + ", Gender()=" + getGender() + ", Age()=" + getAge()
				+ ", Telephone()=" + getTelephone() + ", Fulltime()=" + getFulltime() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	

}
