package com.Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Companyes");
		int [][]arr = new int [scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the Company"+(i+1)+" Empolyees");
			arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the "+(i+1)+"Companie "+(j+1)+"empolyie Age :");
				arr[i][j] =scan.nextInt();
				
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
		
				System.out.println("The "+(i+1)+"Companie "+(j+1)+"empolyie Age :"+ arr[i][j]);
			}
		}

	}

}
