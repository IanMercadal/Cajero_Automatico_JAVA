package edu.pingpong;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main 
{
    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones(){
    
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Sacar dinero.");
            System.out.println("2. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        
                        break;
                    
                    case 2:
                    System.out.println("Has seleccionado la opcion 2. ¡Que tengas buen dia!");
                        salir = true;
                        break; 

                    default:
                        System.out.println("Solo nnmeros entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
        }
        int[][] carga_billetes = {{500, 1}, {200, 3}, {100, 0}, {50, 0},
        {20, 0}, {10, 18}, {5, 25}};
        CajeroAutomatico micajero = new CajeroAutomatico();
        micajero.setBilletes(carga_billetes);
        TarjetaDebito mitarj1 = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 20000);
        TarjetaCredito mitarj2 = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 1000, 5000);
        micajero.getListaTarjeta().add(mitarj1);
        micajero.getListaTarjeta().add(mitarj2);
    
    }
}
