package lendCopySystem;

import java.time.LocalDate;
import java.util.Date;

import CopyManager.CopyMgt;
import CopyManager.ICopyMgt;
import CopyManager.SecondHandBook;
import customerManager.Customer;
import customerManager.CustomerMgt;
import customerManager.ICustomerMgt;
import loanManager.ILoanMgt;
import loanManager.LoanMgt;

public class LendCopy implements ILendCopy {

	private ICopyMgt _copyManager = new CopyMgt();
	private ILoanMgt _loanManager = new LoanMgt();
	private ICustomerMgt _agenda = new CustomerMgt();

	@Override
	public SecondHandBook getCopyData(String id) {
		return _copyManager.getCopyDetails(id);
	}

	@Override
	public boolean checkAvailability(String id) {
		if (getCopyData(id).getStatus() == "available") {
			return true;
		}

		return false;
	}

	@Override
	public boolean registerCustomer(int id, String name, String surname, String address, int phone) {
		return _agenda.createCustomer(id, name, surname, address, phone);
	}

	@Override
	public boolean validateCredentials(Customer customer) {
		Customer realCustomer = _agenda.getCustomerData(customer.get_id());
		if (realCustomer.equals(customer)) {
			return true;
		}
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
	public boolean registerLoan(LocalDate date, int id_customer, int isbns[]) {
		LocalDate return_date = (LocalDate)date.plusDays(15);
		_loanManager.createLoan(date, return_date, 3, id_customer);
		return false;
	}

}
