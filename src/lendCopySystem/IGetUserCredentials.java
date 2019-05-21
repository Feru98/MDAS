package lendCopySystem;

import InvoiceManager.Customer;

public interface IGetUserCredentials {
	Customer getCredentials();
	
	boolean validateCredentials();
}
