/**
 * 
 */
package patterns;

import org.testng.annotations.Test;

/**
 * @author Nakul-PC
 *		
 *	output should be
 *
 *			*****
 *			 ****
 *			  ***
 *			   **
 *				*
 *
 */
public class Star_Pattern_3 
{

	@Test
	public static void starPattern()
	{
		int k=5;
		for(int i=5;i>0;i--)
		{
			if(k>i)
				{
					for(int l=0;l<(k-i);l++)
					System.out.print(" ");
				}
					for(int j=i;j>0;j--)
					{
						System.out.print("*");
					}
						System.out.println();		
		}
	}

}
