package lendCopySystem;

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
	public boolean setNewStatus(String id, String status);

	public boolean registerLoan();
}
