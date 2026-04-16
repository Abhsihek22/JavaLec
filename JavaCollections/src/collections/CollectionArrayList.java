package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list=new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		list.add("Abhishek");
		list.add(10.5);
		list.add(true);
		list.add('A');
		list.add(1000989.000989);
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("");
		System.out.println(list.get(0));
		//System.out.println(list.get(8));
		
		list.remove(1);
		System.out.println("");
		System.out.println(list);
		System.out.println(list.size());
		
		
		System.out.println("");
		
		//for loop 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// for each loop
		System.out.println("");
		System.out.println("for each loop");
		System.out.println("");
		// for each loop
		for(Object obj:list) {
			System.out.println(obj);
			
		}

		System.out.println("");
		System.out.println("using iterator ");
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
