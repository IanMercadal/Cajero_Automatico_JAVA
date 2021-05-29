package edu.pingpong;
import java.util.Scanner;

public class TarjetaDebito extends Tarjeta{

    TarjetaDebito(){
        
    }
    public TarjetaDebito(String NIF, int PIN , String nombre, String apellido, int SaldoDisponible){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.SaldoDisponible = SaldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        SaldoDisponible = saldoDisponible;
    }

    public int getSaldoDisponible() {

        return SaldoDisponible;
    }

}
