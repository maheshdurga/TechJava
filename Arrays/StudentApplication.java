package com.Arrays;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [3][];
		Scanner scan = new Scanner (System.in);
		
		arr[0]= new int[4];
		arr[1]= new int[3];
		arr[2]= new int[2];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print("Enter the "+ (i+1)+" class "+(j+1)+" Student id :");
				arr[i][j]=scan.nextInt();				
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the "+ (i+1)+" class "+(j+1)+" Student id :"+arr[i][j]);				
			}
		}
		}

}
