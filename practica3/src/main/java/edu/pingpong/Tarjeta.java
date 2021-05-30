package edu.pingpong;

public abstract class Tarjeta implements interfazTarjetas {

    String NIF;
    int PIN;
    String nombre;
    String apellido;
    int SaldoDisponible;
    int CreditoDisponible;

 

    Tarjeta(){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.SaldoDisponible = SaldoDisponible;
        this.CreditoDisponible = CreditoDisponible;
    }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }
        
        public String getNIF() {
            return NIF;
        }
        public String getapellido() {
            return apellido;
        }

        @Override
        public void mostrarTarjeta(){
            getNombre();
            getapellido();
            getNIF();
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("NIF: " + NIF);            
        };
}
