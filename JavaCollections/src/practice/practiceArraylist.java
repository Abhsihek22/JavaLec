package practice;

import java.util.ArrayList;

public class practiceArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abhishek");
		list.add("Welcome");
		list.add("Way2Automation");
		list.add("Welcome"); // duplicate value allowed in ArrayList
		System.out.println(list);
		System.out.println("Size of an list is: "+list.size());
		System.out.println("value at index 2 is: " +list.get(2));
		list.remove(1);
		System.out.println(list);
		System.out.println("Size of an list is: "+list.size());
	}

}
