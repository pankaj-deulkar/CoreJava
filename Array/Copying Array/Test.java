import java.util.*;
public class Test{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9};
		
		int[] newArray=Arrays.copyOf(arr,arr.length);
		System.out.println("Original Array");
		for(int a:arr)
		{
			System.out.println(a);
		}
		System.out.println("Copied Array");
		for(int a1:newArray)
		{
			System.out.println(a1);
		}
	}
}