/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Stationary {
	
	/*static attributes*/
	private static int counter = 0;
	
	private String stationaryNameId;
	private String name;
	private String colour;
	private String category;
	private int quantity;
	private double price;


	/**
	 * Default Constructors
	 */
	public Stationary() {
		
		// TODO Auto-generated constructor stub
		
		this.stationaryNameId = null;
		this.name = null;
		this.colour = null;
		this.category = null;
		this.quantity = 0;
		this.price = 0.0;
		
		setTotalItems(getTotalItems() + 1);//incrementing the count to track
	}
	/**
	 * overloaded 6 constructor
	 * @param stationaryNameId of Stationary
	 * @param name of Stationary
	 * @param colour of Stationary
	 * @param category of Stationary
	 * @param quantity of Stationary
	 * @param price of Stationary
	 */
	
	public Stationary(String stationaryNameId, String name, String colour,String category, int quantity, double price) {
		
		this.stationaryNameId = stationaryNameId;
		this.name = name;
		this.colour = colour;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		
		setTotalItems(getTotalItems() + 1);//incrementing the count to track
	}
	/* behaviours */
	
	/**
	 * @return the stationaryNameId
	 */
	public String getStationaryNameId() {
		return stationaryNameId;
	}
	/**
	 * @param stationaryNameId the stationaryNameId to set
	 */
	public void setStationaryNameId(String stationaryNameId) {
		this.stationaryNameId = stationaryNameId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * 
	 * @return category of Stationary
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * 
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * 
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public  String toString() {
		return "Stationary \n \n >StationaryNameId = " + this.getStationaryNameId()
				+ "\n >Name = " + this.getName() + "\n >Colour = " + this.getColour() + "\n >Category =  " + this.getCategory() + ",\n >Quantity = " + this.getQuantity()
				+ "\n >Price = " + this.getPrice() + "]";
	}
	/**
	 * method to compare if two stationaries are the same
	 * @param s is the other stationary with whom we are comparing
	 * @return true if they are the same
	 */
	public boolean equals(Stationary s ) {
		if(this.stationaryNameId.equalsIgnoreCase(s.stationaryNameId)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * @return the counter
	 */
	public static int getTotalItems() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public static void setTotalItems(int counter) {
		Stationary.counter = counter;
	}
	
	public String findItemByCat() {
		return(this.stationaryNameId + " " + this.name + " " + this.colour + " " + this.category + " " + this.quantity + " " + this.price + " ");
	}
	
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


