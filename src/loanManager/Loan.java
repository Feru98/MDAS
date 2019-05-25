package loanManager;
import java.time.*;
import java.util.ArrayList;

/**
 * Class which represents a loan
 * @author Miguel Angel Ramirez
 */
public class Loan {

	private LocalDate _beginLocalDate;
	private LocalDate _endLocalDate;
	private int _id;
	private float _amount;
	private ArrayList<String> _ISBNs=new ArrayList<String>();
	private int _id_customer;
	private Delay _delay;

	/**
	 * Constructor with parameters
	 * @param beginLocalDate of the loan
	 * @param endLocalDate of the loan
	 * @param id of the loan
	 * @param amount of the loan
	 * @param customer of the loan
	 */
	public Loan(LocalDate beginLocalDate, LocalDate endLocalDate, int id , float amount, int id_customer, Delay delay){
		_beginLocalDate = beginLocalDate;
		_endLocalDate = endLocalDate;
		_id= id;
		_amount= amount;
		_id_customer = id_customer;
		_delay = delay;
	}

	/**
	 * Empty constructor
	 */
	public Loan() {
	}

	/**
	 * @return the _beginLocalDate
	 */
	public LocalDate get_beginLocalDate() {
		return _beginLocalDate;
	}

	/**
	 * @param _beginLocalDate the _beginLocalDate to set
	 */
	public void set_beginLocalDate(LocalDate _beginLocalDate) {
		this._beginLocalDate = _beginLocalDate;
	}

	/**
	 * @return the _endLocalDate
	 */
	public LocalDate get_endLocalDate() {
		return _endLocalDate;
	}

	/**
	 * @param _endLocalDate the _endLocalDate to set
	 */
	public void set_endLocalDate(LocalDate _endLocalDate) {
		this._endLocalDate = _endLocalDate;
	}

	/**
	 * @return the _id
	 */
	public int get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(int _id) {
		this._id = _id;
	}

	/**
	 * @return the _amount
	 */
	public float get_amount() {
		return _amount;
	}

	/**
	 * @param _amount the _amount to set
	 */
	public void set_amount(float _amount) {
		this._amount = _amount;
	}

	/**
	 * @return the _ISBNs vector
	 */
	public ArrayList<String> get_ISBNs() {
		return _ISBNs;
	}

	/**
	 * @param aux array of ISBNs
	 */
	public void set_ISBNs(ArrayList<String> aux) {
		_ISBNs = aux;
	}

	/**
	 * @return the _id_customer
	 */
	public int get_customer() {
		return _id_customer;
	}

	/**
	 * @param id_customer the customer to set
	 */
	public void set_Customer(int id_customer) {
		this._id_customer = id_customer;
	}

	/**
	 * @return the _delay
	 */
	public Delay get_delay() {
		return _delay;
	}

	/**
	 * @param the delay to set
	 */
	public void set_delay(Delay delay) {
		this._delay = delay;
	}
}
