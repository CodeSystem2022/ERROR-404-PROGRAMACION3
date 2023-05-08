
package test;

import domain.*;


public class testSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Brian Ahumada", 5000, "Sistema");
        //System.out.println ("Gerente1= " + gerente1.obtenerDetalles());
        imprimir(gerente1);
        
        Empleado empleado1 = new Empleado("micaela lopez", 10000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado1);
    }
    
    //Para demostrar el polimordismo
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("Detalles = " + detalles);
    }
}
