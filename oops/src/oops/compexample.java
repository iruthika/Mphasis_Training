package oops;

import java.util.Comparator;

public class compexample {
	 //USING STREAM API PRINT NAMES WITH FILTER METHOD STARTS WITH CHARACTERS
	   
	   cstList.Stream()
	   .filter(cst->cst.getName().stratsWith("S"))
	   .forEach(dt->System.out.println(dt));
	
//USING STREAM API sorting the customer data
	   
	   cstList.ParallelStream().sorted(Comparator.comparing(Customer :: getName))
	   .forEach(cst->System.out.println
	(cst.getId()+" "+cst.getName()+ " "+
	   cst.getAge));
		   
//create new list & store formatted data
	   

}
