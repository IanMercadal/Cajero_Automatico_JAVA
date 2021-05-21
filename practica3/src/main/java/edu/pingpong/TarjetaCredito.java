package edu.pingpong;

public class TarjetaCredito extends Tarjeta{
    
    public int SaldoDisponible;
    public int CreditoDisponible;


    TarjetaCredito(){
        
    }

    TarjetaCredito(String NIF, int PIN , String nombre, String apellido, int SaldoDisponible,int CreditoDisponible){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.SaldoDisponible = SaldoDisponible;
        this.prestamo = CreditoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        SaldoDisponible = saldoDisponible;
    }
    
    public int getSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setCreditoDisponible(int creditoDisponible) {
        CreditoDisponible = creditoDisponible;
    }

    public int getCreditoDisponible() {
        return CreditoDisponible;
    }



}
