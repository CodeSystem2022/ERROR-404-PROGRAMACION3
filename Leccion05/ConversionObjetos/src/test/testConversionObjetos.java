
package test;

import domain.*;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor ("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = "+ empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura(); NO SE PUEDE HACER
        //Dowcasting
        //((Escritor)empleado).getTipoEscritura(); //Tenemos 2 opciones: Esta es una
        Escritor escritor = (Escritor)empleado;//Esta es la segunda opcion
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
}
