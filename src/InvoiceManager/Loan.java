package InvoiceManager;

import java.util.Date;

public class Loan {
	private Date _beginDate = new Date();
	private Date _endDate = new Date();
	private int _id ; 
	private float _fare;
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
	 * @return the _fare
	 */
	public float get_fare() {
		return _fare;
	}
	/**
	 * @param _fare the _fare to set
	 */
	public void set_fare(float _fare) {
		this._fare = _fare;
	}
		
}
