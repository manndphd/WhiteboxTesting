package exp;

//19.5 (Bubble Sort)
//BubbleSort.java
import java.util.Random;
import java.util.Arrays;

public class BubbleSort
{
	private int[] data;
	private static final Random randomNumber = new Random();

	public BubbleSort( int size )
	{
		data = new int[ size ];

		for ( int i = 0; i < size; i++ )
			data[ i ] = 10 + randomNumber.nextInt( 90 );
	} // end BubbleSort constructor

	public void sort()
	{
		bubbleSort( data );
	} // end method sort

	public void bubbleSort( int[] array )
	{
		for ( int i = array.length - 1; i >= 1; i-- ) {
			for ( int j = 0; j < i; j++ )
				if ( array[ j ] > array[ j + 1 ] ) {
					swap( array, j, j + 1 );
				}
		} // end outer for
	} // end method sort

	public void swap( int[] array, int index1, int index2 )
	{
		int temp = array[ index1 ];
		array[ index1 ] = array[ index2 ];
		array[ index2 ] = temp;
	} // end method swap

	public String toString()
	{
		return Arrays.toString( data );
	} // end method toString
	
	public static void main( String[] args )
	{
		BubbleSort bs = new BubbleSort( 15 );
		bs.sort();
		System.out.println( bs );
	}
} // end class BubbleSort