public class SubArray {
    public static void printSubarray(int arr[]) {
        int ts =0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray = "+ts);
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        printSubarray(nums);
    }
}
