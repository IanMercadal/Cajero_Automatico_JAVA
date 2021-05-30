package edu.pingpong;
import java.util.InputMismatchException;
import java.text.MessageFormat;
import java.util.Scanner;


public class main{



    public static TarjetaCredito tarjetaCreditoo; // Son objetos. El static nos permite utilizarlo en toda la clase main.
    public static TarjetaDebito tarjetaDebitoo; // Son objetos. El static nos permite utilizarlo en toda la clase main.
    
    static Scanner retirarDinero = new Scanner(System.in);
 
    public static int[][] carga_billetes; // Le ponemos las dos claves para las dos posiciones/valores. Si no da error.
 
    public static void main(String[] args) {
        operaciones(); // CLASE MAIN
    }


    public static void operaciones(){

        boolean salir = false; // Mientras el bucle es true, continua.

        do{

            try{
                Scanner opcion = new Scanner(System.in);
                System.out.println("Elige una de las opciones");
                System.out.println("1. Opcion 1 - Sacar dinero");
                System.out.println("2. Opcion 2 - Salir");
                int selected = opcion.nextInt();
      
                // Opciones presentadas al usuario.

                // En caso de la opcion 1: 

                if(selected == 1){

                    carga_billetes = new int[][] {{500, 1}, {200, 3}, {100, 0}, {50, 0},{20, 0}, {10, 18}, {5, 25}}; // Las dos claves son un arrays y van dentro de otro. Posiblemente lo pasemos a HashMap.

                    CajeroAutomatico micajero = new CajeroAutomatico();
                    micajero.setBilletes(carga_billetes);
                    tarjetaCreditoo = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 1000,5000); // dando el nuevo objeto
                    tarjetaDebitoo = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 20000); // dando el nuevo objeto
                    micajero.getListaTarjeta().add(tarjetaCreditoo);
                    micajero.getListaTarjeta().add(tarjetaDebitoo);
                    mostrarTarjeta();
                    mostrarCajero();
                    comprobarIdentidad();
                    
                }

                else{
                    if(selected == 2){
                        System.out.println("Gracias por usar el programa, que tengas buen dia.");
                        break;
                    }
                }
            }  
                catch(Exception error){
                    System.out.println("Algo ha ido mal, intentalo de nuevo");
                
                    }
            }while(!salir);
    }

    // Info de los users.
    public static void mostrarTarjeta(){
        

             //tarjetaa.mostrarTarjeta();
             System.out.println(" DATOS DE LA TARJETA DEL CLIENTE" + "\n" + 
        "=========================================" + "\n");
             //tarjetaa.mostrarTarjeta();
            
            tarjetaDebitoo.mostrarTarjeta();
             
             System.out.println("");
             System.out.println(" DATOS DE LA TARJETA DEL CLIENTE" + "\n" + 
             "=========================================" + "\n");
             tarjetaCreditoo.mostrarTarjeta();;
             System.out.println("");

        /*
        System.out.println(" DATOS DE LA TARJETA DEL CLIENTE" + "\n" + 
        "=========================================" + "\n" +
        "Nombre: " + tarjetaDebitoo.nombre + "\n" +
        "Apellido: " + tarjetaDebitoo.apellido + "\n" +
        "NIF:" + tarjetaDebitoo.NIF + "\n" + 
        "Tarjeta de débito: " + "\n" +
        "Saldo:" + tarjetaDebitoo.getSaldoDisponible() + "\n" +
        "=========================================" + "\n" +
        " DATOS DE LA TARJETA DEL CLIENTE" + "\n" +
        "Nombre: " + tarjetaCreditoo.nombre + "\n" +
        "Apellido: " + tarjetaCreditoo.apellido + "\n" +
        "NIF:" + tarjetaCreditoo.NIF + "\n" + 
        "Tarjeta de credito: " + "\n" +
        "Saldo:" + tarjetaCreditoo.getSaldoDisponible() + "\n" + 
        "Crédito: " + tarjetaCreditoo.getCreditoDisponible()
        );
        */
    }

        public static void mostrarCajero(){
                System.out.println(
                MessageFormat.format("{0} billetes de {1}",carga_billetes[0][1],carga_billetes[0][0]) + "\n" + 
                MessageFormat.format("{0} billetes de {1}",carga_billetes[1][1],carga_billetes[1][0]) + "\n" + 
                MessageFormat.format("{0} billetes de {1}",carga_billetes[2][1],carga_billetes[2][0]) + "\n" + 
                MessageFormat.format("{0} billetes de {1}",carga_billetes[3][1],carga_billetes[3][0]) + "\n" + 
                MessageFormat.format("{0} billetes de {1}",carga_billetes[4][1],carga_billetes[4][0]) + "\n" + 
                MessageFormat.format("{0} billetes de {1}",carga_billetes[5][1],carga_billetes[5][0]) + "\n" +
                MessageFormat.format("{0} billetes de {1}",carga_billetes[6][1],carga_billetes[6][0])
            );
        }

        public static void comprobarIdentidad(){


                try{
                    Scanner retire_money = new Scanner(System.in);
                    Scanner nif = new Scanner(System.in);
                    Scanner pin = new Scanner(System.in);

                    System.out.println("Elige una de las opciones de nuevo, para confirmar la opcion escogida.");
                    System.out.println("1. Opcion 1 - Sacar dinero");
                    System.out.println("2. Opcion 2 - Salir");
                    int money = retire_money.nextInt();
                    
                        if(money == 1){
                            System.out.println("Has elegido sacar dinero:" + "\n" + "\n" +
                            "Dame el NIF:"
                            );
                        String nifInput = nif.nextLine(); // guardar en variable


                        System.out.println("Dame el PIN");
                        int pinInput = pin.nextInt(); // guardar en variable

                        // Validación de los inputs

                        // Si el nif y el pin de Tarjeta debito/credito es correcto, entra en el if, si no, aviso.

                            if(nifInput.equals(tarjetaCreditoo.NIF) && pinInput == tarjetaCreditoo.PIN || nifInput.equals(tarjetaDebitoo.NIF) && pinInput == tarjetaDebitoo.PIN){
                                
                                restarDinero();
                                
                        }

                        else{
                            if(money == 2){
                                System.out.println("Has cancelado el proceso.");
                            }
                        }
                    }
                }
                catch(Exception errorr){
                    System.out.println("Ha sido imposible sacar el dinero, por favor, intentalo de nuevo.");
                }
            
        }
        public static int restarDinero(){ 
            System.out.println("¿Que cantidad deseas retirar?");
            int dinero = retirarDinero.nextInt();
            
            /* ACTUALMENTE DEBEMOS REALIZAR UNA CLASE O FUNCION, EN LA CUAL SE ACCEDA AL ARRAY BIDIMENSIONAL TAL COMO LO HACE PILDORAS INFORMATICAS */

            int ContadorQ  = 0;
            int ContadorD  = 0;
            int ContadorDiez  = 0;
            int ContadorCinco  = 0;

            //int dineroFinal = retirarDinero.nextInt();
            // int contadorDineroFinal = 0;

                while (dinero > 0){
                    if (dinero > 1405){
                        System.err.println("Has sacado más cantidad de la que dispone el cajero, intentalo de nuevo.");
                        break;
                    }
                
                    if (ContadorQ < 1 && dinero >= 500){
                        dinero -= 500;
                        carga_billetes[0][1]--;
                        ContadorQ ++;
                        }
                    if (ContadorD < 3 && dinero >= 200 ){
                        dinero -= 200;
                        carga_billetes[1][1]--;
                        ContadorD ++;
                        }
                    else if (ContadorDiez < 18 && dinero >= 10){
                        dinero -= 10;
                        carga_billetes[5][1]--;
                        ContadorDiez ++;
                    }
                    else if (ContadorCinco < 25 && dinero >= 5){
                        dinero -= 5;
                        carga_billetes[6][1]--;
                        ContadorCinco ++;
                    }

            }
            
            System.out.println("Desglose de la cantidad satisfecha:");
            System.out.println(ContadorQ + " billetes de 500 €");
            System.out.println(ContadorD + " billetes de 200 €");
            System.out.println(ContadorDiez + " billetes de 10 €");
            System.out.println(ContadorCinco + " billetes de 5 €");
            return dinero;

            // DEBEMOS RESTAR DE SALDO EL DINERO INTRODUCIDO POR PANTALLA.
        }
    }
