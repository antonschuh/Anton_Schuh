import java.lang.Math;

/**
* A helper class that has methods to shuffle a deck of cards.
*/
public class Shuffler 
{
   /**
    * The number of consecutive shuffle steps to be performed in each call
    * to each sorting procedure.
    */
   private static final int SHUFFLE_COUNT = 5;

   /**
    * The number of values to shuffle.
    */
   private static final int VALUE_COUNT = 10;

   /**
    * Tests shuffling methods.
    * @param args is not used.
    */
   public static void main(String[] args) 
   {
       System.out.println("Results of " + SHUFFLE_COUNT +
                                " consecutive perfect shuffles:");
       int[] values1 = new int[VALUE_COUNT];
       for (int i = 0; i < values1.length; i++) 
       {
           values1[i] = i;
       }
       
       for (int j = 1; j <= SHUFFLE_COUNT; j++) 
       {
           perfectShuffle(values1);
           System.out.print("  " + j + ":");
           
           for (int k = 0; k < values1.length; k++) 
           {
               System.out.printf(" %2d", values1[k]);
           }
           
           System.out.println();
       }
       
       System.out.println();
       System.out.println("Results of " + SHUFFLE_COUNT +
                                " consecutive efficient selection shuffles:");
       int[] values2 = new int[VALUE_COUNT];
       
       for (int i = 0; i < values2.length; i++) 
       {
           values2[i] = i;
       }
       
       for (int j = 1; j <= SHUFFLE_COUNT; j++) 
       {
           selectionShuffle(values2);
           System.out.print("  " + j + ":");
           for (int k = 0; k < values2.length; k++) 
           {
               System.out.printf(" %2d", values2[k]);
           }
           
           System.out.println();
       }
       
       System.out.println();
   }


   	/**
   	 * Apply a "perfect shuffle" to the argument.
   	 * The perfect shuffle algorithm splits the deck in half, then interleaves
   	 * the cards in one half with the cards in the other.
   	 * @param values is an array of integers simulating cards to be shuffled.
   	 */
   	public static void perfectShuffle(int[] values) 
   	{
   		int[] half1 = new int[ VALUE_COUNT / 2 ];
   		int[] half2 = new int[ VALUE_COUNT - VALUE_COUNT / 2 ];

   		for( int i = 0; i < VALUE_COUNT / 2; i++ ) 
   		{
   			half1[i] = values[i];
   		}

   		for( int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++ ) 
   		{
   			half2[i] = values[ i + VALUE_COUNT / 2 ];
   		}

   		for( int i = 0; i < VALUE_COUNT / 2; i++ ) 
   		{
   			values[ 2 * i ] = half2[i];
   			values[ 2 * i + 1 ] = half1[i];
   		}

   		if( VALUE_COUNT % 2 != 0 ) 
   		{
   			values[ VALUE_COUNT - 1 ] = half2[ VALUE_COUNT - VALUE_COUNT / 2 ];
   		}
   	}

   	/**
   	 * Randomly shuffles a deck of cards.
   	 * @param values is an array of integers simulating cards to be shuffled.
   	 */
   	public static void selectionShuffle(int[] values) 
   	{
   		for( int k = VALUE_COUNT - 1; k >= 0; k-- ) 
   		{
   			int r = (int)(Math.random() * k);
   			int tmp = values[r];
   			values[r] = values[k];
   			values[k] = tmp;
   		}
   	}
}