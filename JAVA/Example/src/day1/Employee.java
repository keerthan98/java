package day1;

public class Employee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		String Ename,Cname;
		double salary=0.0;
		double experience=0;
		double credit_score=0.0,Loan=0.0;
		salary=Double.parseDouble(args[0]);
		Ename=args[1];
		Cname=args[2];
		experience=Double.parseDouble(args[3]);
		if(experience >2 && experience<=4)
			System.out.println("The Employee can be promoted as a Team Lead");
		else if(experience >4 && experience<8)
			System.out.println("The Employee can be promoted as a Project manager");
		else if(experience >8)
			System.out.println("The employye can be promoted as a BDM");
		else
			System.out.println("No Promotion");
		credit_score=(1/3)*salary;
		Loan=(1/4)*salary;
		System.out.println("The Employee "+Ename+" of company "+Cname+" can avail for a credit of "+credit_score);
		System.out.println("The Employee "+Ename+" of company "+Cname+" can avail for a loan of "+Loan);
		
	}

}
