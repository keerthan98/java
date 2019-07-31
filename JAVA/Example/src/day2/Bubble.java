package day2;

public class Bubble {

	/**
	 * @param args
	 */
	public static void sort(byte[] b){
		int i=0,j=0;
		int n=b.length;
		byte temp;
		while(i<n)
		{
			j=i+1;
			while(j<n){
			if(b[i]>b[j])
			{
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			}
			j++;
		}
		i++;
	}
		System.out.println(new String(b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String desired="DataScience";
		byte[] b=desired.getBytes();
		Bubble.sort(b);
}
}
