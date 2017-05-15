package cmps;

import java.util.Scanner;

public class arrconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("not to be in");
		int my=sc.nextInt();
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int n1=sc.nextInt();
		
		int b[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int count=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=my)
			{
			c[i]=a[i];
			count++;
			}
			
		}
		for(int j=0;j<b.length;j++)
		{ 
			if(b[j]!=my)
			{
			c[count++]=b[j];
		}
		for(int l=0;l<c.length;l++)
		{
			System.out.println(c[l]);
		}
	}

}
}