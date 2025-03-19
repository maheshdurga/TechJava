package com.Arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = scan.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
