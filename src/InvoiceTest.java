/*
 * David Casarrubias-Mena
 * February 12, 2015
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner input;
		String partNumber;
		String description;
		int quantityOfItem;
		double priceOfItem;
		Invoice invoice;
		List<Invoice> invoices;

		invoices = new ArrayList<Invoice>();

		try {
			input = new Scanner(new File("invoice.txt"));
			while (input.hasNext()) {
				partNumber = input.next();
				description = input.next();
				priceOfItem = input.nextDouble();
				quantityOfItem = input.nextInt();

				Invoice i = new Invoice(partNumber, description, quantityOfItem, priceOfItem);
				invoices.add(i);

				System.out.println(i);
				System.out.println(i + " The item number is: " + " " +partNumber + ", description is: " + " " +description + ", the quantity sold is: " + " " + quantityOfItem + ", the price is: " + priceOfItem + ", the grand total is: " + i.getInvoiceAmount());
				
				

			}

		} catch (Exception caught) {
			System.err.println("Some bad happened: " + caught);
		}

		

	}
}
