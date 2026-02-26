package BasicPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	}

}
