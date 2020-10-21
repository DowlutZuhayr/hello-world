import java.util.Arrays;
import java.util.Scanner;

public class arraysoop extends Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		
		int i = 0;
		String name, id;
		int studentid = 0;
		//Initializing keyboard
		Scanner key = new Scanner(System.in);
		
		//default value for size of the array
		System.out.println("How many records to create? \n>> ");
		int size = key.nextInt();
		
		Students details = new Students();
		
		Students[] record = new Students[size];
		
		for (i = 0; i < size; i++) {
			
			System.out.println("Enter name: ");
			name = key.next();
			details.getName();
			
			System.out.println("Enter id: ");
			id = key.next();
			details.getId();
			
			System.out.println("Enter student id: ");
			studentid = key.nextInt();
			details.getStudentId();
			
			record[i] = new Students(name, id, studentid);
			System.out.println(record[i].toString());
				
		}
		System.out.println(Arrays.deepToString(record));
	
		
		
		key.close();
		
		

	}

}
