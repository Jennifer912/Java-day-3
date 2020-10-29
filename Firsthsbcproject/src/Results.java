
public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physics, chemistry, maths,total;
		float percentage;
		physics=9;
		chemistry=5;
		maths=9;
		total=physics+chemistry+maths;
		percentage=(float)total*100/300;
		System.out.println("total marks :" + total);
		System.out.println("Percentage: " + percentage);
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}
		else {
			if (percentage>=80) {
			System.out.println("Grade B");	
		}
		    else {
			    if (percentage>=70) {
			    	System.out.println("Grade C");
			    }
			    else {
			    	System.out.println("Fail");
			    }
		    }
		}
	}

}
