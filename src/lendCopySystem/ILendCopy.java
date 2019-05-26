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

}
