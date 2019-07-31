package day1;

/*
 * TYPE parsing:
 * String into other types using wrapper
 */
public class Parsing
{
	public static void main(String[] args) 
	{
		System.out.println(args.length);
		int deposited=0,months=0;
		float interest=0.0F;
		char type='\0';
		deposited=Integer.parseInt(args[0]);
		months=Integer.parseInt(args[1]);
		interest=Float.parseFloat(args[2]);
		type=args[3].charAt(0);
	deposited+=(deposited*(months*interest))/110;
	System.out.println("Account Details: "+type+" "+interest+" "+months+" "+deposited);
	}

}
