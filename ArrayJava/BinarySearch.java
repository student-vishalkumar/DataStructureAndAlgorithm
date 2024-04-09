public class BinarySearch {
    // Binary Search

    public static int findKeyUsingBS(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == key) //found
            return mid;

            if(arr[mid] < key) //right
            start = mid+1;

            if(arr[mid] > key) //left
            end = mid-1;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("Index for key is : " + findKeyUsingBS(nums, key));
        
    }
    
}
