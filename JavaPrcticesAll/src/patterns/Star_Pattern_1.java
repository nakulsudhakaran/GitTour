/**
 * 
 */
package patterns;

import org.testng.annotations.Test;

/**
 * @author Nakul-PC
 * 
 * output should be
 * 
 * 				*						1
 * 				**						12
 * 				***			OR 			123
 * 				****					1234
 * 				*****					12345
 *
 */
public class Star_Pattern_1 {

	/**
	 * @param args
	 */
	@Test
	public static void starPattern() 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
				System.out.println();
		}		
	}

}
