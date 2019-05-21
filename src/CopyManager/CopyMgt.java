package CopyManager;

import java.util.ArrayList;

/**
 * Class for Copy Manager
 * @author Fernando Maestre Carmona 
 *
 */
public class CopyMgt {
	
	/**
	 * Array of second hand books 
	 */
	private ArrayList<SecondHandBook> books = new ArrayList<SecondHandBook>();

	/**
	 * Method that gets a copy and a new status and change that copy status to the new one
	 * @param a
	 * @param status
	 */
	public void changeCopyStatus(SecondHandBook a , String status ){
		a.setStatus(status); }

		
	/**
	 * Method that get a copy isbn and returns the second hand book that matches it
	 * @param id = string that is the isbn of a copy
	 * @return the second hand book that matches the isbn or null if not found
	 */
	public SecondHandBook getCopyDetails(String id ) {

		for(int i=0 ; i<books.size() ; i++ ){	
				if(books.get(i).getISBN()==id) {
				return books.get(i);
				}
			}
		
		return null;
	}
	
	
	/**
	 * Method that receives a SecondHandBook and adds it to the array
	 * @param aux
	 */
	public void addCopy(SecondHandBook aux){
		books.add(aux);
	}
	
	/**
	 * Method that receives a SecondHandBook and removes it to the array
	 * @param id
	 */
	public void deleteCopy(String id){
		
		for(int i=0 ; i<books.size() ; i++ ){	
			if(books.get(i).getISBN()==id) {
				books.remove(books.get(i));
			}
		}

	}
	
	
}
