public class MaxSubArraySum {
    public static void maxSubarraySum(int arr[]) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum = sum + arr[j];
                for(int k=i; k<j; k++) {
                    System.out.print(arr[k]+ " ");
                }
                
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        maxSubarraySum(nums);
        
    }
    
}
