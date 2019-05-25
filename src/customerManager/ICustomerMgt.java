package customerManager;

public interface ICustomerMgt {

    /**
	 * Creates a customer with the parameters provided
	 * @param id of the Customer
	 * @param name of the Customer
	 * @param surname of the Customer
	 * @param address of the Customer
	 * @param phone of the Customer
	 * @return true if success, false if failure
	 */
    public boolean createCustomer(int id, String name, String surname, String address, int phone);

    /**
	 * Gets a Customer by its ID
	 * @param id of the customer
	 * @return Customer with the ID if it exists, null if doesn't
	 */
    public Customer getCustomerData(int id);

    /**
	 * Modifies data of a customer with a determined ID
	 * @param id of the Customer
	 * @param name of the Customer modified
	 * @param surname of the Customer modified
	 * @param address of the Customer modified
	 * @param phone of the Customer modified
	 * @return true if modified correctly, false if there was a mistake.
	 */
    public boolean setCustomerData(int id, String name, String surname, String address, int phone);

    /**
     * Deletes a customer from the array of customer
     * @param id
     * @return true if success, false if failure
     */
    public boolean deleteCustomer(int id);
}