
package accesodatos;

/**
 * INTERFACE -> no hereda de Object
 * Como no hay herencia multiplice con clases en Java son las 
 * Interfaces si podemos aplicar mas de una
 * - todos los ATIBUTOS son CONSTANTAES
 * - NO tiene constructor
 * - solo tiene METODOS (PUBLIC ABSTRACT), sin cuerpo 
 */
public interface IAccesoDatos {
    int MAX_REGISTRO = 10; // public final static
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
