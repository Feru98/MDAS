package client;

import java.util.Scanner;

import lendCopySystem.*;

/**
 * TestLendCopy
 * @author Miguel Ángel Ramírez
 */
public class TestLendCopy {

    public void testlendCopySystem(LendCopy lendsys) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
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

			break;

		case 2:

			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			break;

		case 6:

			break;


		default :
			System.out.println("Select a valid option");
			break;

	}

		}

	}
}