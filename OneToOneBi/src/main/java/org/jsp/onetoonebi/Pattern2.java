package org.jsp.onetoonebi;

public class Pattern2 {
 public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println("----------------------");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("----------------------");
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print("--");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
