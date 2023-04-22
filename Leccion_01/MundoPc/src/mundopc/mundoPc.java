package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP=new Monitor("HP",13);
        Teclado tecladoHP=new Teclado("Bluetooth","HP");
        Raton ratonHP=new Raton("Bluetooth","HP");
        Computadora computadoraHP=new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer=new Monitor("Gamer",13);
        Teclado tecladoGamer=new Teclado("Bluetooth","Gamer");
        Raton ratonGamer=new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer=new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        
        Orden orden1=new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Orden orden2=new Orden();
        Computadora computadoraVarias=new Computadora("Computadora de diferentes marcas",monitorGamer,tecladoHP,ratonHP);
        orden2.agregarComputadora(computadoraHP);        
        orden2.mostrarOrden();
        
        int preIncremento=0,posIncremento=0;
        System.out.println(++preIncremento);
        System.out.println(posIncremento++);
        System.out.println(posIncremento);
    }
}
