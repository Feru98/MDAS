package lendCopySystem;

import java.time.LocalDate;
import java.util.ArrayList;

import CopyManager.CopyMgt;
import CopyManager.ICopyMgt;
import CopyManager.SecondHandBook;
import customerManager.Customer;
import customerManager.CustomerMgt;
import customerManager.ICustomerMgt;
import loanManager.*;

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
		try {
			if (getCopyData(id).getStatus() == "available") {
				return true;
			}
	
			return false;
		} catch (Exception e) {
			return false;
		}
		
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

	@Override
	public void printLoans(){
		ArrayList<Loan> loans = _loanManager.getLoans();
		if (!loans.isEmpty()) {
			for (int i = 0; i < loans.size(); i++) {
				loans.get(i).printLoan();
				System.out.println();
			}
		}else{
			System.out.println("Error: No Loans were found.");
		}
	}

	@Override
	public boolean returnLoan(int id_loan){
		try {
			ArrayList<String> isbns = _loanManager.returnLoan(id_loan);
			for (int i = 0; i < isbns.size(); i++) {
				setNewStatus(isbns.get(i), "Available");
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateLoans(){
		ArrayList<Loan> loans = _loanManager.getLoans();
		if (!loans.isEmpty()) {
			for (int i = 0; i < loans.size(); i++) {
				_loanManager.updateLoan(loans.get(i).get_id());
			}
			return true;
		}
		return false;
	}

}
