
package test;

import domain.*;


public class testInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("micaela lopez", 10000);
        determinarTipo(empleado1);
        
        empleado1 = new Gerente("Brian Ahumada", 5000, "Sistema");
        //determinarTipo(empleado1);
        
    }
    
    
    
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //convertimos la variable de entrada de tipo hijo.
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado; //Error en tiempo de ejecucion(convercion de tipo una clase padre no puede)
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
