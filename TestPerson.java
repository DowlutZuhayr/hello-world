import java.util.Scanner;
import java.math.*;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("No of persons in register is: " + person.getCounter());
		
		String inputNid, inputFirstname, inputLastname, inputDob;
		char inputGender;
		double inputWeight, inputHeight;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter height: ");
		inputHeight = keyboard.nextDouble();
		
		System.out.println("Please enter weight: ");
		inputWeight = keyboard.nextDouble();
		
		System.out.println("Your BMI is: " + person.getBmi(inputHeight, inputWeight));
		
		
		/*create a first Person object*/
		person p1 = new person();//using default constructor
		
		System.out.println("No of persons in register is: " + person.getCounter());
		
		System.out.println(p1.toString());//display a string representation of person p1
		
		p1.setFirstname("John");//change the name of person p1
		
		System.out.println(p1.toString());//display a string representation of person p1
		
		p1.setHeight(170.50);//change the height of person p1
		
		System.out.println("Height of "+ p1.getFirstName() + " is: " + p1.getHeight());
		
		p1.setNid("L1234");
		
		/*************************************************************************************/
		
		/*creating another object of type Person*/
		person p2 = new person("16/08/19", 2.5);//using overloaded 2 args constructor
		
		System.out.println("No of persons in register is: " + person.getCounter());
		
		p2.setFirstname("Sara");
		p2.setHeight(35.2);
		p2.setNid("W56789");
		
		System.out.println("Height of " + p2.getFirstName() + " is: " + p2.getHeight());
		
		/*************************************************************************************/
		
		person p3 = new person("B010282007007B", "James", "Bond", "01/02/82", 'M', 190.70, 85.4);
		
		System.out.println("No of persons in register is: " + person.getCounter());
		
		System.out.println(p3.toString());//display the string representation of p3
		
		System.out.println("Nid of " + p3.getName() + " is: " + p3.getNid());
		System.out.println("First Name is: " + p3.getFirstName());
		System.out.println("Last Name is: " + p3.getFirstName() + " is " + p3.getLastName());
		System.out.println("Gender is " + p3.getGender());
		System.out.println("Date of Birth is " + p3.getDob());
		System.out.println("Height and weight of " + p3.getFirstName() + " is " + p3.getHeight() + " and " + p3.getWeight());
		//System.out.println("BMI is: " + p3.getBmi());
		
		System.out.println(p3.toString()); // display the string representation of p3
		
		p3.setFirstname("Johnny");
		p3.setLastname("Break");
		p3.setNid("S5166498484");
		
		System.out.println(p3.toString());
		
		//updating weight of person p3
		p3.setWeight(200.05);
		
		//determining bmi of person p3
		System.out.println(p3.getName() + " ,after losing his role as James Bond who was 85.4kg, he is now " + p3.getWeight() + "kg");
		//System.out.println("His BMI was, now is " + p3.getBmi());
		
		/************************************************************************************************************************************/
		if (p2.equals(p3)) {
			System.out.println("Same person");
		}
		else {
			System.out.println("Diffrent person");
		}
		
		/************************************************************************************************************************************/
	    
		/*Scanner keyboard = new Scanner(System.in);
		int size = 0;
		int x = 0;
		int y = 0;
		String nid = " ";
		String firstName = " ";
		String lastName = " ";
		String dob = " ";
		char gender = ' ';
		double height = 0;
		double weight = 0;
	
		
		System.out.println("Enter array size:");
		size = keyboard.nextInt();
		person[] bdastudents = new person[size];
		
		for(x = 0; x < bdastudents.length; x++) {
			//ask user for the values of the person attribute
			System.out.println("Enter the NID of student " + (x+1));
			nid = keyboard.next();
			
			System.out.println("Enter the First name of student " + (x+1));
			firstName = keyboard.next();
			
			System.out.println("Enter the Last Name of student" + (x+1));
			lastName = keyboard.next();
			
			System.out.println("Enter the DOB of student" + (x+1));
			dob = keyboard.next();
			
			System.out.println("Enter the gender of student" + (x+1));
			gender = keyboard.next().charAt(0);
					
			System.out.println("Enter the height of student" + (x+1));
			height = keyboard.nextDouble();
			
			System.out.println("Enter the weight of student" + (x+1));
			weight = keyboard.nextDouble();
			
			//store in a variable
			
			
			//create person objects with the input values
			System.out.println("Enter number of students: " + (x+1));
			
			//save into array
			bdastudents[x] = new person();
			
		}	
		int x = 0;
		String nid = " ";
		String firstName = " ";
		String lastName = " ";
		String dob = " ";
		char gender = ' ';
		double height = 0;
		double weight = 0;
		
		 bdastudents[] = new person();
		
			for(x = 0;  x < bdastudents.length; x++) {
				double bmi1 = 0;
				System.out.println("The BMI of student " + (x+1) + bdastudents[1].calculateBmi());
				
				
			}*/
		

	}

}
