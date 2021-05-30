package edu.pingpong;

public class TarjetaCredito extends Tarjeta{
    
    public int saldoDisponible;
    public int creditoDisponible;

    public TarjetaCredito(){
    }

    public TarjetaCredito(String NIF, int PIN , String nombre, String apellido, int saldoDisponible,int creditoDisponible){
        super(NIF,PIN,nombre,apellido);
        this.saldoDisponible = saldoDisponible;
        this.creditoDisponible = creditoDisponible;
    }

    public TarjetaCredito(TarjetaCredito tarjetaCredito){
        super(tarjetaCredito.getNIF(),tarjetaCredito.getPIN(),tarjetaCredito.getApellido(),tarjetaCredito.getNombre());
        this.saldoDisponible = tarjetaCredito.saldoDisponible;
        this.creditoDisponible = tarjetaCredito.creditoDisponible;
    }

    public void setsaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    
    public int getsaldoDisponible() {
        return saldoDisponible;
    }

    public void setcreditoDisponible(int creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    public int getcreditoDisponible() {
        return creditoDisponible;
    }
    @Override
    public void mostrarTarjeta(){
        System.out.println("Tarjeta Credito: ");
        super.mostrarTarjeta();
        System.out.println("Saldo: " +  getsaldoDisponible());
        System.out.println("Credito: " + getcreditoDisponible());
    }      
}
