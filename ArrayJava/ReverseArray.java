public class ReverseArray {
    public static void reverse(int nums[]) {
        int first = 0,  last = nums.length-1;

        while(first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }

    public static void print(int nums[]) {
        for(int i=0; i<nums.length; i++) {
                System.out.println(nums[i]);
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 8, 9};
        reverse(nums);
        print(nums);
    
        

    }
    
}
