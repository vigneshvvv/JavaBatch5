package BasicPractice;

import java.util.Arrays;

public class SampleTestng {
	
	public static void main(String[] arg) {
		int a = 10;
		int b = 20;
		String name = "sfdfafd";
		Boolean result = false;
		System.out.println(name);
		
		if(a == b) {
			System.out.println("both the a and b are same values");
		}else {
			System.out.println("No matching values");
		}
		
		
//		inserting value into array 
		int[] arr1 = new int[5];
		arr1[0] = 10;
		System.out.println(arr1[0]);
		
		int[] arr = new int[] {1,2,3,4,5,6};

		

//		For loop to rint all the elements in the array
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
//		while loop Example
		
		int capacity = arr.length;
		int index = 0;
		
		while(index < capacity) {
			System.out.println(arr[index]);
			index += 1;
		}
		
		
		int reverseIndex = arr.length-1;
		
		while(reverseIndex > -1) {
			System.out.println(arr[reverseIndex]);
			reverseIndex -= 1;
		}
		
//		reversing an array
		int[] arrReverse = new int[arr.length];
		int indexN = 0;
		int reverse = arr.length-1;
		
		while(reverse > -1) {
		 arrReverse[indexN] = arr[reverse];
		 indexN++;
		 reverse--;
		}
		
		System.out.println(Arrays.toString(arrReverse));
		
		
		//reversing an array without creating new array
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while(startIndex <= endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		
		
		System.out.println(Arrays.toString(arr));		
		

	}

}
