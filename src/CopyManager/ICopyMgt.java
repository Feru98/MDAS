package CopyManager;

/**
 * Copy Mgt interface
 * @author Fernando Maestre Carmona
 *
 */
public interface ICopyMgt {
	
	
	/**
	 * Method that gets a copy and a new status and change that copy status to the new one
	 * @param a
	 * @param status
	 */
	public void changeCopyStatus(SecondHandBook a , String status);
	
	/**
	 * Method that get a copy isbn and returns the second hand book that matches it
	 * @param id = string that is the isbn of a copy
	 * @return the second hand book that matches the isbn or null if not found
	 */
	public SecondHandBook getCopyDetails(String id);
		
	/**
	 * Method that receives a SecondHandBook and adds it to the array
	 * @param aux
	 */
	public void addCopy(SecondHandBook aux);
		
	/**
	 * Method that receives a SecondHandBook and removes it to the array
	 * @param id
	 */
	public void deleteCopy(String id);

	/**
	 * Exports to a CSV file the copies
	 */
	public void exportToCSV();

	/**
	 * Gets copies from a CSV file
	 */
	public void importFromCSV();
}
