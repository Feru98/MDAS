package lendCopySystem;

import CopyManager.SecondHandBook;
import CopyManager.ICopyMgt;
import CopyManager.CopyMgt;

public class CheckAvailability implements ICheckAvailability {
	
	public SecondHandBook getCopyData(String id)
	{
		SecondHandBook aux = getCopyDetails(id);
		return aux;
	}
	
	
	public boolean checkAvailability(String id)
	{
		return true;
	}
}
