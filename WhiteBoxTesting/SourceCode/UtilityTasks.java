package exp;

public class UtilityTasks
{
	public static void sort( int[] elements )
	{
		for ( int i = 0; i < elements.length - 1; i++ ) {
			for ( int j = i + 1; j < elements.length; j++ ) {
				if ( elements[ j ] < elements[ i ] ) {
					int temp = elements[ i ];
					elements[ i ] = elements[ j ];
					elements[ j ] = temp;
				}
			}
		}
	} // end method sort
	
	public static void uncertainAction()
	{
		int i = 2;
		float f = -12.3F;

		while(isPositive(i) ==  false) {
			System.out.printf("%.2f  ", abs(f));

			f--;
			i--;

			f = abs(f + 4 * ( f-2 /3)) + abs( i );

			while ( isPositive(i) ) {
				i++;
				f--;

				System.out.println( i + ": " + f );
			}
		} // end while

		if ( i * i > f ) {
			System.out.println( "i > f " );
		} else {
			System.out.println( " i < f" );
		}

		do {
			f = f *2;
			i--;
			f += i;
		} while ( f > 10 * i );

		int a = 5;
		int b = 6;
		while ( a < b ) {
			a ++;
			b--;
		}

		do {
			i--;
		} while( f < i );

		do {

		} while ( f < i );

		float x = 0.1F;
		if (x + 1 < 2) 
		{
			x = x + 1;
		} else {
			x = x - 1;
		}

		for ( float f1 = 20, f2 = 1.2F; f1 > f2; ) {
			f1 = f1 - 1;
			f2 = f2 + 1;

			System.out.println( f1 + ">" + f2 );

			System.out.printf( "%f%%d\n", f, a, b );
		}

		if ( f > 20 ) {
			System.out.println( "x > 2" );

			if ( x + 1 < 3 ) {
				System.out.println( "x + 1 < 3" );
				x++;
			} else {
				System.out.println( "x + 1 >= 3" );

				x--;
			}
		}
	} // end method uncertainAction

	public static void reduceFractions( byte u, byte v )
	{
		if ( v != 0 ) {
			byte uAb = u;
			byte vAb = v;

			if ( u < 0 )
				uAb = (byte) abstractOf( u );

			if ( v < 0 )
				vAb = (byte) abstractOf( v );

			byte gcd = gcd( uAb, vAb );
			uAb = (byte) ( uAb / gcd );
			vAb = (byte) ( vAb / gcd );

			System.out.println( u + " / " + v + " = " + uAb + " / " + vAb );
		}
	} // end method reduceFraction

	// greatest common divisor
	// Euclid's Algorithm: To find the greatest common divisor (gcd)
	// of two numbers: if 'u' is greater than 'v' then the greatest
	// common divisor of 'u' and 'v' is the same as the greatest common
	// divisor of 'v' and 'u-v'
	public static byte gcd( byte u, byte v )
	{
		byte t;

		while ( u > 0 ) {
			if ( u < v ) {
				t = u;
				u = v;
				v = t;
			}

			u = (byte) (u - v);
		}

		return v;
	} // end method gcd

	public static byte abstractOf( byte n )
	{
		if ( n >= 0 )
			return n;
		else
			return (byte) -n;
	} // end method abstractOf

	// ERROR
	public static void divide( int n )
	{
		int result = 0;

		for ( int count = 10; count >= -3; count-- ) {
			result = n / count;

			System.out.printf( "Result: %d\n", result );

			if ( result > 0 )
				System.out.printf( "n and count are the same sign: n = %d, count = %d", n, count );
			else
				System.out.printf( "n is equal zero or n and count are diffent sign: n = %d, count = %d", n, count );
		} // end for
	} // end method divide

	// check 'DO_WHILE' statement
	public static void inputNumber()
	{
		int num = 0;
		int fourMul = 0;

		do {
			System.out.print( "Input a number: " );

			if ( num % 4 == 1 ) {
				fourMul = num - 1;
			} else {
				if ( num % 4 == 2 ) {
					fourMul = num - 2;
				} else {
					if ( num % 4 == 3 ) {
						fourMul = num - 3;
					}
				}
			}

			System.out.printf( "%d", fourMul );
		} while ( num != 0 );
	} // end method inputNumber

	// check 'WHILE' statement and 'METHOD_CALL'
	public static int sumPositive( byte[] a )
	{
		int sum = 0;

		int count = 0;
		while( count < a.length ) {
			if ( isPositive( a[ count ] ) )
				sum += a[ count ];

			count++;
		}

		return sum;
	} // end method sumPositive

	// check 'WHILE' statement and 'METHOD_CALL'
	public static float sumAbstract( byte[] a )
	{
		float sum = 0;

		int count = 0;
		while( count < a.length ) {
			if ( isPositive( a[ count ] ) )
				sum += a[ count ];
			else
				sum += abs( a[ count ] );

			count++;
		}

		return sum;
	} // end method sumAbstract

	// check 'IF' statement and 'INT' argument
	static boolean isPositive(int n) {
		if(n > 0)
			return true;
		else
			return false;
	} // end method isPositive

	// check 'IF' statement and 'INT' argument
	public static float abs( float a ) {
		float b = 0.0F;
		if(a <= b){
			return (b - a);
		}

		return a;
	} // end method abs

	// check 'FOR' statement and 'FLOAT' array argument
	public static float sumOf( float[] array ) {
		float sum = 0.0F;

		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	} // end method sumOf

	// check 'SWITCH' statement
	/*
	 	// precondition
		precondition: c >= 'A'
		precondition: c <= 'Z'

		// postconditions
		postcondition: ret.equals( "ABCD" ) || ret.equals( "EFGH" ) || ret.equals( "Not ABCD or EFGH" )
		postcondition: ret.length() <= "Not ABCD or EFGH".length()
	 */
	public static String typeOfChar( char c )
	{
		String ret = "";

		switch ( c ) {
		case 'A':
			ret = "ABCD";
			break;
		case 'B':
			ret = "ABCD";
			break;
		case 'C':
			ret = "ABCE";
			break;
		case 'D':
			ret = "ABCD";
			break;

		case 'E':
			ret = "EFGH";
			break;
		case 'F':
			ret = "EFGH";
			break;
		case 'G':
			ret = "EFGH";
			break;
		case 'H':
			ret = "EFGH";
			break;

		default:
			ret = "Not ABCD or EFGH";
		}

		return ret;
	} // end method typeOfChar

	// check the ability of generating test cases
	public void method1( String arg1, int arg2, double arg3, boolean arg4, float a )
	{
	}

	public void method2()
	{

	}

	public int method3( String[] arg1, int[] arg2, char arg3 )
	{
		return 0;
	}

	public void method4( double[] arg1, float arg2, double arg3, float[] arg4 )
	{

	}

	public void method5( boolean arg1, char arg2, boolean[] arg3, char[] arg4 ) {

	}

	public void method6( byte arg1, short arg2, long arg3, boolean arg4,
			byte[] arg5, short[] arg6, long[] arg7 )
	{

	}
} // end class UtilityTasks