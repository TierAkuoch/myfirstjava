/**
 * 
 */
package myfirstjava;

/**
 * @author user
 *

	/**
	 * @param args
	 */
import java.util.Scanner;
public class Tier {

	public static void main(String[] args) {
		
		int ans, sub, a;
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter the value of a:");
		sub = sc.nextInt();
		System.out.println( "Enter the value of a againt:");
		a = sc.nextInt();
		try
		{
		ans = sub - a;
		System.out.println( "the value of: " +a);
		}
		catch (ArithmeticException e)
		{
		System.out.println( "You have entered:");
		System.out.println("System");
		int ans =sub - 2 ;
		System.out.print( a );
		}
		}

	}

