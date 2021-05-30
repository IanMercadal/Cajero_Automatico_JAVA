package edu.pingpong;

public class TarjetaDebito extends Tarjeta{

    int saldoDisponible;

    public TarjetaDebito(){
    }
    public TarjetaDebito(String NIF, int PIN , String nombre, String apellido, int saldoDisponible){
        super(NIF,PIN,nombre,apellido);
        this.saldoDisponible = saldoDisponible;
    }

    public TarjetaDebito(TarjetaDebito tarjetaDebito){
        super(tarjetaDebito.getNIF(),tarjetaDebito.getPIN(),tarjetaDebito.getApellido(),tarjetaDebito.getNombre());
        this.saldoDisponible = tarjetaDebito.saldoDisponible;
    }

    public void setsaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getsaldoDisponible() {
        return saldoDisponible;
    }
    @Override
    public  void mostrarTarjeta(){
        System.out.println("Tarjeta Debito: ");
        super.mostrarTarjeta();
        System.out.println("Saldo: " + getsaldoDisponible());
    }
}
