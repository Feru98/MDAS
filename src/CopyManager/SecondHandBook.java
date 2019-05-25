package CopyManager;

/**
 * Class for Second Hand Book
 * @author Fernando Maestre Carmona
 *
 */
public class SecondHandBook extends Copy{


	private String _status;

	/**
	 * Constructor for Second Hand Book.
	 * @param isbn
	 * @param price
	 * @param name
	 * @param author
	 * @param category
	 * @param status
	 */
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

	/**
	 * Turns a Second hand book into a String array
	 * @return the copy represented as an array of strings
	 */
	public String[] toStringArray() {
		String[] data = {getISBN(), String.valueOf(getPrice()), getName(), getAuthor(), getCategory(), getStatus()};
		return data;
	}

	/**
	 * parses an array of strings to a Second hand book object
	 * @param data for the book
	 */
	public void toSHB(String[] data){
		setISBN(data[0]);
		setPrice(Float.parseFloat(data[1]));
		setName(data[2]);
		setAuthor(data[3]);
		setCategory(data[4]);
		setStatus(data[5]);

	}

	public void printSHB(){
		System.out.println("ISBN: " + getISBN());
		System.out.println("Name: "+ getName());
		System.out.println("Author: "+ getAuthor());
		System.out.println("Category: "+ getCategory());
		System.out.println("Price: "+ String.valueOf(getPrice()));
		System.out.println("Status: "+ getStatus());
	}

}
