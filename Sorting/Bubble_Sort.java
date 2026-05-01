package Sorting;

public class Bubble_Sort {
	public static void bubbleSort(int arr[]) {
		for(int pass=0; pass<arr.length-1; pass++) {
			int swap=0;
			for(int j=0; j<arr.length-1-pass; j++) {
				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}
			}
			if(swap == 0) {
				break;
			}
		}
	}

	public static void printArr(int arr[]) {
		for(int val:arr) {
			System.out.print(val+ " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {4,1,7,5,2};

		//System.out.print("Original Array : ");
		printArr(arr);

		bubbleSort(arr);
		
		System.out.println();
        //System.out.print("Sorted Array : ");  
		printArr(arr);
	}
}
