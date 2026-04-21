package Arrays;

public class Reverse_Array {
    public static void reverse(int numbers[]){
        int start=0, end=numbers.length-1;
        
        while(start < end){
            int temp = numbers[end];
            numbers[end]= numbers[start];
            numbers[start] = temp;
            
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
	    int numbers[] = {1,2,3,4,5,6};
	    
	    System.out.print("Original Array : ");
	    for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	    
	    System.out.print("\nReversed Array : ");
	    reverse(numbers);
	    for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
	}
}
