package Recursion_Lab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

	public class MyLinkedList extends  LinkedList<String>   {
		 Iterator<String> inter= null;
		
			
		
		
		String findLargest(String larg) {
			String large;
//		System.out.println(larg);
			if(!inter.hasNext()) {
				large = larg;
			}else {
				String temp = inter.next();
				if(larg.compareTo(temp)>0) {
					large = findLargest(larg);
				}else {
					large = findLargest(temp);	
				}
			}
		
			return large;
		
		}

		public String findLargest() {
			inter =super.iterator();	
		String Largest;
		Largest= inter.next();
		if(inter.hasNext()) {
			Largest = findLargest(Largest);
		}
		return Largest;
		
		
		
		}
		

		}
