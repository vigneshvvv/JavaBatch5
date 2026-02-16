package BasicPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

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
		
		
		UserDetails user = new UserDetails();
		user.setSNo(1);
		user.setName("vignesh");
		user.setAge(25);
		user.setLastName("kumar");
		user.setWorkLocation("chennai");
		user.setRole("SW");
		System.out.println(user);
		System.out.println(user.getName());
		
		UserDetails user2 = new UserDetails();
		user2.setSNo(2);
		user2.setName("fsadfsdfdsfsdfds");
		user2.setAge(25);
		user2.setLastName("sfdsfsfsdfsdf");
		user2.setWorkLocation("chennai");
		user2.setRole("SW");
		System.out.println(user2);
		
		
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(10);
		listOfInt.add(20);
		listOfInt.add(1, 20);
		
		System.out.println(listOfInt);
		System.out.println( listOfInt.get(0));
		System.out.println( listOfInt.getFirst());
		System.out.println( listOfInt.getLast());
		System.out.println( listOfInt.size());
		
		
		//Array list to contain list of data's either Integer, String or Object
		List<UserDetails> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user2);
//		System.out.println(userList);
		
		
		//set doesn't allow duplicates
		Set<Integer> sampleSet = new HashSet<>();
		sampleSet.add(10);
		sampleSet.add(20);
		sampleSet.add(10);
		
		System.out.println(sampleSet);
		
		
		//Ascending Queue will always stores min element at the top
		PriorityQueue<Integer>  queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(1);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		
		//Desc Queue to store the max element on the top always
		PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());
		reverseQueue.add(5);
		reverseQueue.add(1);
		reverseQueue.add(3);
		reverseQueue.add(4);
		
		System.out.println(reverseQueue.peek());
		System.out.println(reverseQueue.poll());
		System.out.println(reverseQueue.peek());
		
		
		//same as list but memory stored
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(8);
		System.out.println(linkedList);
		
		
		//to store key value pair 
		Map<Integer, Integer> sampleMap = new HashMap<>();
		sampleMap.put(1, 1000);
		sampleMap.put(2, 2000);
		sampleMap.put(3, 3000);
		
		System.out.println(sampleMap.get(3));
		
	}

}
