package Chapter1;

public class IfElseStatement {
    public static void main(String[] args) {
        int temp = 25;

        if (temp < 15) {
            System.out.println("It is cold!");
        }
        else if (temp < 30) {
            System.out.println("It is a pleasant temperature!");
        }
        else {
            System.out.println("It is hot!");
        }
    }
    
}
