/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class DoWhileLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do{
			int doubled = i * 2;
			System.out.println(i + " times two equals " + doubled);
			i++;
		}while(i <= 10);
		System.out.println("End of program");
	}
}
