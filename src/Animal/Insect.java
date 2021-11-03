package Animal;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Insect {
    TreeSet<String> tree = new TreeSet<String>();
    
    public TreeSet<String> addInsect(){
	    System.out.println("\n"+"TreeSet"+"\n");

		System.out.println("Add");
		 	tree.add("Ant");
	        tree.add("LadyBug");
	        tree.add("Bee");
	        tree.add("Butterfly");
	        tree.add("Paying Mantis");
	        tree.add("Beetle");

	  
	        System.out.println(tree+"\n");
		return tree;
    }

    public TreeSet<String> removeInsect(){
		System.out.println("Remove by name");
		tree.remove("Ant");
        tree.remove("Bee");
        System.out.println(tree+"\n");

		return tree;
    }
    
    public TreeSet<String> iterateInsect(){
		System.out.println("Iterate using loop");
		 for (String value : tree)
			 System.out.print(value + "\n");
	        
	        System.out.println();
	        
		System.out.println("Iterate using Iterator");
        Iterator<String> iterator = tree.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + "\n");
        	System.out.println();
    	
        System.out.println("Iterate using map");
        	System.out.print(
                    tree.stream()
                        .map(i -> String.valueOf(i))
                        .collect(Collectors.joining(", ")));        	
        	System.out.println();

    
		return tree;
    }
    

}
