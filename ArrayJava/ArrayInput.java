import java.util.*;
public class ArrayInput {
    public static void main(String[] args){
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // nums[0] = sc.nextInt();
        // nums[1] = sc.nextInt();
        // nums[2] = sc.nextInt();
        // nums[3] = sc.nextInt();
        // nums[4] = sc.nextInt();

        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("");

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

    }
    
}
