
public class Pupils extends members {
	
	private String studid;
	private String rollno;
	
	public Pupils() {
		this.studid = null;
		this.rollno = null;
	}
	
	public Pupils(String name, String address, int age, int telephone, char gender, boolean fulltime, String studid, String rollno) {
		this.studid = studid;
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.age = age;
		this.telephone = telephone;
		this.gender = gender;
		this.fulltime = fulltime;
	}
	
	public String getStudid() {
		return this.studid;
	}
	
	public String getRollno() {
		return this.rollno;
	}

	@Override
	public String toString() {
		return "Pupils [studid=" + studid + ", rollno=" + rollno + ", Studid()=" + getStudid() + ", Rollno()="
				+ getRollno() + ", Name()=" + getName() + ", Address()=" + getAddress() + ", Gender()="
				+ getGender() + ", Age()=" + getAge() + ", Telephone()=" + getTelephone() + ", Fulltime()="
				+ getFulltime() + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
	
	

}
