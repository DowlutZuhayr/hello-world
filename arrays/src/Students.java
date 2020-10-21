import java.util.Scanner;

public class Students {
	
		Scanner key = new Scanner(System.in);
	
		private String name;
		private String id;
		private int studentid;
		
		public Students() {
			this.name = null;
			this.id = null;
			this.studentid = 0;
		}
		
		public Students(String name, String id, int studentid) {
			this.name = name;
			this.id = id;
			this.studentid = studentid;
		}
		
		public String getName() {
			return this.name;
			
		}
		
		public String getId() {
			return this.id;
		}
		
		public int getStudentId() {
			
			return this.studentid;
		}

		public String toString() {
			return "Students [Name=" + name
					+ ", ID =" + id + ", StudentID =" + studentid + "]";
		
		}

		
		
		
		
		
}




