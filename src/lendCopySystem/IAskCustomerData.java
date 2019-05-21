package lendCopySystem;
import InvoiceManager.Customer;
/**
 * Interface to Ask Customer for Data
 * @author Miguel Ángel Ramírez
 *
 */

public interface IAskCustomerData {
	
	/**
	 * Creates a customer with the parameters provided
	 * @param id of the Customer
	 * @param name of the Customer
	 * @param surname of the Customer
	 * @param address of the Customer
	 * @param phone of the Customer
	 * @return Customer
	 */
	Customer createCustomer(int id, String name, String surname, String address, int phone);
	
	/**
	 * Registers a Customer in the system
	 * @param customer to register
	 * @return true if customer is registered with success, false if there was an error during the proccess
	 */
	boolean registerCustomer(Customer customer);
	
	/**
	 * Gets a Customer by its ID
	 * @param id of the customer
	 * @return Customer with the ID if it exists, null if doesn't
	 */
	Customer getCustomerData(int id);
	
	/**
	 * Modifies data of a customer with a determined ID
	 * @param id of the Customer
	 * @param name of the Customer modified
	 * @param surname of the Customer modified
	 * @param address of the Customer modified
	 * @param phone of the Customer modified
	 * @return true if modified correctly, false if there was a mistake.
	 */
	boolean setCustomerData(int id, String name, String surname, String address, int phone);
	
	/**
	 * Validates a Customer's credentials
	 * @param customer 
	 * @return true if customer data is valid, false if customer data is invalid
	 */
	boolean validateCredentials(Customer customer);
}
