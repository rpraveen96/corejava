package cmps;
import java.util.*;

public class arraysel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the search");
		int b=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				System.out.println("your number is there"+b);
			}
			else
			{
				System.out.println("number no");
				break;
			}
		}

	}

}
