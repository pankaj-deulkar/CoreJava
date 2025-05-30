public class Test{
	
	public static void main(String[] args)
	{
		int[][] i={{1,2,3},{4,5,6},{7,8,9}};
		int row=0;
		while(row<i.length)
		{
			int col=0;
			while(col<i[row].length)
			{
				System.out.println(i[row][col]);
				col++;
			}
			row++;
		}
	}
}