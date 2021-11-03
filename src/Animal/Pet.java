package Animal;

import java.util.ArrayList;
import java.util.Iterator;


public class Pet {
	//ArrayList
	ArrayList<Integer> code = new ArrayList<Integer>();

	public ArrayList<Integer> AssignCode() {
		System.out.println("ArrayList"+"\n");
		System.out.println("Add");
	    for (int i = 1; i <= 15; i++) {
	    	code.add(i);
	    }
	    
	    System.out.println(code+"\n");
		return code;
	}
    
	public ArrayList<Integer> RemoveCode() {

	    System.out.println("Remove");
	    code.remove(12);
	    code.remove(5);
	    System.out.println(code+"\n");
		return code;
	}
	
	public ArrayList<Integer> UpdateCode() {

	    System.out.println("Update");
	    code.set(0, 100);
	    code.set(5, 402);
	    System.out.println(code+"\n");
		return code;
	}
	
	public ArrayList<Integer> IterateCode() {

	    System.out.println("Iterate with for");
	    for (int i = 0; i < code.size(); i++)
            System.out.print(code.get(i) + " ");
	    
	    System.out.println("\n"+"\n"+"Iterate with Iterator");

	    Iterator<Integer>  it =code.iterator();
	    while(it.hasNext()) {
            System.out.print(it.next()+"\n");

	    }
	    
		return code;
	}
	
}

