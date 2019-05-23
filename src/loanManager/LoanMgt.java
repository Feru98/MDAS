package loanManager;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

//TODO COMPLETE DOCUMENTATION, READAPT TO NEW DESIGN

public class LoanMgt{
	/*
	private Date date = new Date();
	private float amount_;
	private int idInvoice_;
	private String idCopy_;
	*/

	//private int numInvoices_=0; //guarda cuantas veces se ha llamado al manager y lo usa como id de la factura
	private ArrayList<Loan> loans_ = new ArrayList<Loan>(); //vector de facturas
        
        /**
         * 
         * @param date date of the loan
         * @param amount amount of the loan
         * @return a new loan
         */
	public Loan createLoan(Date beginDate, Date endDate, float amount){
		Loan a=new Loan(beginDate, endDate, loans_.size()+1, amount);
		
		//a.set_date(date);
		//a.set_id(loans_.size+1);
		//a.set_amount(amount);
		//ahora anyado la nueva factura a un vector de facturas
		
		loans_.add(loans_.size()+1, a);

		return a;

	}


	/**
         * 
         * @param idInvoice id of the invoice to modify, this is also the index of the array of invoices
         * @param idCopy the book's ISBN
         */
	public void addCopy(int idLoan, String idCopy){	
		Loan aux=new Loan();
		aux=loans_.get(idLoan);//la factura actual
		ArrayList<String> v=new ArrayList<String>();
		v=aux.get_ISBNs();
		v.add(v.size()+1, idCopy);
		aux.set_ISBNs(v);
		loans_.add(idLoan, aux);
		
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
	public void modifyInvoice(int id, Date beginDate, Date endDate, float amount){
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
		loans_.remove(0);
	}

}
