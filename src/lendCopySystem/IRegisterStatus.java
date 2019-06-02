package lendCopySystem;

import java.time.LocalDate;

/**
 * Interface to Register new status for a book
 * 
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
	public boolean setNewStatus(String id, String status);

	/**
	 * 
	 * @param date
	 * @param id_customer
	 * @param isbns
	 * @return
	 */
	public boolean registerLoan(LocalDate date, int id_customer, String isbns[]);
}
