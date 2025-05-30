public class Test{
	
	public static void main(String[] args)
	{
		int[] a={5,7,8,6,4,9,2,1,3};
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
				int tmp=0;
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
			System.out.println(a[i]);
		}
	}
}