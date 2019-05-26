package lendCopySystem;

import java.time.LocalDate;

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
	public boolean validateCredentials(int id_customer) {
		Customer realCustomer = _agenda.getCustomerData(id_customer);
		if (realCustomer != null) {
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
	public boolean registerLoan(LocalDate date, int id_customer, String isbns[]) {
		LocalDate return_date = (LocalDate)date.plusDays(15);
		int id_loan = _loanManager.createLoan(date, return_date, 3, id_customer);
		if (id_loan != -1) {
			for (int i = 0; i < isbns.length; i++) {
				if (checkAvailability(isbns[i])) {

					_loanManager.addCopy(id_loan, isbns[i]);
					setNewStatus(isbns[i], "lend");
				}
			}
			return true;
		}
		return false;
	}

}
