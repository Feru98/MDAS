package CopyManager;

public class SecondHandBook extends Copy{
	

	private String _status;
	
	public SecondHandBook(String isbn, float price, String name, String author, String category, String status) {
		super(isbn, price, name, author, category);
		setStatus(status);
	}
	
	/**
	 * @return the _status
	 */
	public String getStatus() {
		return _status;
	}

	/**
	 * @param _status the _status to set
	 */
	public void setStatus(String _status) {
		this._status = _status;
	}
}
