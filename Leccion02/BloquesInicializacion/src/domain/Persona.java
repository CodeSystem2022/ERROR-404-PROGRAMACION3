package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{//Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; no es un atributo estatico, por esto tenemos un error
    }
    
    {// Bloque de inicializacion NO estatico(contexto dinamico)
        System.out.println("Ejecucion del bloque NO  estatico");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }   
    
    // Los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Esta es la ejecucion del constructor");
    }
    
    public int idPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
 