public class Test{
	public static void main(String [] args)
	{
		int[][] i={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int row=0;row<i.length;row++)
		{
			for(int col=0;col<i[row].length;col++)
			{
				System.out.println(i[row][col]);
			}
		}
	}
}