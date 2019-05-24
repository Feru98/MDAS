package loanManager;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

//TODO COMPLETE DOCUMENTATION, READAPT TO NEW DESIGN

public class LoanMgt implements ILoanMgt{


	private int _nloan = 0;
	private ArrayList<Loan> loans_ = new ArrayList<Loan>(); //vector de facturas


	public int get_nloan() {
		return _nloan;
	}

	public void increment_nloan() {
		_nloan++;
	}

        /**
		 * Creates a loan and adds it to the 
		 * @param beginDate
		 * @param endDate
		 * @param amount
		 * @param customer
		 * @return
		 */
	public boolean createLoan(Date beginDate, Date endDate, float amount, Customer customer){
		//create loan
		Loan new_loan=new Loan(beginDate, endDate, _nloan, amount, customer, null);

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
         *
         * @param idInvoice id of the invoice to modify, this is also the index of the array of invoices
         * @param idCopy the book's ISBN
         */
	public void addCopy(int idLoan, String idCopy){
		Loan aux_loan = new Loan();
		aux_loan = loans_.get(idLoan);//gets desired loan
		ArrayList<String> v = new ArrayList<String>();
		v = aux_loan.get_ISBNs();
		v.add(v.size()+1, idCopy);
		aux_loan.set_ISBNs(v);
		loans_.add(idLoan, aux_loan);

	}


        /**
         *
         * @param idInvoice id of the invoice to modify, this is also the index of the array of invoices
         * @param idCopy the book's ISBN
         */
	public void deleteCopy(int idLoan, String idCopy){
		Loan aux=new Loan();
		aux=loans_.get(idLoan);//la factura actual
		ArrayList<String> v=new ArrayList<String>();
		v=aux.get_ISBNs();
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()){
			String x = itr.next();
			if(x == idCopy){
				itr.remove(); //borra ese libro
			}
		}

		aux.set_ISBNs(v);
		loans_.add(idLoan, aux);

	}

        /**
         *
         * @param id of the loan to modify, it's also the index of the array
         * @param date  new date of the loan
         * @param amount new amount of the loan
         */
	public void modifyLoan(int id, Date beginDate, Date endDate, float amount){
		Loan aux=new Loan();
		aux=loans_.get(id);
		aux.set_id(id);
		aux.set_beginDate(beginDate);
		aux.set_endDate(endDate);
		aux.set_amount(amount);
		loans_.add(id, aux);
	}


        /**
         *
         * @param id of the loan to be deleted
         */
	public void deleteLoan(int id){
		loans_.remove(id);
	}

}
