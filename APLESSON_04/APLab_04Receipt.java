import java.util.Scanner;

public class APLab_04Receipt
{
	public static void main(String[]args)
	{
		APLab_04Receipt receipt = new APLab_04Receipt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item1: ");
		String item1=kb.nextLine();
		System.out.println("Please enter price");
		Double price1 = kb.nextDouble();
		
		System.out.println("Please enter item2: ");
		kb.nextLine();
		String item2=kb.nextLine();
		System.out.println("Please enter price");
		Double price2 = kb.nextDouble();
		
		System.out.println("Please enter item3: ");
		kb.nextLine();
		String item3=kb.nextLine();
		System.out.println("Please enter price");
		Double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = (price1 + price2 + price3);
		double tax = (subtotal * .08);
		double total = (subtotal + tax);
		System.out.println("\n");
		receipt.format("subtotal", subtotal);
		receipt.format("tax", tax);
		receipt.format("total", total);
		
		System.out.println("\n_____________________________________\n* Thank you for your support *");
	
	}
	public void format(String item, double price)
	{
		System.out.printf("\n* %15s ........ %10.2f", item, price);
	}
}