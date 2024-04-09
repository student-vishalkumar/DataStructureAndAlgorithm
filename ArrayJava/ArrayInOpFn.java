import java.util.*;
public class ArrayInOpFn {

    public static void arrayInput(int marks[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
    }

    public static void arrayPrint(int marks[]){
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[5];
        // Scanner sc = new Scanner(System.in); 
        arrayInput(marks);
        System.out.println("");
        arrayPrint(marks);
    }
    
}
