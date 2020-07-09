package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> ll = new LinkedList<String>();
		 
		 //add
		 
		 ll.add("test");
		 ll.add("QTP");
		 ll.add("selenium");
		 ll.add("RPA");
		 ll.add("RGA");
		 
		 //print
		 
		 System.out.println("Content of LinkedList:"+ll);
		 
		 ll.addFirst("Chaitra"); 
		 ll.addLast("Automation");
		 System.out.println("Content of LinkedList:"+ll);
		 
		 //get
		 
		 System.out.println("Content of LinkedList:"+ll.get(0));
		 
		 //set
		 
		 ll.set(0, "Happy");
	
		 System.out.println("Content of LinkedList:"+ll.get(0));
		 
		 //remove
		 
		 ll.removeFirst();
		 ll.removeLast();
		 
		 System.out.println("Content of LinkedList:"+ll);
		 
		 ll.remove(2);
		 System.out.println("Content of LinkedList:"+ll);
		 
		 //iteration or printing all values of Linkedlist
		 //iterator, for loop, Advance For loop
		 
		 System.out.println("**********printing using forloop************");
		 
		 for (int n=0;n<ll.size();n++) {
			 
			 System.out.println("Content of LinkedList:"+ll.get(n));
		 }
		 
		 System.out.println("**********printing using Advance forloop************");
		 
		 for (String str : ll) {
			 
			 System.out.println(str);
		 }
		 
		 
		 System.out.println("***********printing using Iterator*********** ");
		 
		 Iterator<String> it = ll.iterator();
		 
		 while( it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("***********printing using While Loop*********** ");
		 
		 int num=0;
		 while(ll.size()>num) {
			 System.out.println(ll.get(num));
			 num++;
		 }
		 
	}

}
