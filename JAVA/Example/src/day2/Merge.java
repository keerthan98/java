package day2;

public class Merge {

				/**
	 * @param args
	 */
	public static void sort(double[] source,int start,int mid,int end){
		int leftSize=mid-start;
		int rightSize=end-(mid-1);
		double [] left=new double[leftSize];
		double [] right=new double[rightSize];
		int a,b,c;
		for(a=0;a<leftSize;a++)
		{
			left[a]=source[a+1];
			
		}
		for(b=0;b<rightSize;b++)
		{
			right[b]=source[mid+b+1];

		}
		c=start;
		for(a=0,b=0;a<leftSize && b<rightSize;c++)
		{
			if(left[a]>right[b])
			{
				source[c]=right[b];
				b++;
			}
			else
			{
				source[c]=left[a];a++;
			}
		}
		
		while(a<leftSize)
		{
			source[c]=left[a];a++;c++;
		}
		while(b<rightSize)
		{
			source[c]=right[b];b++;c++;
		}
}
	
	public static void perform(double[] alpha,int start,int end){
		int mid=0;
		if(start<end){
			mid=start+(end-start)/2;
			perform(alpha,start,mid);
			perform(alpha,(mid+1),end);
			sort(alpha,start,mid,end);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mobile={13450.3,7890.7,890000.3,217800.6};
		Merge.perform(mobile, 0,mobile.length-1);  
	}

}
