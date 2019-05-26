package lendCopySystem;


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
	 * Validates a Customer's id
	 * @param id_customer
	 * @return true if customer id is valid, false if customer id is invalid
	 */
	public boolean validateCredentials(int id_customer);
}
