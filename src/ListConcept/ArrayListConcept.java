package ListConcept;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];//Static array and size is fixed. so address this Dynamic Array is used which is called ArrayList
		
		//Dynamic Array --> ArrayList
		//1. Can have duplicate values or elements
		//2. maintains insertion order
		//3. Synchronized
		//4. Allows random access to fetch elements because it stores the values basis of indexes.
		
		
		ArrayList ar = new ArrayList();//non generic ArrayList
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		System.out.println(ar.size());//size of ArrayList
	
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));//Printing ArrayList using for loop
		}
	
		//generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		ar1.add(200);
		
		System.out.println(ar1.size());
		System.out.println(ar1.get(0));
		
		
		//user defined class Object
		ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1 = new Employee("Chaitra", 40,"QA");
		Employee e2 = new Employee("tester", 20,"devops");
		Employee e3 = new Employee("bugger", 25,"Dev");
		
		//create ArrayList
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*****************");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		
		ar5.add("test");
		ar5.add("java");
		ar5.add("Selenium");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		
		ar6.add("Automation");
		ar6.add("java script");
		ar6.add("QTP");
		//adding arraylist
		ar5.addAll(ar6);
		
		for (int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		//remove ArrayList
		ar5.removeAll(ar6);
		System.out.println("*****************");
		for (int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll will keep only common argument between two ArrayLists
		
		
	}

}
