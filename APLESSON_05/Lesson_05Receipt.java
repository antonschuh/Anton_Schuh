import java.util.Scanner;
public class Lesson_05Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		kb.nextLine();
		System.out.println("Please enter item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2 ");
		kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3: ");
		kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("Please enter item 4: ");
		kb.nextLine();
		String item4 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = tax + subtotal - discount;
		System.out.println("\n");
		
		System.out.println("<<<<<<< Receipt >>>>>>>");
		
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		System.out.println("\n");
		
		format("subtotal", subtotal);
		format("discount", discount);
		format("tax", tax);
		format("total", total);
		
		System.out.println("_____________________________\nThank you for coming");
	}
	
	public static double calcDisc(double sub)
	{
		if (sub > 2000)
			return sub * 0.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%10s..........%.2f\n",item,price);
	}
}