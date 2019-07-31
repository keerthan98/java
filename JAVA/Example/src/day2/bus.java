package day2;

import java.util.Scanner;

public class bus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,j=1,k=0;
		double Bus_fare,cost,sum1=0,sum2=0;
		
		while(i<=4){
			System.out.println("enter the bus fare");
			Bus_fare=new Scanner(System.in).nextInt();
			k=0;
			sum1=0;
			j=1;
			while(j<=7)
			{
				System.out.println("enter the cost you have");
				cost=new Scanner(System.in).nextInt();
				if(cost>=Bus_fare){
					System.out.println("Seat "+j+" is allocated");
					sum1=sum1+Bus_fare;
					k=k+1;
				}
				else{
					System.out.println("Cannot accomadate in this bus");
				}
				j++;
			}
			System.out.println("The total collection in bus "+i+"is"+sum1);
			System.out.println("The total number of seats filled in bus "+i+" is: "+k);
			sum2=sum2+sum1;
			i++;
		}
		System.out.println("The total collection is"+sum2);
		
	}

}
