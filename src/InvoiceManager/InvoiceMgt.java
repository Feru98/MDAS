package InvoiceManager;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class InvoiceMgt{
	/*
	private Date date = new Date();
	private float amount_;
	private int idInvoice_;
	private String idCopy_;
	*/

	//private int numInvoices_=0; //guarda cuantas veces se ha llamado al manager y lo usa como id de la factura
	private ArrayList<Invoice> invoices_ = new ArrayList<Invoice>(); //vector de facturas
        
        /**
         * 
         * @param date date of the invoice
         * @param amount amount of the invoice
         * @return a new invoice
         */
	public Invoice createInvoice(Date date, float amount){
		Invoice a=new Invoice(date, invoices_.size()+1, amount);
		
		//a.set_date(date);
		//a.set_id(invoices_.size+1);
		//a.set_amount(amount);
		//ahora anyado la nueva factura a un vector de facturas
		
		invoices_.add(invoices_.size()+1, a);

		return a;

	}


	/**
         * 
         * @param idInvoice id of the invoice to modify, this is also the index of the array of invoices
         * @param idCopy the book's ISBN
         */
	public void addCopy(int idInvoice, String idCopy){	
		Invoice aux=new Invoice();
		aux=invoices_.get(idInvoice);//la factura actual
		ArrayList<String> v=new ArrayList<String>();
		v=aux.get_ISBNs();
		v.add(v.size()+1, idCopy);
		aux.set_ISBNs(v);
		invoices_.add(idInvoice, aux);
		
	}

	
        /**
         * 
         * @param idInvoice id of the invoice to modify, this is also the index of the array of invoices
         * @param idCopy the book's ISBN
         */
	public void deleteCopy(int idInvoice, String idCopy){ 
		Invoice aux=new Invoice();
		aux=invoices_.get(idInvoice);//la factura actual
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
		invoices_.add(idInvoice, aux);

	}

        /**
         * 
         * @param id of the invoice to modify, it's also the index of the array
         * @param date  new date of the invoice
         * @param amount new amount of the invoice
         */
	public void modifyInvoice(int id, Date date, float amount){
		Invoice aux=new Invoice();
		aux=invoices_.get(id);
		aux.set_id(id);
		aux.set_date(date);
		aux.set_amount(amount);
		invoices_.add(id, aux);
	}


        /**
         * 
         * @param id of the invoice to be deleted
         */
	public void deleteInvoice(int id){
		invoices_.remove(0);
	}

