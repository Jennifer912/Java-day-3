
public class MainEntryPoint {

	public static void main(String[] args) {
		Accounts salesdepartment=new Accounts();
		Accounts ITdepartment=new Accounts();
		
		try {
			salesdepartment.salarySlip("Shafeeq", 1000, 15);
		}
		catch(AbsentiesException t) {
			System.out.println("Please send me the report");
		}
		
		try {
			ITdepartment.salarySlip("Ali", 5000, 12);
			
		}
		catch(AbsentiesException E) {
			System.out.println("no this is fine.");
		}
		

	}

}
