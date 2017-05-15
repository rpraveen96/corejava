package cmps;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<=n;i++)
		{
			    c=a+b;
				a=b;
				b=c;
	System.out.println(c);
		}
	}
	
}
