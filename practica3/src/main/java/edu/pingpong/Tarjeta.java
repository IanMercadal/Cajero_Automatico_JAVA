package edu.pingpong;

public abstract class Tarjeta implements interfazTarjetas {

    String NIF;
    int PIN;
    String nombre;
    String apellido;
    boolean estado; // No se usa pero tener en cuenta. Getters y setters.

    Tarjeta(){}

    Tarjeta(String NIF, int PIN, String nombre, String apellido){
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido =  apellido;
    }

    Tarjeta(Tarjeta tarjeta){
        this.NIF = tarjeta.NIF;
        this.PIN = tarjeta.PIN;
        this.nombre = tarjeta.nombre;
        this.apellido =  tarjeta.apellido;
    }

    // REPETIR PROCESO HASTA APELLIDO

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setNIF(String nIF) {
            NIF = nIF;
        }
        public void setPIN(int pIN) {
            PIN = pIN;
        }

        public String getNombre() {
            return nombre;
        }
        
        public String getNIF() {
            return NIF;
        }
        public String getApellido() {
            return apellido;
        }
        public int getPIN() {
            return PIN;
        }

        @Override
        public void mostrarTarjeta(){
            System.out.println("Nombre: " + getNombre());
            System.out.println("Apellido: " + getApellido());
            System.out.println("NIF: " + getNIF());            
        };
}
