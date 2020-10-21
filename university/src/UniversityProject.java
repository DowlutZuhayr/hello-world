import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL
 *
 */
public class UniversityProject extends Students {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 0;
		
		Scanner key = new Scanner(System.in);
		
		Students student = new Students();
		
		System.out.println(student.getName());
		
		System.out.println("START");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("How many students records you wish to enter in the file? ");
		i = key.nextInt();
		
		
		Students[] itemDatabase = new Students[i];
		
		for(j = 0; j < i; i++) {
			
			System.out.println(student.getName());
			System.out.println(student.getSurname());
			System.out.println(student.getGender());
			System.out.println(student.getAge());
			System.out.println(student.getAddress());
			System.out.println(student.getCountry());
			System.out.println(student.getTelno());
			System.out.println(student.getWeight());
			System.out.println(student.getHeight());
			
			itemDatabase[j] = new Students();
			
			System.out.println(itemDatabase[j].toString());
		}
		
		
		
		

	}

}
