package test;

import accesodatos.IAccesoDatos;
import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        // IAccesoDatos datos = new IAccesoDatos(); -> no se puede instanciar
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar(); // OUTPUT: Listar desde MySql
        imprimir(datos); // OUTPUT: Listar desde MySql 
        
        IAccesoDatos datos2 = new ImplementacionOracle();
        //datos2.listar(); // OUTPUT: Listar desde Oracle
        imprimir(datos2); // OUTPUT: Listar desde Oracle
    }
    
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
    
}
