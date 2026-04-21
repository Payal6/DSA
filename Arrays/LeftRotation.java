package Arrays;

import java.util.Scanner;

public class LeftRotation {
        public static void leftShift (int numbers[]){
        int first = numbers[0];
        
        for (int i=0;i<numbers.length-1;i++){
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = first;
        //numbers[numbers.length-1] = 0;
    }

    	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		//int numbers[] = {1,2,3,4,5,6};
		
		System.out.print("Enter size of an array :");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		System.out.print("Enter "+size+" elements \n");
		for(int i=0;i<size;i++){
		    numbers[i]=sc.nextInt();
		}
		
		System.out.print("Original Array : ");
	    for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	    
	    System.out.print("\nRotated Array : ");
	    leftShift(numbers);
	    for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	    sc.close();
	    
	}
}
