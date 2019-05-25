package client;

import java.util.Scanner;

import CopyManager.SecondHandBook;
import loanManager.*;

public class TestLoanMgt {
	
	public LoanMgt testLoanMgt(LoanMgt manager) {
		
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		Loan loan = new Loan();
		loan.set_id(1);
		Loan loan2 = new Loan();
		loan.set_id(2);
		int x=1;
		
		while(x==1) {
		System.out.println("Press 1 to add Loan ");
		System.out.println("Press 2 to remove Loan");

		
		opcion = scanner.nextInt();
		
		switch(opcion) {
		
		case 1:
			//manager.createLoan(loan);
			break;
			
		case 2:
			manager.deleteLoan(1);
			break;
			
		
			
			
		default :
			System.out.println("Select a valid option");
			break;
			
	}
		
		}
		
		return manager;
	}

}
