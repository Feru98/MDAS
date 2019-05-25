package lendCopySystem;

import loanManager.*;
import CopyManager.*;
import customerManager.*;

public class LendCopy implements ILendCopy {

	private ICopyMgt _copyManager = new CopyMgt();
	private ILoanMgt _loanManager = new LoanMgt();

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
