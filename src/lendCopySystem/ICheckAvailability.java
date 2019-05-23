package lendCopySystem;
import CopyManager.SecondHandBook;
import CopyManager.ICopyMgt;


/**
 * Interface to Check Availability of a copy
 * @author Miguel Ángel Ramírez Ruiz
 *
 */
public interface ICheckAvailability {
	/**
	 * Gets information about a Second Hand Book
	 * @param id of the book
	 * @return A second hand book data
	 */
	SecondHandBook getCopyData(String id);
	
	/**
	 * Checks the availability of a book by it's id
	 * @param id ok the book
	 * @return true if the book is available, false if not available or doesn't exists
	 */
	public boolean checkAvailability(String id);
}
