package day2;
import java.util.Scanner;
public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the model");
		String model="";
		int Year_of_res=0;
		float Emi=0;
		model=scan.nextLine();
		switch(model)
		{
		case "R15":
			System.out.println("Enter The Year of Registratrion");
			Year_of_res=scan.nextInt();
			if(Year_of_res<=2015){
			System.out.println("There is only one owner price 89000 and the year of registration is 2015");
			Emi=(89000/36)+((89000*10)/3600);
			System.out.println("The Buyer can pay it in installment.The Instalment per month is: "+Emi);
			break;
			}
			else if(Year_of_res>2015)
			System.out.println("There is only one owner price 120000 and the year of registration is 2017");
			break;
		case "Enfield":
			System.out.println("Two owners price 67900");
			break;
		case "Avenger":
			System.out.println("One owner price 79010");
			break;
		case "Splender":
			System.out.println("Three owners price 56900");
			break;
		}
		scan.close();
		
	}

}
