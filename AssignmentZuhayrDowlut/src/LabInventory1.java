import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class LabInventory1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring keyboard input
				Scanner key = new Scanner(System.in);
				
				//declaring variables
				int z = 0;
				int i = 0;
				int j = 0;
				int choice1 = 0;
				int decision = 0;
				int size = 5;
				int quantity = 0;
				String stationaryNameId = " ";  String name = " "; String colour = " "; String attribute = " ";
				String category = " ";
				double price = 0.0;
				final String PASSWORD = "DitProg123"; 
				String identify = " ";
				
				
				// welcoming message
				System.out.println("Welcome to Stationary Store! ");
				
				//how many items can be stored in the inventory
				System.out.println("The store have a maximum capacity of 5 items. ");
				
				//creating an empty array with capacity of 5
				Stationary[] itemDatabase = new Stationary[size];
				
				System.out.println("Fill out those the following:  ");
				
				
				for(i = 0; i<size-3; i++) {
					System.out.println("Stationary ID: ");
					stationaryNameId = key.next();
					
					System.out.println("Stationary Name: ");
					name = key.next();
					
					System.out.println("Stationary colour: ");
					colour = key.next();
					
					System.out.println("Stationary category: ");
					category = key.next();
					
					System.out.println("Stationary quantity: ");
					quantity = key.nextInt();
					
					System.out.println("Stationary price: ");
					price = key.nextDouble();
					
					itemDatabase [i] = new Stationary(stationaryNameId, name, colour, category, quantity, price);
					
					itemDatabase[i].setStationaryNameId(stationaryNameId);
					itemDatabase[i].setName(name);
					itemDatabase[i].setColour(colour);
					itemDatabase[i].setCategory(category);
					itemDatabase[i].setQuantity(quantity);
					itemDatabase[i].setPrice(price);
					
					System.out.println(itemDatabase[i].toString());
					
					
				}
				
				
		
				
					
				while (true) {
					
					
						System.out.println("What do you want to do? ");
						System.out.println(" ");
						System.out.println("    1 to add new Item to the inventory ");
						System.out.println("    2 to change information of an existing Item ");
						System.out.println("    3 to display all the Items with specified category ");
						System.out.println("    4 to display all Item to be re-ordered ");
						System.out.println("    5 to know number of Items currently in store ");
						System.out.println("    6 to quit ");
						System.out.println(" ");
						System.out.println("Enter your choice: ");
						decision = key.nextInt();
						
						
				/*************************************************************************************/
						
						
						if (decision == 1) {
							
							int attemp=0;
							
							for(attemp=0;attemp<=3;attemp=1) {
								
								System.out.println("Please enter the password");
								
								String pwrd = key.next();
								
								if(pwrd.equalsIgnoreCase(PASSWORD)){
									
									System.out.println("Please enter the name of the stationary from the list and its features");
									System.out.println("There are only 3 spaces left in the inventory");
									System.out.println("how many items you wish to add: 1, 2 or 3 : ");
									choice1 = key.nextInt();
									
									for(i=0; i < choice1 ; i++) {
										System.out.println("Enter the stationary id: ");
						 	        	 stationaryNameId  = key.next();
						 	        	 
						 	        	 System.out.println("Enter the stationary name: ");
						 	        	 name = key.next();
						 	        	 
						 	        	 System.out.println("Enter the stationary colour: ");
						 	        	 colour = key.next();
						 	        	 
						 	        	 System.out.println("Enter the category of the stationary: ");
						 	        	 category = key.next();
						 	        	 
						 	        	 System.out.println("Enter the quantity : ");
						 	        	 quantity = key.nextInt();
						 	        	  
						 	        	 System.out.println("Enter the price of the item: ");
						 	        	 price = key.nextDouble();
						 	        	 
						 	     
						 	        	itemDatabase [i] = new Stationary(stationaryNameId, name, colour, category, quantity, price);
										
										itemDatabase[i].setStationaryNameId(stationaryNameId);
										itemDatabase[i].setName(name);
										itemDatabase[i].setColour(colour);
										itemDatabase[i].setCategory(category);
										itemDatabase[i].setQuantity(quantity);
										itemDatabase[i].setPrice(price);
										
										System.out.println(itemDatabase[i].toString());
						 	        
									}
									
									
									System.out.println(" ");
									break;
									
								}
								
								
								else if(!pwrd.equalsIgnoreCase(PASSWORD)){
									System.out.println("You have enter incorrect password.Only "+ (3-(attemp)) + " attemps are left" );
									if(attemp==2) {
										continue;
									}
									
									
								else if(attemp==3) {
									System.out.println("Program detected suspicious activity and is terminating!");
									break;
									
									
									}
								}
							}
							
					}
			/******************************************************************************************/
						
						
						if (decision == 2) {
						
							
							System.out.println("which items do you wish to update\n Please Enter the stationary ID : ");
							identify = key.next();
							
							for(i = 0; i < size; i++) {
							String idselected = itemDatabase[i].getStationaryNameId();
							
							
							if (identify.equals(idselected)) {
								System.out.println("Which attribute would you like to change");
								attribute = key.next();
								
								
								if (attribute.equalsIgnoreCase("name")) { 
									
									System.out.println("Please enter updated name : ");
									name = key.next();
									itemDatabase[i].setName(name);
					
								}
							    if (attribute.equalsIgnoreCase("colour")) {
							    	System.out.println("Please enter updated colour");
							    	colour = key.next();
							    	itemDatabase[i].setColour(colour);
							    }
							    if(attribute.equalsIgnoreCase("category")) {
							    	System.out.println("Please enter updated category : ");
							    	category = key.next();
							    	itemDatabase[i].setCategory(category);
							    }
							    if (attribute.equalsIgnoreCase("quantity")) {
							    	System.out.println("Please enter updated quantity : ");
							    	quantity = key.nextInt();
							    	itemDatabase[i].setQuantity(quantity);
							   
							    }
							    if (attribute.equalsIgnoreCase("price")) {
							    	System.out.println("Please enter updated price : ");
							    	price = key.nextDouble();
							    	itemDatabase[i].setPrice(price);
							    }
							    
							    
							    System.out.println(itemDatabase[i].toString());
							    
				 	        	
							
							
								}
							}
						}
							
			/************************************************************************/
						
						
						if (decision == 3) {
							System.out.println("Please enter category of items you are looking for : ");
							String cat = key.next();
							
							for (int y = 0; y < size; y++) {
								
								String c = itemDatabase[y].getCategory();
								
							if (cat.equalsIgnoreCase(c)) {
								System.out.println(itemDatabase[y].findItemByCat());
								
						}
								
					}
						
									
				}
								
								
			/*************************************************************/			
						
						
						
						
						
						if (decision == 4)
						{
							if (itemDatabase[0].getQuantity() < 5) {
								System.out.println("Stationary item Id : " + itemDatabase[0].getStationaryNameId() + "\nName of item : " + itemDatabase[0].getName() 
										+ "\nQuantity : " + itemDatabase[0].getQuantity());
								System.out.println("There is not enough stock in Inventory. RE ORDER");
								
							}
							else {
								System.out.println("Stationary item Id : " + itemDatabase[0].getStationaryNameId() + "\nName of item : " + itemDatabase[0].getName() 
										+ "\nQuantity : " + itemDatabase[0].getQuantity());
								System.out.println("There is enough in the inventory. NO RE ORDER");
							}
							
							if (itemDatabase[1].getQuantity() < 15) {
								System.out.println("Stationary item Id : " + itemDatabase[1].getStationaryNameId() + "\nName of item : " + itemDatabase[1].getName() 
										+ "\nQuantity : " + itemDatabase[1].getQuantity());
								System.out.println("There is not enough stock in Inventory. RE ORDER NOW");
							}
							else {
								System.out.println("Stationary item Id : " + itemDatabase[1].getStationaryNameId() + "\nName of item : " + itemDatabase[1].getName() 
										+ "\nQuantity : " + itemDatabase[1].getQuantity());
								System.out.println("There is enough in the Inventory. NO RE ORDER");
							}
							
							
							
						
			/****************************************************************/			
						
						if (decision == 5) {
							System.out.println("Total items created : " + Stationary.getTotalItems());	
							
							
						}
						
			/*******************************************************************/			
						if (decision == 6) {
							System.out.println("Thank You");
							break;
						}
	
						
						
						

					}
				
					
				}
				
				}
}
					
					


				
				
				
	


