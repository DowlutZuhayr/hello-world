import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class HumanResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		String nid, name, sid, course, responsibleParty, speciality, academy ;
		double height, weight, hoursWorked, rate;
		
		
		System.out.println("Please enter the nid of student: ");
		nid = key.next();
		
		System.out.println("Please enter the name of student: ");
		name = key.next();
		
		System.out.println("Please enter the height of student: ");
		height = key.nextDouble();
		
		System.out.println("Please enter the weight of student: ");
		weight = key.nextDouble();
		
		System.out.println("Please enter the sid of student: ");
		sid = key.next();
		
		System.out.println("Please enter the course of student: ");
		course = key.next();
		
		System.out.println("Please enter the responsible party of student: ");
		responsibleParty = key.next();
		
		Student John = new Student(nid, name, height, weight, sid, course, responsibleParty);
		
		System.out.println(John.toString());
		
		/****************************************************/
		
		System.out.println("Please enter the nid of lecturer: ");
		nid = key.next();
		
		System.out.println("Please enter the name of lecturer: ");
		name = key.next();
		
		System.out.println("Please enter the height of lecturer: ");
		height = key.nextDouble();
		
		System.out.println("Please enter the weight of lecturer: ");
		weight = key.nextDouble();
		
		System.out.println("Please enter speciality of lecturer");
		speciality = key.next();
		
		System.out.println("Please enter academy of lecturer: ");
		academy = key.next();
		
		System.out.println("Please enter hours worked by lecturer:");
		hoursWorked = key.nextDouble();
		
		System.out.println("Please enter rate :");
		rate = key.nextDouble();
		
		Lecturer zoubeir = new Lecturer (nid, name, height, weight, speciality, academy, hoursWorked, rate );
		
		System.out.println("The salary of " + name + " is " + zoubeir.calculateSalary(hoursWorked, rate) );
		
		System.out.println(zoubeir.toString());
	}
	

}
