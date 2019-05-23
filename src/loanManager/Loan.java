package loanManager;
import java.util.Date;
import java.util.ArrayList;

//TODO ADD DOCUMENTATION
//TODO ADD DELAY AND CUSTOMER AS ATTRIBUTES
/**
 * Class which represents a loan
 * @author Miguel Angel Ramirez
 */
public class Loan {

	private Date _beginDate = new Date();
	private Date _endDate = new Date();
	private int _id;
	private float _amount;
	private ArrayList<String> _ISBNs=new ArrayList<String>();

	/**
	 * Constructor with parameters
	 * @param beginDate
	 * @param endDate
	 * @param id
	 * @param amount
	 */
	public Loan(Date beginDate, Date endDate, int id , float amount){
		_beginDate = beginDate;
		_endDate = endDate;
		_id= id;
		_amount= amount;
	}

	/**
	 * Empty constructor
	 */
	public Loan(){}

	/**
	 * @return the _beginDate
	 */
	public Date get_beginDate() {
		return _beginDate;
	}
	/**
	 * @param _beginDate the _beginDate to set
	 */
	public void set_beginDate(Date _beginDate) {
		this._beginDate = _beginDate;
	}
	/**
	 * @return the _endDate
	 */
	public Date get_endDate() {
		return _endDate;
	}
	/**
	 * @param _endDate the _endDate to set
	 */
	public void set_endDate(Date _endDate) {
		this._endDate = _endDate;
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
	public ArrayList<String> get_ISBNs(){
		return _ISBNs;
	}

	/**
         * @param aux array of ISBNs
         */
	public void set_ISBNs(ArrayList<String> aux){
		_ISBNs=aux;
	}
}
