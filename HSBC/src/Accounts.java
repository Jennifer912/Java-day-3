
public class Accounts {
	
	public void salarySlip(String name, int salary, int absenties)throws AbsentiesException{
		float tax, netsalary;
		if(absenties>10) {
			
			AbsentiesException ref =new AbsentiesException();
			throw ref;
		}
		else {
			tax=(float)salary*25/100;
			netsalary=salary-tax;
			System.out.println("Employee name"+name);
			System.out.println("Your salary is "+salary);
			System.out.println("Your tax is "+tax);
			System.out.println("Your net salary is: "+netsalary);
		}
	}

}
