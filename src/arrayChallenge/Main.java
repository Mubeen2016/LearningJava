package arrayChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		 int[] myInteger = getInteger(5);
		int[] values =  sortedInteger(myInteger);
		//System.out.println(values);
		 printInteger(values);
	}

	public static int[] getInteger(int capacity){
		int[] values = new int[capacity];
		System.out.println("Enter" + capacity + "integer values:\r");
		for(int i=0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printInteger(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.println("Element" +i + "contents" +array[i]);
		}
	}
	
	public static int[] sortedInteger(int[] array){
//		int[] sortedArray = new int[array.length]; //instead of using these three steps to copy we can use the in build functionality to copy an array
//		for(int i=0; i<array.length; i++){
//			sortedArray[i] = array[i];
//	}
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i=0; i<sortedArray.length-1; i++){
				if(sortedArray[i]<sortedArray[i+1]){
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
			
		}
		return sortedArray;
	}
	
}
