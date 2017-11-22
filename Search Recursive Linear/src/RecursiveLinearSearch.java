/*Recursive linear search of an array*/

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveLinearSearch {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int data[]=new int[100];
		
		//initialise array with even Nos from 0 to 198
		for(int i=0; i<data.length; i++)
			data[i] = i*2;
		
		System.out.printf("Original array: %s\n\n", Arrays.toString(data));
		
		System.out.println("Enter search key");
		int searchKey=sc.nextInt();
		
		int result=linearSearch(data, data.length, searchKey);
		
		if(result == -1)
			System.out.printf("%d not found", searchKey);
		else
			System.out.printf("%d found at position %d", searchKey,result);
	}
	
	public static int linearSearch(int data[],int size,int searchKey){
		if(size==0)
			return -1;
		else if(data[--size] == searchKey)
			return size;
		else
			return linearSearch(data, size, searchKey);
	}
}
