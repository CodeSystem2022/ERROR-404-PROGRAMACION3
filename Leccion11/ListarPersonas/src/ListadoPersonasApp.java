import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada,personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        }//Fin del ciclo while
    }//Fin metodo main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ***** Listado de Persona *****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones");
    }//Fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //revisamos la opcion digita a traves de un switch
        switch (opcion){
            case 1 -> {//Agregar una persona a la lista
                System.out.print("Digite un nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                //creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La Lista tiene: "+personas.size()+" elementos");
            }
            case 2 ->{//listar a las persona
                System.out.println("Listado de personas: ");
                //Mejoras con lambda el metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }
        }
    }//Fin del metdo ejecutarOperacion
}//Fin de la clase ListadoPersona