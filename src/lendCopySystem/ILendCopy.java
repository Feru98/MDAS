package lendCopySystem;

/**
 * ILendCopy
 * @author Miguel Ramírez
 */
public interface ILendCopy extends ICheckAvailability, IAskCustomerData, IRegisterStatus{

    /**
     * Prints the loans saved
     */
    public void printLoans();

    /**
     * Performs the return of a loan
     * @param id_loan to return
     * @return true if success, false if failure
     */
    public boolean returnLoan(int id_loan);

    /**
     * Updates all loans.
     * @return true if success, false if failure
     */
    public boolean updateLoans();

}
