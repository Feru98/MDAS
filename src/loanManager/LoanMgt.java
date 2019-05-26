package loanManager;
import java.time.LocalDate;
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
		 * @param beginLocalDate
		 * @param endLocalDate
		 * @param amount
		 * @param id_customer
		 * @return the id of the if success, -1 if failure
		 */
	public int createLoan(LocalDate beginLocalDate, LocalDate endLocalDate, float amount, int id_customer){
		//create loan
		Delay delay = new Delay(get_nloan(), 0, 0);
		Loan new_loan=new Loan(beginLocalDate, endLocalDate, get_nloan(), amount, id_customer, delay);

		try {
			//increments identifier for next time and adds loan to array
			this.increment_nloan();
			loans_.add(loans_.size(), new_loan);

			return get_nloan() - 1;
		} catch (Exception e) {
			System.err.println(e);
			//if failure, returns -1
			return -1;

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

			aux_isbns.add(idCopy); //ads the isbn to the loan
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
			LocalDate now = LocalDate.now();
			if (aux_loan.get_delay().get_days() != -1) {
				if (aux_loan.get_endLocalDate().isBefore(now)) {
					long diff = now.toEpochDay() - aux_loan.get_endLocalDate().toEpochDay(); //get amount of days of delay

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

	@Override
	public ArrayList<Loan> getLoans(){
		return loans_;
	}

	@Override
	public ArrayList<String> returnLoan(int id_loan) {
		try {
			Loan aux_loan = getLoan(id_loan);
			aux_loan.get_delay().set_days(-1);
			ArrayList<String> aux_isbns = aux_loan.get_ISBNs();
			
			return aux_isbns;
		} catch (Exception e) {
			return null;
		}
		
	}

}
