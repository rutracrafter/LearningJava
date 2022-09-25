package Chapter2;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // primitive types store the values directly in the variable.
        int a = 30;
        double b = 3.14159;
        boolean c = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // reference types store the address to the piece of memory where
        // the values is stored, this allows for very useful methods to be available.

        // NOTE: reference values are slower to use than primitive types as they require more processing
        // so for large amounts of data, it is not recommended that one use reference types
        
        Integer d = 30;
        Double e = 3.14159;
        Boolean f = true;

        System.out.println(d.getClass());
        System.out.println(e.intValue());
        System.out.println(f.equals(false));

    }    
}
