package edu.pingpong;

import java.util.ArrayList;
import java.util.List;

public class  CajeroAutomatico{


    public int idUltCaj;
    public int idCaj = 0;
    public int[][] billetes;
    public List<Object> tarjeta;
    /* public List<Object> ListaTarjeta = new ArrayList<>(); */

    public CajeroAutomatico() {
        this.setIdCaj(idUltCaj++);
        tarjeta = new ArrayList<>();
     }
     

    public void setIdCaj(int idCaj) {
        this.idCaj = idCaj;
    }

    public void setBilletes(int[][] billetes) {
        this.billetes = billetes;
    }

    public int[][] getBilletes() {
        return billetes;
    }

 // Preguntar a Oualid como era esta parte
    public void setTarjeta(List<Object> tarjeta) {
        this.tarjeta = tarjeta;
    }
    public List<Object> getListaTarjeta() {
        return tarjeta;
    }


}
