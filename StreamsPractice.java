package BasicPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsPractice {
	
	
	public static List<UserDetailsNew> createObject() {
		List<UserDetailsNew> detailsNews = new ArrayList<>();
		UserDetailsNew detailsNew = new UserDetailsNew(1, "dfdfsfasf", 25, 30000);
		UserDetailsNew detailsNew1 = new UserDetailsNew(2, "sdfedfdfd", 27, 20000);
		UserDetailsNew detailsNew2 = new UserDetailsNew(3, "etgrefrt", 18, 15000);
		UserDetailsNew detailsNew3 = new UserDetailsNew(4, "wetwererw", 30, 40000);
		
		detailsNews.add(detailsNew);
		detailsNews.add(detailsNew1);
		detailsNews.add(detailsNew2);
		detailsNews.add(detailsNew3);
		
		System.out.println(detailsNews);
		return detailsNews;
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<UserDetailsNew> result = createObject();
		
		
		//old method of filtering the username of users having salary > 20000
		List<String> output = new ArrayList<>();
		for(UserDetailsNew detailsNew: result) {
			if(detailsNew.getSalary() > 20000) {
				output.add(detailsNew.getUserName());
			}
		}
		
		//to get only the user details having salary > 20000
		List<UserDetailsNew> filtered= result.stream().filter((e) -> e.getSalary() > 20000).collect(Collectors.toList());
		
		System.out.println(filtered);
		
		
		//to get the user name of users having salary > 20000
	    List<String> usernames = result.stream().filter((e) -> e.getSalary() > 20000)
	    		.map((f) -> f.getUserName()).collect(Collectors.toList());
	    
	    System.out.println(usernames);
	    
	    System.out.println("old for loop data output" + output);
	    
	    
	    Map<Integer, Long> resultMap=  result.stream()
	    		.collect(Collectors.groupingBy(UserDetailsNew::getSalary, Collectors.counting()));
	    
	    
	    System.out.println(resultMap);
	    
	    int repeating = 0;
	    Map<Integer, Integer> mapResult = new HashMap<>();
	    
	    for(UserDetailsNew detailsNew: result) {
	    	
	    	//get or default example
//	    	mapResult.put(detailsNew.getSalary(), mapResult.getOrDefault(detailsNew.getSalary(), 0)+1);
	    	
	    	
	    	if(mapResult.get(detailsNew.getSalary()) == null) {
	    		mapResult.put(detailsNew.getSalary(), 1);
	    	}else {
//	    		int value = mapResult.get(detailsNew.getSalary());
//	    		mapResult.put(detailsNew.getSalary(), value+1);
	    		
	    		mapResult.put(detailsNew.getSalary(), mapResult.get(detailsNew.getSalary())+1);
	    	}
	    }
	    
	    System.out.println(mapResult);
	    
	    long alt = resultMap.getOrDefault(15000, (long) 0);
	    System.out.println(alt);	
	    
	    List<Integer> integers = new ArrayList<>();
	    integers.add(1);
	    integers.add(3);
	    integers.add(1);
	    integers.add(2);
	    integers.add(3);
	    
	    //removing duplicates using streams
	    Set<Integer> setResult=  integers.stream().collect(Collectors.toSet());
	    System.out.println(setResult);
	    
	    //removing duplicates using traditional for loop
	    Set<Integer> setResultNew = new HashSet<>();
	    for(Integer a : integers) {
	    	setResultNew.add(a);
	    }
	    
	    System.out.println(setResultNew);
	    
	    List<Integer> unOrdered = new ArrayList<>();
	    unOrdered.add(7000);      
	    unOrdered.add(1000);
	    unOrdered.add(6000);
	    unOrdered.add(500);
	    
	    System.out.println(unOrdered);
	    
	    Collections.sort(unOrdered);
	    
	    //to arrange the list of integers to asc order
	    List<Integer> sortedNum =  unOrdered.stream().sorted().collect(Collectors.toList());
	    System.out.println(sortedNum);
	    
	    //to arrange list of integers into desc order using sort operation
	    List<Integer> sortedNum1=  unOrdered.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	    System.out.println(sortedNum1);
	    
	    List<UserDetailsNew> result1 = createObject();
	   
	    List<UserDetailsNew> sortedResult = result1.stream()
	    .sorted(Comparator.comparing(UserDetailsNew::getAge).thenComparing(UserDetailsNew::getSalary))
	    .collect(Collectors.toList());
	    
	    System.out.println("sorted result"+ sortedResult);
	    
	    //using stream to collection the data in map
	     Map<String, UserDetailsNew> sortedResult2= result1.stream()
	    		 .collect(Collectors.toMap(UserDetailsNew::getUserName, user -> user));
	     
	     System.out.println(sortedResult2);
	     
	     //using traditional for loop to collect to map
	     Map<String, UserDetailsNew> sortedResult3 = new HashMap<>();
	     for(UserDetailsNew detailsNew: result1) {
	    	 sortedResult3.put(detailsNew.getUserName(), detailsNew);
	     }
	    
	     System.out.println("using forloop creating map"+  sortedResult3);
	    
	}
	
	

}
