package lendCopySystem;

import CopyManager.SecondHandBook;
import loanManager.Customer;
import loanManager.ILoanMgt;
import loanManager.Loan;
import loanManager.LoanMgt;
import CopyManager.ICopyMgt;
import CopyManager.CopyMgt;

public class LendCopy implements ILendCopy {

	private ICopyMgt _copyManager = new CopyMgt();
	private ILoanMgt _loanManager = new LoanMgt();

	@Override
	public SecondHandBook getCopyData(String id) {
		return _copyManager.getCopyDetails(id);
	}

	@Override
	public boolean checkAvailability(String id) {
		if (getCopyData(id).getStatus() == "Available") {
			return true;
		}

		return false;
	}

	@Override
	public Customer createCustomer(int id, String name, String surname, String address, int phone) {
		return null;
	}

	@Override
	public boolean registerCustomer(Customer customer) {
		return false;
	}

	@Override
	public Customer getCustomerData(int id) {
		return null;
	}

	@Override
	public boolean setCustomerData(int id, String name, String surname, String address, int phone) {
		return false;
	}

	@Override
	public boolean validateCredentials(Customer customer) {
		return false;
	}

	@Override
	public boolean setNewStatus(String id, String status) {
		try {
			SecondHandBook copy = getCopyData(id);
			_copyManager.changeCopyStatus(copy, status);

			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public boolean registerLoan() {
		return false;
	}

}
