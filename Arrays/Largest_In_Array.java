package Arrays;

public class Largest_In_Array {
    	public static int getLargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;

		for(int i = 0; i < numbers.length ; i++) {
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}

    	public static void main(String[] args) {
		int numbers[] = {5,7,2,4,9,10};
		System.out.println("Largest Number in array is "+getLargest(numbers));
	}
}
