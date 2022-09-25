package Chapter3;

public class WhileLoop {
    public static void main(String[] args) {
        // below is the regular while loop
        // condition is checked, and if met, the body is excecuted
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        System.out.println();

        // now lets look at the do-while loop
        // it allows us to excecute what is in the body before the condition is checked for the first time
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
    
}
