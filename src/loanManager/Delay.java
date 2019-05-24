package loanManager;

/**
 * Class which represents a delay
 * @author Miguel Ramírez
 */
public class Delay {

	private int _days;
	private int _id;
	private float _punishmentAmount;

	/**
	 * Constructor
	 * @param id
	 * @param days
	 * @param punishmentAmount
	 */
	public Delay(int id, int days, float punishmentAmount){
		set_id(id);
		set_days(days);
		set_punishementAmount(punishmentAmount);
	}

	/**
	 * @return the days of delay
	 */
	public int get_days() {
		return _days;
	}

	/**
	 * @param _days the _days to set
	 */
	public void set_days(int _days) {
		this._days = _days;
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
	 * @param _punishmentAmount the _punishmentAmount to set
	 */
	public void set_punishementAmount(float _punishmentAmount) {
		this._punishmentAmount = _punishmentAmount;
	}

}
