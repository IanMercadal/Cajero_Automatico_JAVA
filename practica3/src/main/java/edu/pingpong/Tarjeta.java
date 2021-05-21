package edu.pingpong;

public abstract class Tarjeta {

    String NIF;
    int PIN;
    String nombre;
    String apellido;
    int SaldoDisponible;
    int prestamo;

 

    Tarjeta(){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.SaldoDisponible = SaldoDisponible;
        this.prestamo = prestamo;
    }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getApellido() {
            return apellido;
        }

}
