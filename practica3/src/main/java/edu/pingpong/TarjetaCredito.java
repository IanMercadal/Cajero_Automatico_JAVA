package edu.pingpong;

public class TarjetaCredito extends Tarjeta implements interfazTarjetas{
    
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
        this.CreditoDisponible = CreditoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        SaldoDisponible = saldoDisponible;
    }
    
    public int getSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setCreditoDisponible(int CreditoDisponible) {
        CreditoDisponible = CreditoDisponible;
    }

    public int getCreditoDisponible() {
        return CreditoDisponible;
    }
    @Override
    public void mostrarTarjeta(){
        super.mostrarTarjeta();
        getSaldoDisponible();
        getCreditoDisponible();
        System.out.println("Tarjeta Credito: ");
        System.out.println("Saldo: " + SaldoDisponible);
        System.out.println("Credito: " + CreditoDisponible);
    }

    /*
        public void mostrarTarjeta(){
        
    };
    */

        
}
