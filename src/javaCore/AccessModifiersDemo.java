package javaCore;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Default : If you do not mention any access modifier then the method/variable has 'default' access modifier
		 * default method/variable can be accessed only in the package
		 */
		
		/*Public : If you mention public access modifier then the method/variable has 'public' access modifier
		 * default method/variable can be accessed outside the package also
		 */
		
		/*Private : If you mention private access modifier then the method/variable has 'private' access modifier
		 * private method/variable can be accessed only within the class
		 */
		
		/*Protected : If you mention protected access modifier then the method/variable has 'protected' access modifier
		 * protected method/variable can be accessed only by the classes within the package and the classes inheriting the class having protected method outside the package
		 */
		
		try{
			
			int a=5;
			int b=0;
			
			int c = a/b;
			
			System.out.println(c);
		}
		
		catch(ArithmeticException ae){
			System.out.println("Invalid Division");
		}
		
		catch(Exception e){
			System.out.println("Invalid Operation");
		}
		
		finally{
			System.out.println("This block is always executed");
		}

	}

}
