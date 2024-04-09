public class LinearSearch {

    public static int arrayLinearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = arrayLinearSearch(nums, key);
        if(index == -1){
            System.out.println("Element Not Found");
        } else{
            System.out.println("Element fouund at index " + index);
        }
    }
    
}
