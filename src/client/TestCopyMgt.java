package client;

import java.util.Scanner;
import CopyManager.*;

/**
 * Class that will allow us test the package CopyManager
 * @author Fernando Maestre Carmona 
 *
 */
public class TestCopyMgt {
	
	public CopyMgt testCopyMgt(CopyMgt manager) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		SecondHandBook book = new SecondHandBook("aaa", 3 , "xd", "fer ", "drama", "notavailable");
		int x=1;
		
		while(x==1) {
		System.out.println("Press 1 to add SecondHandBook ");
		System.out.println("Press 2 to remove SecondHandBook");
		System.out.println("Press 3 Print books");
		System.out.println("Press 4 Changue book status");
		System.out.println("Press 5 See book status");
		System.out.println("Press 6 to exit");
		
		opcion = scanner.nextInt();
		
		switch(opcion) {
		
		case 1:
			manager.addCopy(book);
			break;
			
		case 2:
			manager.deleteCopy("aaa");
			break;
			
		case 3:
			manager.printCopys();
			break;
			
		case 4:
			manager.changeCopyStatus(book, "available");
			break;
		
		case 5:
			System.out.println(manager.getCopyDetails("aaa").getStatus());
			break;
			
		case 6:
			x=0;
			break;
			
			
		default :
			System.out.println("Select a valid option");
			break;
			
	}
		
		}
		return manager;
	
	
	}
}
