package Chapter1;

public class ForLoop {
    public static void main(String[] args) {
        // the following in the regular for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        // this time, lets look at the enhanced for loop
        int[] myIntegerArray = {3, 1, 4, 2, 5, 3};
        for (int num: myIntegerArray) {
            System.out.println(num);
        }
    }
    
}
