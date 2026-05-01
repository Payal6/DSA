package Sorting;

public class Insertion_Sort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
        arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
	public static void main(String[] args) {
		int arr[] = {4,7,1,2,5};
		printArr(arr);
		insertionSort(arr);
		System.out.println();
		printArr(arr);
	}
}
