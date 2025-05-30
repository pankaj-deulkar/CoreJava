public class Test{
	
	public static void main(String [] args)
	{
		int[] arr={10,20,30,40,50,60,70};
		
		int n=arr.length;
	
		int[] brr=new int[n];
		for(int i=0;i<n;i++)
		{   
			brr[i]=arr[n-i-1];
			System.out.println(brr[i]);
			
		}
	}
	
}