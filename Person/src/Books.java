/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Books {
	/* attributes */
	/**
	 * 
	 */
	private String isbn;
	private String title; 
	private String author;
	private int noPages;
	private boolean isElectronic;
	private double price;
	private double discount;
	private double sellingPrice;
	
	/*constructors*/
	/**
	 * Default constructor
	 */
	public Books() {
		
		this.isbn = null;
		this.title = null;
		this.author = null;
		this.noPages = ' ';
		this.isElectronic = (Boolean) null;
		this.price = 0.0;
		this.discount = 0.0;
		this.sellingPrice = 0.0;
		
		
	}
	public double calculateDiscount(double sellingPrice, double discount) {
		return(sellingPrice-(sellingPrice*(discount/100)));
	}
	/**
	 * overloaded 2 parameter constructor
	 * @param isbn of book
	 * @param author of book
	 */
	public Books(String isbn, String author) {
		this.isbn = isbn;
		this.author = author;
	}
	
	/**
	 * overloaded 7 constructor
	 * @param isbn of book
	 * @param title of book
	 * @param author of book
	 * @param noPages of book
	 * @param isElectronic of book
	 * @param price of book
	 */
	public Books(String isbn, String title, String author, int noPages, boolean isElectronic, double price) {
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.noPages = noPages;
		this.isElectronic = isElectronic;
		this.price = price;
	}
	
	/*Behaviours*/
	/*getters*/
	/*setters*/
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the noPages
	 */
	public int getNoPages() {
		return noPages;
	}

	/**
	 * @param noPages the noPages to set
	 */
	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}

	/**
	 * @return the isElectronic
	 */
	public boolean isElectronic() {
		return isElectronic;
	}

	/**
	 * @param isElectronic the isElectronic to set
	 */
	public void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
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
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", author=" + author + ", noPages=" + noPages
				+ ", isElectronic=" + isElectronic + ", price=" + price + ", getIsbn()=" + getIsbn() + ", getTitle()="
				+ getTitle() + ", getAuthor()=" + getAuthor() + ", getNoPages()=" + getNoPages() + ", isElectronic()="
				+ isElectronic() + ", getPrice()=" + getPrice() + "]";
	}
	
	
	
	
	

}
