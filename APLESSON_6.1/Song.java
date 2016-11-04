
public class Song 
{
		public static void main(String[] args)
		{
			for (int i = 0; i < 12; i++)
			{
				if(i < 8) 
				{
					System.out.print("Na ");
						if(i == 3)
							System.out.print("\n");
				}
				else if(i >= 8)
					if(i == 8)
						System.out.print("\n");
					else
						System.out.print("Hey ");
				if(i == 11)
					System.out.println("\nGoodbye!");
			}

		}
}
