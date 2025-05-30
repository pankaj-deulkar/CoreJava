public class Test{
	
	public static void main(String[] args)
	{
		String[] arr={"A","X","B","Y","C","Z"};
		String temp;
		
		System.out.println("Before Sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
		