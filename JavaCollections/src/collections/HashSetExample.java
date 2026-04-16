package collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
		set.add("Abhishek");
		set.add("Welcome");
		set.add("Way2Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Welcome");
		System.out.println(set);
		System.out.println(set.size());
		
		for(String str:set) {
			System.out.println(str);
		}
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			
			String var=it.next();
			if(var.equals("Selenium")) {
				System.out.println(var);
			}
			
		}
	}

}
