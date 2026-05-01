package Search;

public class LinearSearch {
    
	public static int linearSearch(int numbers[], int key) {
		for(int i = 0; i < numbers.length ; i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//int numbers[] = {2,8,4,5,7,9,10};
		int numbers[]= {-1,10,2,-4};
		int key = -4;

		int index = linearSearch(numbers,key);
		if(index == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element found at index : "+ index);
		}
	}
}
