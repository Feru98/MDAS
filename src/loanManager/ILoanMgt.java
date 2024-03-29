package loanManager;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Interface for loanManager component
 * @author Miguel Ramírez
 */
public interface ILoanMgt {

    /**
		 * Creates a loan and adds it to the array
		 * @param beginLocalDate 
		 * @param endLocalDate
		 * @param amount
		 * @param id_customer
		 * @return the id of the loan if success, -1 if failure
		 */
    public int createLoan(LocalDate beginLocalDate, LocalDate endLocalDate, float amount, int id_customer);

    /**
	 * Adds a copy to a loan
	 * @param id_loan id of the invoice to modify
	 * @param idCopy the book's ISBN
	 * @return true if success, false if failure
	 */
    public boolean addCopy(int idLoan, String idCopy);

    /**
         * Deletes a copy from a loan
         * @param id_loan id of the invoice to modify
         * @param idCopy the book's ISBN
         */
    public boolean deleteCopy(int idLoan, String idCopy);

    /**
	 * Updates a loan
	 * @param id_loan id of the loan to update
	 * @return true if success, false if failure
	 */
    public boolean updateLoan(int id);

    /**
	 * Deletes a loan from the array
	 * @param id of the loan
	 * @return true if success, false if failure
	 */
	public boolean deleteLoan(int id);
	
	/**
	 * Gets the collection of loans
	 * @return the arrayList of loans
	 */
	public ArrayList<Loan> getLoans();

	/**
	 * performs the return of a loan
	 * @param id_loan to return
	 * @return The array of copies of the loan if success, null if failure
	 */
	public ArrayList<String> returnLoan(int id_loan);
}
