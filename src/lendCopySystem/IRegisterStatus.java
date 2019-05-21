package lendCopySystem;

import InvoiceManager.Invoice;

public interface IRegisterStatus {
	void setNewStatus();
	
	Invoice generateInvoice();
	
	boolean registerLoan();
}
