package client;
 

import java.util.Scanner;
import CopyManager.*;

/**
 * Class that will allow us test the packages
 * @author Fernando Maestre Carmona 
 *
 */
public class Main {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		CopyMgt manager = new CopyMgt();
		TestCopyMgt test1 = new TestCopyMgt();
		
		System.out.println("Press 1 to test SecondHandBook methods");
		System.out.println("Press 2 to test ...");
		
		opcion = scanner.nextInt();
		
		switch(opcion) {
		
			case 1:
				manager = test1.testCopyMgt(manager); 
				break;
				
			default :
				System.out.println("Select a valid option");
				break;
				
		}
		
	}

}


