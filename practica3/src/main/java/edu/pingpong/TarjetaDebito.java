package edu.pingpong;
import java.util.Scanner;

public class TarjetaDebito extends Tarjeta implements interfazTarjetas{

    Scanner retirarDinero;
    TarjetaDebito(){
        
    }
    public TarjetaDebito(String NIF, int PIN , String nombre, String apellido, int SaldoDisponible){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.SaldoDisponible = SaldoDisponible;
    }

    public void setSaldoDisponible(int SaldoDisponible) {
        SaldoDisponible = SaldoDisponible; // - retirarDinero ;
    }

    public int getSaldoDisponible() {
        return SaldoDisponible;
    }
    @Override
    public  void mostrarTarjeta(){
        super.mostrarTarjeta();
        getSaldoDisponible();
        System.out.println("Tarjeta Debito: ");
        System.out.println("Saldo: " + SaldoDisponible);
    }
}
