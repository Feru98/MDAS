package CopyManager;

import java.util.ArrayList;

public class CopyMgt {
	
	//vector de copias
	 ArrayList<SecondHandBook> books = new ArrayList<SecondHandBook>();

	public void changeCopyStatus(SecondHandBook a , String status ){
		a.setStatus(status); }

		
	
	public SecondHandBook getCopyDetails(String id ) {

		for(int i=0 ; i<books.size() ; i++ ){	
				if(books.get(i).getISBN()==id) {
				return books.get(i);
				}
			}
		
		return null;
	}
	
	
	public void addCopy(SecondHandBook aux){
		books.add(aux);
	}
	
	public void deleteCopy(String id){
		
		for(int i=0 ; i<books.size() ; i++ ){	
			if(books.get(i).getISBN()==id) {
				books.remove(books.get(i));
			}
		}

	}
	
	
}
