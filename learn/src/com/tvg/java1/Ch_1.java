package com.tvg.java1;

import java.util.Scanner;

public class Ch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入金字塔层数:");
		n = input.nextInt();
		for (i = 1; i <=n; i++) {
			for (j=1; j<=n-i;j++) {
				System.out.print(" ");
			}				
			for (k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}	
			System.out.print("\n");
		}
		input.close();

	}

}
