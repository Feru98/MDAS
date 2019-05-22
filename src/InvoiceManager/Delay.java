package InvoiceManager;
import java.util.Date;

public class Delay {
	
	private Date _date = new Date();
	private int _id ; 
	private float _punishmentAmount; 

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
	 * @return the _punishmentAmount
	 */
	public float get_punishementAmount() {
		return _punishmentAmount;
	}

	/**
	 * @param _punishmentAmount the _punishementAmount to set
	 */
	public void set_punishementAmount(float _punishmentAmount) {
		this._punishmentAmount = _punishmentAmount;
	}
	

}
