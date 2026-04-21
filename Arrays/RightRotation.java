package Arrays;

import java.util.Scanner;

public class RightRotation {
        public static void rightShift(int numbers[]){
        int last = numbers[numbers.length-1];
        
        for(int i=numbers.length-1;i>0;i--){
            numbers[i]=numbers[i-1];
        }
        numbers[0] = last;
    }

    	public static void main(String[] args) {
	    //int numbers[] = {1,2,3,4,5};
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter size of elements : ");
	    int size = sc.nextInt();
	    
	    int numbers[]= new int[size];
	    
	    System.out.println("Enter "+size+" elements " );
	    for(int i = 0;i<size;i++){
	        numbers[i]= sc.nextInt();
	    }
	    
	    System.out.print("\nOriginal Array : ");
	    for(int i=0;i< numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	    
	    System.out.print("\nRotated Array : ");
	    rightShift(numbers);
	    for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	    sc.close();
	}
}
