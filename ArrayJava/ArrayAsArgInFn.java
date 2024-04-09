public class ArrayAsArgInFn {

    public static void update(int marks[], int x) {
        x = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        int marks[] = {96, 97, 98};
        int a = 5;
        update(marks, a);
        System.out.println(a);


        // print marks
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
    
}
