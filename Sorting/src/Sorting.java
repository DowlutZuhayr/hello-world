import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Sorting {
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare our keyboard
		Scanner key = new Scanner(System.in);
		String answer = " ";
		do {
		
		//declaring our variables that we will be using throughout
		int size = 0;
		int i = 0;
		int j = 0;
		int temp = 0; //temporary container
		int decision = 0;
		
		
		//ask the user the size of the array
		System.out.println("Enter array size: ");
		size = key.nextInt();
		int arr[] = new int[size];
		
		
		//ask the user to elements in the array
		System.out.println("Enter array elements: ");
		
		//filling the elements in the array
		for (i = 0; i <size; i++) {
			arr[i] = key.nextInt();
		}
		
		//asking the user which sorting option they want to use
		System.out.println("Which type of sorting you wish for?");
		System.out.println("Press 1 for selection sorting.");
		System.out.println("Press 2 for bubble sorting.");
		System.out.println("Press 3 for insertion sorting.");
		System.out.println("Press 4 for quick sort.");
		
		decision = key.nextInt();
		
		//validation 
		if(decision != 1 && decision != 2 && decision != 3 && decision != 4 ) {
			System.out.println("please select a proper sorting method.");
			
			
		}
		
		//decision they take
		if (decision == 1) {
			
		
		System.out.println("Sorting array using selection sorting technique");
		for (i = 0; i<size; i++ ) {
			for ( j = i+1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//displaying the array after sorting
		System.out.println("Now the array after sorting is:");
		for ( i = 0; i<size; i++) {
			System.out.println(arr[i] + " ");
		
		
		}	
		}
		
		if (decision == 2) {
			System.out.println("Sorting array using bubble sorting technique");
			for(i = 0; i < size-1; i++)
				for (j = 0; j < size - i - 1; j++)
					if (arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
			
			//displaying the array after sorting
			System.out.println("Now the array after sorting is: ");
			for (i = 0; i <size; i++) {
				System.out.println(arr[i] + " ");
			}
						
		}
		
		if (decision == 3) {
			System.out.println("Sorting array using insertion sorting technique");
			for ( i = 1; i < size; i++) {
				for (j = i; j > 0; j--) {
					if (arr[j] < arr[j-1]) {
						
						//swap with the smallest value
						temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
			}
			
			//displaying the array after sorting
			System.out.println("Now the array after sorting is:");
			for (i = 0 ; i <size; i++) {
				System.out.println(arr[i] + " ");
			}
		}
		
		if (decision == 4) { 
			
			System.out.println("Now the array after quick sorting is:");
			//quick sort 
			Sorting qs = new Sorting();
			qs.quickSort(arr, 0, arr.length-1);
			qs.printArray(arr);
			
			
		}
			
		//asking the user if he/she wants to try again	
		System.out.println("Do you wish to start again? (y/n): ");
		answer = key.next();

	
		}
		while (answer.equals("y"));
		System.out.println("Program Exit");
	}

	
	// CREATING THE FUNCTIONS OF QUICK SORT .
	// PARTITION TO MOVE THE PIVOT AND CREATE THE TWO SEPARATE ARRAYS. 
	// TAKING THE MIDDLE ELEMENT AS PIVOT . SO THE MIDDLE ELEMENT NEEDS TO PIVOT
	
	int partition(int arr[], int low, int high) { //create the partition in the array
		int pivot = arr[(low+high)/2]; // taking the pivot as the middle element in the array
		
		while(low <= high) {    //until high value is less or equal
			
			while(arr[low] < pivot) {
				low++;
			}
			
			while (arr[high] > pivot) {
				high--;
			}
			
			if ( low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	
	void quickSort(int[] arr, int low, int high) {  // once partition logic has been applied , the array is in two parts
		
				// now we should sort the two lists in their proper way. again by taking the three arguments.
		
		int pi = partition(arr, low, high);
		
		if(low < pi-1) {
			quickSort(arr, low, pi-1); //recursion left hand side
		}
		if(pi < high) {
			quickSort(arr, pi, high); //recursion right hand side
		}
	}
	
	void printArray(int[] arr) {   //function to print the array in sorted way
		for(int i:arr) {
			System.out.println(i + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

