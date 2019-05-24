package loanManager;

import java.sql.Date;

//TODO DOCUMENT INTERFACE AND ADD THE PROTOYPES
public interface ILoanMgt {

    public boolean createLoan(Date beginDate, Date endDate, float amount, Customer customer);

    public void addCopy(int idLoan, String idCopy);

    public void deleteCopy(int idLoan, String idCopy);

    public void modifyLoan(int id, Date beginDate, Date endDate, float amount);

    public void deleteLoan(int id);

}
