
public class main {

	public static void main(String[] args) {
		
		int num1, num2;
		num1=10;
		num2=0;
		
		try {
			
			int result=num1/num2;
			
			System.out.println("The result is "+result);
			System.out.println("Hello");
			System.out.println("my");
			System.out.println("friends");
		}
		catch(NumberFormatException ref1) {
			System.out.println("Can do the conversation");
		}
		catch(ArithmeticException ref2) {
			System.out.println("You are not allowed to devide anything by zero");
		}
		System.out.println("Hello my friends");

	}

}
