public class Test{
	public static void main(String [] args)
	{
		String[] s={"A","S","D","F","G"};
		System.out.println("Before Modification");
		System.out.println("s[1] ="+s[1]);
		System.out.println("s[2] ="+s[2]);
		System.out.println("--------------------");
		s[1]="B";
		s[2]="C";
		System.out.println("After Modification");
		System.out.println("s[1] ="+s[1]);
		System.out.println("s[2] ="+s[2]);
		System.out.println("--------------------");
	}
}