package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name", "Abhishek");
		map.put("Company", "Way2Automation");
		map.put("Course", "Selenium");
		map.put("Loaction", "Mumbai");
		
		System.out.println(map);
		System.out.println(map.size());
	    System.out.println(map.get("Name"));
	    Set<String>keys=map.keySet();
	    
	    for(String key:keys) {
	    	System.out.println("Key -->"+key+" Value -->"+map.get(key));

	    }

		
	}

}
