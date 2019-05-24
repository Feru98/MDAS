package lendCopySystem;

import CopyManager.SecondHandBook;
import loanManager.Customer;
import loanManager.ILoanMgt;
import loanManager.Loan;
import loanManager.LoanMgt;
import CopyManager.ICopyMgt;
import CopyManager.CopyMgt;

public class LendCopy implements ILendCopy {

	private ICopyMgt copyManager = new CopyMgt();
	private ILoanMgt loanManager = new LoanMgt();

	@Override
	public SecondHandBook getCopyData(String id) {
		return null;
	}

	@Override
	public boolean checkAvailability(String id) {
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
		return false;
	}

	@Override
	public Loan generateInvoice() {
		return null;
	}

	@Override
	public boolean registerLoan() {
		return false;
	}

}
