package day2;

public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char setOne='A',setTwo='c';
		int row=4,space=1,letters=0;
		while(row>=1)
		{
			space=1;
			while(space<row)
			{
				System.out.print(" ");
				space++;
				if(row<3)
				{
					setTwo+=row;
				}
				else
				{
					setOne+=row;
				}
			}
			letters=4;
			while(letters>=row&&letters>0)
			{
				if(row<3){System.out.print(setTwo);setTwo+=row;}
				else{System.out.print(setOne);setOne+=row;}
				letters--;
			}
			System.out.println();
			row--;
		}
	}
}
