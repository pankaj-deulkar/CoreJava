public class Test{
	
	public static void main(String [] args)
	{
		int[] a={20,5,86,1,24,63,30};
		int temp;
		
		System.out.println("Before Sorting");
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("After Sorting");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
		}
	}
}
				
		
		