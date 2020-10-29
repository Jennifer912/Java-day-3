
public class Main {

	public static void main(String[] args) {
		
		String num1, num2;
		float result;
		
		num1="shafeeq";
		num2="0";
		
		try {
			result=Integer.parseInt(num1)/Integer.parseInt(num2);
			System.out.println("Result is: "+result);
		}
		catch(NumberFormatException ref1) {
			System.out.println("Only digit can be used in operation");
		}
		catch(ArithmeticException ref2) {
			System.out.println("can not devide by zero");
		}
		catch(Exception ref) {
			System.out.println("Something went wrong.");
		}

	}

}
