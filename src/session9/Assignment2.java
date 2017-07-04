package session9;

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring ArrayList signature using Generic String class as object
		
		ArrayList<String> name = new ArrayList<String>();
		
		// Adding all the names in ArrayList
		
		name.add("Amritha");
		
		name.add("Kaushik");
		
		name.add("Tanaya");
		
		name.add("Amritha");
		
		name.add("Kaushik");
		
		// declaring Iterator signature 
		
		Iterator<String> itr = name.iterator();
		
		System.out.println("Collections containing duplicates");
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
			/*prints
			 * Amritha
			 * Kaushik
			 * Tanaya
			 * Amritha
			 * Kaushik
			 */
			
		}

		System.out.println("");//create a new line
		
		// declaring HashSet signature copying ArrayList collection
		
		HashSet<String> nameCopy = new HashSet<String>(name);
		
		// declaring Iterator signature 
		
		Iterator<String> itr1 = nameCopy.iterator();
		
		System.out.println("Collections without duplicates");
		//prints Collections without duplicates
		
		while(itr1.hasNext()){
			
			System.out.println(itr1.next());
			/*prints
			 *Kaushik
			 *Amritha
			 *Tanaya
			*/
			
		}
		
	}

}
