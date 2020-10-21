
public class extending1 extends example1 {
	
	private String surname;
	private double height;
	
	public extending1(){
		this.surname = null;
		this.height = 0.0;
		
	}
	
	public extending1(String surname, double height) {
		this.surname = surname;
		this.height = height;
	}
	
	public String getSurname() {
		System.out.println("Enter surname: ");
		surname = key.next();
		return surname;
	}
	
	public double getHeight() {
		System.out.println("Enter height: ");
		height = key.nextDouble();
		return height;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

}
