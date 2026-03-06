package BasicPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(30);
		
		System.out.println(arr);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		UserDetailsNew detailsNew = new UserDetailsNew();
		detailsNew.setId(1);
		detailsNew.setUserName("asdsd");
		List<UserDetailsNew> detailObj = new ArrayList<>();
		detailObj.add(detailsNew);
		
		System.out.println(detailObj);
		
		Set<Integer> setarr = new HashSet<>();
		setarr.add(10);
		setarr.add(20);
		setarr.add(30);
		setarr.add(30);
		System.out.println(setarr);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(20);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq);
		
		PriorityQueue<Integer> pqRev = new PriorityQueue<>(Collections.reverseOrder());
		
		pqRev.add(60);
		pqRev.add(25);
		pqRev.add(65);
		pqRev.add(70);
		
		System.out.println(pqRev);
		pqRev.poll();
		
		System.out.println(pqRev);
		pqRev.poll();
		System.out.println(pqRev);
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue);
		System.out.println(queue.poll());
		
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(20);
		System.out.println(stack);
		System.out.println(stack.pop());
		
		Map<Integer, String> mapPrac = new HashMap<>();
		
		mapPrac.put(1, "kumar");
		mapPrac.put(2, "sathish");
		
		System.out.println(mapPrac.get(1));
		
		
		LinkedList<Integer> ln = new LinkedList<>();
		ln.add(10);
		ln.add(20);
		ln.add(30);
		ln.add(5);
		
		System.out.println(ln);
		System.out.println(ln.get(0));
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(2);
		treeSet.add(20);
		
		System.out.println(treeSet);
		
		
		
	}
	
	

}
