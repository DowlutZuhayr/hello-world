import java.util.Scanner;
import java.util.Arrays;

public class Campus extends members {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//keyboard
		Scanner key = new Scanner(System.in);
		
		//variables
		String name, address, studid, rollno, lecturerid, examinerid, choice = null;
		int age, telephone, size, i, j = 0;
		char gender = ' ';
		boolean fulltime;
		
		
		//create the objects , one for members, pupils and lecturers
		members storage = new members();
		Pupils classes = new Pupils();
		lecturer records = new lecturer();
		
		//create the array to store 
		System.out.println("Number of Records to be created: ");
		size = key.nextInt();
		members[] database = new members[size];
		
		//ask whom to enroll
		
		System.out.println("Enrollment type: ");
		choice = key.next();
		
		//if conditions to choose 
		
		if (choice.equalsIgnoreCase("student")) {
			
			//for loop goes here
			
			for (i = 0; i < size; i++) {
				
				
				System.out.println("Enter name:");
				name = key.next();
				key.nextLine();
				classes.getName();
				
				System.out.println("Enter address: ");
				address = key.next();
				key.nextLine();
				classes.getAddress();
				
				System.out.println("Enter age: ");
				age = key.nextInt();
				classes.getAge();
				
				System.out.println("Fulltime?");
				fulltime = key.nextBoolean();
				classes.getFulltime();
				
				System.out.println("Gender: ");
				gender = key.next().charAt(0);
				classes.getGender();
				
				System.out.println("Enter student ID: ");
				studid = key.next();
				classes.getStudid();
				
				System.out.println("Enter roll number: ");
				rollno = key.next();
				classes.getRollno();
				
				System.out.println("Enter contant number: ");
				telephone = key.nextInt();
				classes.getTelephone();
				
				database[i] = new Pupils(name, address, age, telephone, gender, fulltime, studid, rollno);
				System.out.println(database[i].toString());
				
				
			}
			
		}
		
		if (choice.contentEquals("lecturer")) {
			
			//for loop goes here
			
			for (j = 0; j < size; j++) {
				
				
				System.out.println("Enter name:");
				name = key.next();
				records.getName();
				
				System.out.println("Enter address: ");
				address = key.next();
				records.getAddress();
				
				
				System.out.println("Enter age: ");
				age = key.nextInt();
				records.getAge();
				
				
				System.out.println("Fulltime?");
				fulltime = key.nextBoolean();
				records.getFulltime();
				
				
				System.out.println("Gender: ");
				gender = key.next().charAt(0);
				records.getGender();
				
				
				System.out.println("Enter lecturer ID: ");
				lecturerid = key.next();
				records.getLecturerid();
				
				
				System.out.println("Enter examiner ID: ");
				examinerid = key.next();
				records.getExaminerid();
				
				
				System.out.println("Enter contant number: ");
				telephone = key.nextInt();
				records.getTelephone();
				
				
				database[j] = new Pupils(name, address, age, telephone, gender, fulltime, lecturerid, examinerid);
				System.out.println(database[j].toString());
				
				
				
			}
			
			
		}
		
		//Displaying everything in the array 
		
		System.out.println(Arrays.deepToString(database));
		
		
		
		
		
		
		

	}

}
