package client;
 

import java.util.Scanner;
import CopyManager.*;
import loanManager.*;

/**
 * Class that will allow us test the packages
 * @author Fernando Maestre Carmona 
 *
 */
public class Main {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		CopyMgt copyManager = new CopyMgt();
		LoanMgt loanManager = new LoanMgt();
		TestCopyMgt test1 = new TestCopyMgt();
		TestLoanMgt test2 = new TestLoanMgt();
		
		
		System.out.println("Press 1 to test SecondHandBook methods");
		System.out.println("Press 2 to test Loans methods");
		
		opcion = scanner.nextInt();
		
		switch(opcion) {
		
			case 1:
				copyManager = test1.testCopyMgt(copyManager); 
				break;
			
			case 2:
				loanManager = test2.testLoanMgt(loanManager); 
				break;
				
			default :
				System.out.println("Select a valid option");
				break;
				
		}
		
	}

}


