
public class extending2 extends example1 {
	
	private double weight;
	private String address;
	
	public extending2() {
		this.weight = 0.0;
		this.address = null;
	}
	
	public extending2(double weight, String address) {
		this.weight = weight;
		this.address = address;
	}
	
	/**
	 * 
	 * @return weight of person
	 */
	
	public double getWeight() {
		System.out.println("Enter weight: ");
		weight = key.nextDouble();
		return weight;
	}
	
	public String getAddress() {
		System.out.println("Enter address: ");
		address = key.next();
		return address;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
