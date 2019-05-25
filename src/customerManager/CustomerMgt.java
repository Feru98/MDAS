package customerManager;
import java.util.ArrayList;

public class CustomerMgt implements ICustomerMgt{

    private ArrayList<Customer> _agenda = new ArrayList<Customer>();

    private ArrayList<Customer> getAgenda() {
        return _agenda;
    }

     /**
	 * Creates a customer with the parameters provided
	 * @param id of the Customer
	 * @param name of the Customer
	 * @param surname of the Customer
	 * @param address of the Customer
	 * @param phone of the Customer
	 * @return true if success, false if failure
	 */
    @Override
    public boolean createCustomer(int id, String name, String surname, String address, int phone) {

        if (getCustomerData(id) == null) {
            Customer new_customer = new Customer(id, name, surname, address, phone);
            return getAgenda().add(new_customer);
        }
        return false;

    }

    /**
	 * Gets a Customer by its ID
	 * @param id of the customer
	 * @return Customer with the ID if it exists, null if doesn't
	 */
    @Override
    public Customer getCustomerData(int id) {
        ArrayList<Customer> agenda = getAgenda();
        for (int i = 0; i < getAgenda().size(); i++) {
            if (agenda.get(i).get_id() == id) {
                return agenda.get(i);
            }
        }
        return null;
    }

    /**
	 * Modifies data of a customer with a determined ID
	 * @param id of the Customer
	 * @param name of the Customer modified
	 * @param surname of the Customer modified
	 * @param address of the Customer modified
	 * @param phone of the Customer modified
	 * @return true if modified correctly, false if there was a mistake.
	 */
    @Override
    public boolean setCustomerData(int id, String name, String surname, String address, int phone) {
        try {
            Customer customer = getCustomerData(id);

            customer.set_name(name);
            customer.set_surname(surname);
            customer.set_address(address);
            customer.set_phone(phone);

            return true;

        } catch (Exception e) {
           System.err.println(e);
           return false;
        }
    }

    /**
     * Deletes a customer from the array of customer
     * @param id
     * @return true if success, false if failure
     */
    @Override
    public boolean deleteCustomer(int id) {

        ArrayList<Customer> agenda = getAgenda();
        for (int i = 0; i < getAgenda().size(); i++) {
            if (agenda.get(i).get_id() == id) {
                agenda.remove(i);
                return true;
            }
        }
        return false;

    }

}