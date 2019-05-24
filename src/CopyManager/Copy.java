package CopyManager;

/**
 * Class for Copy
 * @author fer
 *
 */
public class Copy extends Book{
   private String _isbn;
   private float _price;
   
   /**
    * Constructor for Copy 
    * @param isbn
    * @param price
    * @param name
    * @param author
    * @param category
    */
   public Copy(String isbn, float price, String name, String author, String category) {
	   setISBN(isbn);
	   setPrice(price);
	   setName(name);
	   setAuthor(author);
	   setCategory(category);
   }
   
   public Copy(String isbn){}
   
   /**
    * @return the _isbn
    */
   public String getISBN() {
	   return _isbn;
   }
   /**
    * @param _isbn the _isbn to set
    */
   public void setISBN(String _isbn) {
	   this._isbn = _isbn;
   }
   
   /**
    * @return the _price
    */
   public float getPrice() {
	   return _price;
   }
   /**
    * @param _price the _price to set
    */
   public void setPrice(float _price) {
	   this._price = _price;
   }
   
   

}
