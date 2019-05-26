package client;

import java.time.LocalDate;
import java.util.Scanner;

import lendCopySystem.*;

/**
 * TestLendCopy
 * @author Miguel Ángel Ramírez
 */
public class TestLendCopy {

    public void testlendCopySystem(ILendCopy lendsys) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		int x=1;
		String isbn;
		int id_customer, id_loan;

		while(x==1) {
			System.out.println("Press 1 to get the details of a Book");
			System.out.println("Press 2 to check if a book is available");
			System.out.println("Press 3 to register a customer");
			System.out.println("Press 4 to validate a customer's id");
			System.out.println("Press 5 to register a loan");
			System.out.println("Press 6 to query all loans");
			System.out.println("Press 7 to return a loan");
			System.out.println("Press 8 to update all loans");
			System.out.println();
			System.out.println("Press 0 to exit");

			opcion = scanner.nextInt();

			switch(opcion) {

			case 1:
				System.out.println("Type the isbn of the book");
				scanner.nextLine();
				isbn = scanner.nextLine();
				try {
					lendsys.getCopyData(isbn).printSHB();
				} catch (Exception e) {
					System.out.println("ERROR: Book does not exist");
					System.err.println(e);
				}
				break;

			case 2:
				System.out.println("Type the isbn of the book");
				scanner.nextLine();
				isbn = scanner.nextLine();
				if (lendsys.checkAvailability(isbn)) {
					System.out.println("The book is available");
				} else {
					System.out.println("The book is not available");
				}
				break;

			case 3:
				int option2;
				System.out.println("You will register a new customer as:");
				System.out.println("ID: 12345");
				System.out.println("NAME: John");
				System.out.println("Surname: Doe");
				System.out.println("Address: Wall Street 23");
				System.out.println("Phone: 902 000 000");
				System.out.println();
				System.out.println("Continue? 1 = YES // else = NO");

				option2 = scanner.nextInt();

				if(option2 == 1){
					System.out.println("Adding John Doe to the agenda");
					lendsys.registerCustomer(12345, "John", "Doe", "Wall Street 23", 902000000);
				}
				break;

			case 4:
				System.out.println("Type the id of a customer");

				id_customer = scanner.nextInt();
				if (lendsys.validateCredentials(id_customer)) {
					System.out.println("Customer found in the agenda!");
				}else{
					System.out.println("Error: customer not found");
				}

				break;

			case 5:
				System.out.println("Enter a Customer id (integer)");
				
				id_customer = scanner.nextInt();

				if (lendsys.validateCredentials(id_customer) == true) {
					String[] isbn_list = {};
					int option_iterate = 1;
					while (option_iterate >= 1) {
						System.out.println("Enter an ISBN of a book (String)");
						
						scanner.nextLine();
						String aux = scanner.nextLine();
						
						if (lendsys.checkAvailability(aux) == true) {
							System.out.println("Adding book to Loan");
							isbn_list[option_iterate - 1] = aux;
						} else {
							System.out.println("Error: book not available");
						}
						

						System.out.println("Do you want to add another book? (Yes = 1 | No = 0/other)");
						if (scanner.nextInt() == 1) {
							option_iterate++;
						}else{
							option_iterate = 0;
						}

					}

					System.out.println("Registring loan:");
					if (lendsys.registerLoan(LocalDate.now(), id_customer, isbn_list)) {
						System.out.println("Loan Registered successfully");
					} else {
						System.out.println("Error: Something went wrong. Please try again.");
					}

				} else {
					System.out.println("Error: Customer does not exist. Can not perform loan registry");
				}

				break;

			case 6:
				System.out.println("Printing all loans:\n");
				lendsys.printLoans();
				break;

			case 7:
				System.out.println("Enter the Loan ID: ");

				id_loan = scanner.nextInt();

				if (lendsys.returnLoan(id_loan)) {
					System.out.println("Loan Returned successfully");
				} else {
					System.out.println("Error: Something went wrong.");
				}

				break;

			case 8:

				break;

			case 0:

				break;

			default :
				System.out.println("Select a valid option");
				break;

			}

		}

	}
}