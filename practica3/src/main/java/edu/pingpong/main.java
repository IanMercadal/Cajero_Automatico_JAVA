package edu.pingpong;
import java.text.MessageFormat;
import java.util.Scanner;


public class main{

    // public static TarjetaCredito tarjetaCreditoo; // Son objetos. El static nos permite utilizarlo en toda la clase main.
    // public static TarjetaDebito tarjetaDebitoo; // Son objetos. El static nos permite utilizarlo en toda la clase main.
    
    static Scanner retirarDinero = new Scanner(System.in);
 
    public static int[][] carga_billetes; // Le ponemos las dos claves para las dos posiciones/valores. Si no da error.
 
    public static void main(String[] args) {
        CajeroAutomatico micajero = new CajeroAutomatico();
        carga_billetes = new int[][] {{500, 1}, {200, 3}, {100, 0}, {50, 0},{20, 0}, {10, 18}, {5, 25}}; // Las dos claves son un arrays y van dentro de otro. Posiblemente lo pasemos a HashMap.

                    micajero.setBilletes(carga_billetes);
                    TarjetaCredito tarjetaCreditoo = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 1000,5000); // dando el nuevo objeto
                    TarjetaDebito tarjetaDebitoo = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 20000); // dando el nuevo objeto
                    micajero.getListaTarjeta().add(tarjetaCreditoo);
                    micajero.getListaTarjeta().add(tarjetaDebitoo);

        operaciones(micajero);
        comprobarIdentidad(micajero);
    }


    public static  CajeroAutomatico operaciones(CajeroAutomatico micajero){

        boolean salir = false;
        do{

            try{
                Scanner opcion = new Scanner(System.in);
                System.out.println("Elige una de las opciones");
                System.out.println("1. Opcion 1 - Sacar dinero");
                System.out.println("2. Opcion 2 - Salir");
                int selected = opcion.nextInt();

                if(selected == 1){

                    System.out.println(" DATOS DE LA TARJETA DEL CLIENTE" + "\n" + 
                    "=========================================" + "\n");
                    TarjetaCredito tarjetaCredito = (TarjetaCredito) micajero.getListaTarjeta().get(1);
                    tarjetaCredito.mostrarTarjeta();
                    System.out.println(" DATOS DE LA TARJETA DEL CLIENTE" + "\n" + 
                    "=========================================" + "\n");
                    TarjetaDebito tarjetaDebito = (TarjetaDebito) micajero.getListaTarjeta().get(0);
                    tarjetaDebito.mostrarTarjeta();
                    mostrarCajero();
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
        return micajero;
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

        public static void comprobarIdentidad(CajeroAutomatico micajero){
 
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
                        String nifInput = nif.nextLine(); 


                        System.out.println("Dame el PIN");
                        Integer pinInput = pin.nextInt(); 

                            for (int i = 0; i < micajero.getListaTarjeta().size(); i++) {

                                if(nifInput.equals(micajero.getListaTarjeta().get(i).getNIF()) && pinInput.equals(micajero.getListaTarjeta().get(i).getPIN())){
                                    restarDineroJ((TarjetaCredito)micajero.getListaTarjeta().get(i));
                                }
                                if(nifInput.equals(micajero.getListaTarjeta().get(i).getNIF()) && pinInput.equals(micajero.getListaTarjeta().get(i).getPIN())){
                                    restarDineroF((TarjetaDebito)micajero.getListaTarjeta().get(i));
                                } 
                            }
                        }

                            else{
                            if(money == 2){
                                System.out.println("Has cancelado el proceso.");
                            }
                        }
                }
                catch(Exception errorr){
                    System.out.println("Ha sido imposible sacar el dinero, por favor, intentalo de nuevo.");
                }
            
        }
        private static void restarDineroJ(TarjetaCredito tarjetaCredito) {

            System.out.println("¿Que cantidad deseas retirar?");
            int dineroJavi = retirarDinero.nextInt();

            int ContadorCreditoDisp = 0;
            int ContadorDebitoDisp = 0;
            int ContadorQ  = 0;
            int ContadorD  = 0;
            int ContadorDiez  = 0;
            int ContadorCinco  = 0;
 

                while (dineroJavi > 4 ){
                    if (dineroJavi > 1000){
                        System.err.println("Has sacado más cantidad del saldo que dispones, intentalo de nuevo.");
                        break;
                    }
                
                    if (tarjetaCredito.getsaldoDisponible() > 0){

                    
                    if (ContadorQ < 1 && dineroJavi >= 500){
                        dineroJavi -= 500;
                        ContadorDebitoDisp += 500;
                        carga_billetes[0][1]--;
                        ContadorQ ++;
                        }
                    if (ContadorD < 3 && dineroJavi >= 200 ){
                        dineroJavi -= 200;
                        ContadorDebitoDisp += 200;
                        carga_billetes[1][1]--;
                        ContadorD ++;
                        }
                    else if (ContadorDiez < 18 && dineroJavi >= 10){
                        dineroJavi -= 10;
                        ContadorDebitoDisp += 10;
                        carga_billetes[5][1]--;
                        ContadorDiez ++;
                    }
                    else if (ContadorCinco < 25 && dineroJavi >= 5){
                        dineroJavi -= 5;
                        ContadorDebitoDisp += 5;
                        carga_billetes[6][1]--;
                        ContadorCinco ++;
                    }
                    else if (dineroJavi == 4 || dineroJavi == 3 || dineroJavi == 2 || dineroJavi == 1)
                    break;
                }
                    if(tarjetaCredito.getsaldoDisponible() == 0 && tarjetaCredito.getcreditoDisponible() > 0){
                        if (ContadorQ < 1 && dineroJavi >= 500){
                            dineroJavi -= 500;
                            ContadorCreditoDisp += 500;
                            carga_billetes[0][1]--;
                            ContadorQ ++;
                            }
                        if (ContadorD < 3 && dineroJavi >= 200 ){
                            dineroJavi -= 200;
                            ContadorCreditoDisp += 200;
                            carga_billetes[1][1]--;
                            ContadorD ++;
                            }
                        else if (ContadorDiez < 18 && dineroJavi >= 10){
                            dineroJavi -= 10;
                            ContadorCreditoDisp += 10;
                            carga_billetes[5][1]--;
                            ContadorDiez ++;
                        }
                        else if (ContadorCinco < 25 && dineroJavi >= 5){
                            dineroJavi -= 5;
                            ContadorCreditoDisp += 5;
                            carga_billetes[6][1]--;
                            ContadorCinco ++;
                        }
                        else if (dineroJavi == 4 || dineroJavi == 3 || dineroJavi == 2 || dineroJavi == 1)
                        break;
                    }
                
            }

            
            tarjetaCredito.setsaldoDisponible(tarjetaCredito.getsaldoDisponible() - ContadorDebitoDisp);
            tarjetaCredito.setcreditoDisponible(tarjetaCredito.getsaldoDisponible()- ContadorCreditoDisp);
            
            System.out.println("Desglose de la cantidad satisfecha:");
            System.out.println(ContadorQ + " billetes de 500 €");
            System.out.println(ContadorD + " billetes de 200 €");
            System.out.println(ContadorDiez + " billetes de 10 €");
            System.out.println(ContadorCinco + " billetes de 5 €");
            
            

        }


        public static void restarDineroF(TarjetaDebito tarjetaDebito){ 
            System.out.println("¿Que cantidad deseas retirar?");
            int dineroFran = retirarDinero.nextInt();

            int ContadorQ  = 0;
            int ContadorD  = 0;
            int ContadorDiez  = 0;
            int ContadorCinco  = 0;

                while (dineroFran > 0 ){
                    if (dineroFran > 1405){
                        System.err.println("Has sacado más cantidad de la que dispone el cajero, intentalo de nuevo.");
                        break;
                    }
                
                    if (ContadorQ < 1 && dineroFran >= 500){
                        dineroFran -= 500;
                        carga_billetes[0][1]--;
                        ContadorQ ++;
                        }
                    if (ContadorD < 3 && dineroFran >= 200 ){
                        dineroFran -= 200;
                        carga_billetes[1][1]--;
                        ContadorD ++;
                        }
                    else if (ContadorDiez < 18 && dineroFran >= 10){
                        dineroFran -= 10;
                        carga_billetes[5][1]--;
                        ContadorDiez ++;
                    }
                    else if (ContadorCinco < 25 && dineroFran >= 5){
                        dineroFran -= 5;
                        carga_billetes[6][1]--;
                        ContadorCinco ++;
                    }
                    else if (dineroFran == 4 || dineroFran == 3 || dineroFran == 2 || dineroFran == 1)
                        break;
            }

            tarjetaDebito.setsaldoDisponible(tarjetaDebito.getsaldoDisponible() - dineroFran);
            
            
            System.out.println("Desglose de la cantidad satisfecha:");
            System.out.println(ContadorQ + " billetes de 500 €");
            System.out.println(ContadorD + " billetes de 200 €");
            System.out.println(ContadorDiez + " billetes de 10 €");
            System.out.println(ContadorCinco + " billetes de 5 €");
            
    
        }
    }
