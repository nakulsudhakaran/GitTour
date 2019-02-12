/**
 * 
 */
package patterns;

import org.testng.annotations.Test;

/**
 * @author Nakul-PC
 * 
 * 
 * 	output Should be
 * 		*****
 * 		****
 * 		***		
 *		**
 *		*
 */
public class Star_Pattern_2 {

	/**
	 * @param args
	 */
	@Test
	public static void starPattern() 
	{
		for(int i=5;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
