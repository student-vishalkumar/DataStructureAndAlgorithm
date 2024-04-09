public class LargestNumber {

    public static int findLargestNumberInArr(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findMinElementInArr(int arr[]) {
        int Minimum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(Minimum > arr[i]){
                Minimum = arr[i];
            }
        }
        return Minimum;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5};
        System.out.println("Largest value is : "+findLargestNumberInArr(nums));
        System.out.println("Minimum value is : "+findMinElementInArr(nums));
        
    }
    
}
