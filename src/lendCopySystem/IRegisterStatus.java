package lendCopySystem;
import InvoiceManager.Invoice;

/**
 * Interface to Register new status for a book
 * @author Miguel Ángel Ramírez 
 * 
 */
public interface IRegisterStatus {
	/**
	 * Changes a copy's status
	 * @param id of the copy
	 * @param status of the copy modified
	 * @return true if changed with success, false if an error ocurred
	 */
	boolean setNewStatus(String id, String status);
	
	Invoice generateInvoice();
	
	boolean registerLoan();
}
