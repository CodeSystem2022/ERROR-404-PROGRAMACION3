
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clase  envolvente o Wrapper
        /*
            Clase envolventes de tipo primitivos
            int = la clase envolvente es Integer
        */
        
        int entero = 10; // Tipo primitivo
        System.out.println("entero = " + entero);
        Integer entero2 = 10;  // Tipo object
        System.out.println("entero2 = " + entero2.toString()); // Autoboxing
        
        int entero3 = entero; // Unboxing
        System.out.println("entero3 = " + entero3);
    }
    
}
