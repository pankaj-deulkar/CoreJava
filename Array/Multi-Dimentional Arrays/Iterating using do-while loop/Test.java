public class Test{
	public static void main(String[] args)
	{
		int[][] i={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=0;
		do
		{
			int col=0;
			do{
				System.out.println(i[row][col]);
				col++;
			}
			while(col<i[row].length);
			row++;
		}
		while(row<i.length);
	}
}
		