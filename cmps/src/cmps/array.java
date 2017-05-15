package cmps;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[2];
		int arr1[]=new int[2];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<=2;i++)
		{
			if(arr[i]==arr1[j])
			{
				count=0;
			}
		}
	}
}

