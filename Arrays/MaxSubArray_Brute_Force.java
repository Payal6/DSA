package Arrays;

public class MaxSubArray_Brute_Force {
    
   public static void maxSubArraySum(int arr[]){
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                   currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : "+maxSum);
    }
	public static void main(String[] args) {
		int arr[] = { 2,4,6,8,10};
		maxSubArraySum(arr);
	}
}
