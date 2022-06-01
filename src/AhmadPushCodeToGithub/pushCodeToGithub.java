package AhmadPushCodeToGithub;

import java.util.Arrays;
import java.util.Scanner;

public class pushCodeToGithub {

	public static void main(String[] args) {
		/*
			Using Scanner create an array of integer values.
			After the array is created, calculate the sum of all
			stored elements in that array.
		*/
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scan.nextInt();
		int array[] = new int[size];
		//enter the elements into the array 
		System.out.println("Enter the elements into the array : ");
		for(int i=0; i<size; i++) {
			array[i] = scan.nextInt();
			sum = sum+array[i];
		}
		System.out.println("Array elements are :"+Arrays.toString(array));
		System.out.println("The sum is :"+" "+sum);
}

}
