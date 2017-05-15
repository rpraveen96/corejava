package cmps;

import java.util.Scanner;

public class factorial {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{   //int fact=1;
			fact=fact*i;
		}
System.out.println(fact);
	}

}
