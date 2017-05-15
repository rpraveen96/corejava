import java.util.*;
class charocc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		int c=0;
		for(int i=0;i<sb.length();i++)
		{
			c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					sb.deleteCharAt(j);
					j=i+1;

				}
			}
			System.out.print(sb.charAt(i));
			System.out.println(c);

		}
	}
}