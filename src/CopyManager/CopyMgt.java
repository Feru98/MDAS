package CopyManager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.*;


/**
 * Class for Copy Manager
 * 
 * @author Fernando Maestre Carmona
 *
 */
public class CopyMgt implements ICopyMgt {

	/**
	 * Array of second hand books
	 */
	private ArrayList<SecondHandBook> books = new ArrayList<SecondHandBook>();

	/**
	 * Method that gets a copy and a new status and change that copy status to the
	 * new one
	 * 
	 * @param a
	 * @param status
	 */
	public void changeCopyStatus(SecondHandBook a, String status) {
		a.setStatus(status);
		exportToCSV();
	}

	/**
	 * Method that get a copy isbn and returns the second hand book that matches it
	 * 
	 * @param id = string that is the isbn of a copy
	 * @return the second hand book that matches the isbn or null if not found
	 */
	public SecondHandBook getCopyDetails(String id) {

		for (int i = 0; i < books.size(); i++) {
			String s = books.get(i).getISBN();
			if (s.equals(id)) {
				return books.get(i);
			}
		}

		return null;
	}

	/**
	 * Method that receives a SecondHandBook and adds it to the array
	 * 
	 * @param aux
	 */
	public void addCopy(SecondHandBook aux) {
		books.add(aux);
		exportToCSV();
	}

	/**
	 * Method that receives a SecondHandBook and removes it to the array
	 * 
	 * @param id
	 */
	public void deleteCopy(String id) {

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getISBN() == id) {
				books.remove(books.get(i));
			}
		}

		exportToCSV();

	}


	public void printCopys() {
		for (int i = 0; i < books.size(); i++) {
			String s = books.get(i).getISBN();
			System.out.println(s);

		}
	}

	/**
	 * Exports to a CSV file the copies
	 */
	public void exportToCSV() {
		File file = new File("./copies.csv");
		try {
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);

			String[] data;

			for (int i = 0; i < books.size(); i++) {
				data = books.get(i).toStringArray();
				writer.writeNext(data);
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets copies from a CSV file
	 */
	public void importFromCSV() {
		File file = new File("./copies.csv");
		try {
			FileReader inputfile = new FileReader(file);
			CSVReader reader = new CSVReader(inputfile);

			deleteAll();

			String[] data;
			SecondHandBook copy = new SecondHandBook("", 0, "", "", "", "");

			while ((data = reader.readNext()) != null) {
				copy.toSHB(data);
				addCopy(copy);
			}

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void deleteAll() {
		for (int i = 0; i < books.size(); i++) {
			books.remove(i);
		}
	}

}
