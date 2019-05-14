package CopyManager;

import java.util.ArrayList;

public class CopyMgt {
	
	//vector de copias
	 ArrayList<SecondHandBook> books = new ArrayList<SecondHandBook>();

	public void changeCopyStatus(SecondHandBook a , String status ){
		a.setStatus(status); }

		
	public void getCopyDetails() {}
	
	
	public void addCopy(){}
	public void deleteCopy(){}
	
	
}
