package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"C","O","A","S","T"};
		//2. print the third element in the array
		System.out.println(array[3]);
		//3. set the third element to a different value
		array[3] = "s";
		//4. print the third element again
		System.out.println(array[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);		
		}

		
		//6. make an array of 50 integers
		/*int[] veryLong = new int[50];
		
		for (int i = 0; i < veryLong.length; i++) {
		    int rand = new Random().nextInt(256);
			veryLong[i] = rand;
			System.out.println(veryLong[i]);
		}
		int lowest = 256;
		java.util.Arrays.sort(veryLong);
		for (int i = 0; i < veryLong.length; i++) {
			
			if (veryLong[i]<lowest) {
				lowest = veryLong[i];
			}
		}
		System.out.println(lowest);*/ 
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		int[] veryLong2 = new int[50];

		for (int i = 0; i < veryLong2.length; i++) {
		    int rand = new Random().nextInt(256);
			veryLong2[i] = rand;
			//System.out.println(veryLong2[i]);
		}
		int highest = 0;
		java.util.Arrays.sort(veryLong2);
		for (int i = 0; i < veryLong2.length; i++) {
			System.out.println(veryLong2[i]);
		}
		for (int i = 0; i < veryLong2.length; i++) {
			
			if (veryLong2[i]>highest) {
				highest = veryLong2[i];
			}
		}
		System.out.println(highest);
		//10. print the largest number in the array.
	}
}
