package loanManager;
import java.util.Date;
import java.util.ArrayList;

/**
 * Class that implements the functions of interface ILoanMgt
 * @author Miguel Ramírez
 */
public class LoanMgt implements ILoanMgt{


	private int _nloan = 0; //number to handle loan identifiers
	private ArrayList<Loan> loans_ = new ArrayList<Loan>(); //Loan Array



	/**
	 * gets the _nloan parameter
	 * @return the _nloan parameter
	 */
	private int get_nloan() {
		return _nloan;
	}

	/**
	 * increments the parameter _nloan
	 */
	private void increment_nloan() {
		_nloan++;
	}

	/**
	 * Gets the loan with the id "id"
	 * @param id of the loan
	 * @return the found loan
	 */
	private Loan getLoan(int id){
		for (int i = 0; i < loans_.size(); i++) {
			if (loans_.get(i).get_id() == id) {
				return loans_.get(i);
			}
		}
		return null;
	}

	private int getnLoan(int id) {
		for (int i = 0; i < loans_.size(); i++) {
			if (loans_.get(i).get_id() == id) {
				return i;
			}
		}
		return -1;
	}

        /**
		 * Creates a loan and adds it to the array
		 * @param beginDate
		 * @param endDate
		 * @param amount
		 * @param customer
		 * @return true if success, false if failure
		 */
	public boolean createLoan(Date beginDate, Date endDate, float amount, int id_customer){
		//create loan
		Delay delay = new Delay(get_nloan(), 0, 0);
		Loan new_loan=new Loan(beginDate, endDate, get_nloan(), amount, id_customer, delay);

		try {
			//increments identifier for next time and adds loan to array
			this.increment_nloan();
			loans_.add(loans_.size()+1, new_loan);

			return true;
		} catch (Exception e) {
			//if failure, returns false
			return false;
		}

	}


	/**
	 * Adds a copy to a loan
	 * @param id_loan id of the invoice to modify
	 * @param idCopy the book's ISBN
	 * @return true if success, false if failure
	 */
	public boolean addCopy(int id_loan, String idCopy){
		try {
			//Auxiliar variables
			Loan aux_loan = getLoan(id_loan); //gets the loan with the id
			ArrayList<String> aux_isbns = aux_loan.get_ISBNs(); //gets the list of isbns

			aux_isbns.add(aux_isbns.size()+1, idCopy); //ads the isbn to the loan
			aux_loan.set_ISBNs(aux_isbns);

			return true;

		} catch (Exception e) {
			return false;
		}
	}


        /**
         * Deletes a copy from a loan
         * @param id_loan id of the invoice to modify
         * @param idCopy the book's ISBN
         */
	public boolean deleteCopy(int id_loan, String idCopy){
		try {
			//Auxiliar variables
			Loan aux_loan = getLoan(id_loan); //gets the loan with the id
			ArrayList<String> aux_isbns = aux_loan.get_ISBNs(); //gets the list of isbns

			aux_isbns.remove(idCopy); //removes the isbn from the loan
			aux_loan.set_ISBNs(aux_isbns);

			return true;

		} catch (Exception e) {
			return false;
		}

	}

    /**
	 * Updates a loan
	 * @param id_loan id of the loan to update
	 * @return true if success, false if failure
	 */
	public boolean updateLoan(int id_loan){
		try {
			//Auxiliar variables
			Loan aux_loan = getLoan(id_loan); //gets the loan with the id
			Date now = new Date();
			if (aux_loan.get_delay().get_days() != -1) {
				if (aux_loan.get_endDate().before(now)) {
					long diff = now.getTime() - aux_loan.get_endDate().getTime(); //get amount of days of delay
					diff = diff / (1000*60*60*24); //turned into days

					//Updating days and punishment
					aux_loan.get_delay().set_days((int)diff);
					aux_loan.get_delay().set_punishementAmount(diff*10);
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}

	}


    /**
	 * Deletes a loan from the array
	 * @param id of the loan
	 * @return true if success, false if failure
	 */
	public boolean deleteLoan(int id){
		try {
			loans_.remove(getnLoan(id)); //removal of loan with the id "id"

			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
