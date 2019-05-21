package lendCopySystem;
import InvoiceManager.Customer;

public interface IAskCustomerData {
	Customer createCustomer();
	
	boolean registerCustomer();
	
	Customer getCustomerData();
	
	boolean setCustomerData();
}
