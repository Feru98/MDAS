package InvoiceManager;

import java.util.Date;

public class Invoice {
	
	private Date _date = new Date();
	private int _id ; 
	private float _amount;
	
	//Constructor
	public Invoice(Date date , int id , float amount){
		_date = date;
		_id= id;
		_amount= amount;
	}
	
	
	
	
	/**
	 * @return the _date
	 */
	public Date get_date() {
		return _date;
	}
	/**
	 * @param _date the _date to set
	 */
	public void set_date(Date _date) {
		this._date = _date;
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
}
