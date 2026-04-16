package practice;

import java.util.HashMap;

public class practiceHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Age", 32);
		map.put("Experience", 10);
		map.put("Salary", 100000);
		System.out.println(map);
		System.out.println(map.size());
	    System.out.println(map.get("Age"));
	    System.out.println(map.get("Experience"));
	    System.out.println(map.get("Salary"));
	    
	    map.remove("Experience");
	    System.out.println(map);
	    System.out.println(map.size());
	    System.out.println(map.get("Experience")); // null value will be returned if key is not present in the map
	    System.out.println(map.containsKey("Age")); // true
	    
	    
	}

}
