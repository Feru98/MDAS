package lendCopySystem;

import customerManager.Customer;
/**
 * Interface to Ask Customer for Data
 * @author Miguel Ángel Ramírez
 *
 */

public interface IAskCustomerData {
	/**
	 * Registers a Customer in the system
	 * @param customer to register
	 * @return true if customer is registered with success, false if there was an error during the proccess
	 */
	public boolean registerCustomer(int id, String name, String surname, String address, int phone);

	/**
	 * Validates a Customer's credentials
	 * @param customer
	 * @return true if customer data is valid, false if customer data is invalid
	 */
	public boolean validateCredentials(Customer customer);
}
