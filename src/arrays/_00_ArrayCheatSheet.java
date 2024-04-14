package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
//		String[] arrayOf5 = {"a", "b", "c", "d", "e"};
		
		//2. print the third element in the array
		
//		System.out.println(arrayOf5[3]);
		
		//3. set the third element to a different value
		
//		arrayOf5[3] = "L";
		
		//4. print the third element again
		
//		System.out.println(arrayOf5[3]);
		
		//5. use a for loop to print all the values in the array
		
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
//		for(int i = 0; i<arrayOf5.length; i++) {
//			System.out.println(arrayOf5[i]);
//		}
		
		Random rand = new Random();
		int arrayOf50[] = new int[50];
		int min = 30;
		int max = 0;



		//6. make an array of 50 integers
		for(int i = 0; i < arrayOf50.length; i++) {
			arrayOf50[i] = rand.nextInt(30);
			if(arrayOf50[i]>max) {
				max = arrayOf50[i];
			}
			if(arrayOf50[i]< min) {
				min = arrayOf50[i];
			}
			System.out.println("The maximum value is: " + max);
			System.out.println("The minimum value is: "+ min);
			


			
		}
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
