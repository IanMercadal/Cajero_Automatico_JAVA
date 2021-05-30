package edu.pingpong;

import java.util.ArrayList;
import java.util.List;

public class CajeroAutomatico{

    public int idUltCaj = 0;
    public int idCaj = 0;
    public int[][] billetes;
    private List<Tarjeta> listaTarjeta = new ArrayList<>();
    /* public List<Object> ListaTarjeta = new ArrayList<>(); */

    public CajeroAutomatico() {
        this.setIdCaj(idCaj+1);
        this.setIUltdCaj(idCaj-1);
        listaTarjeta = new ArrayList<>();
     }
     

    public void setIdCaj(int idCaj) {
        this.idCaj = idCaj;
        System.out.println("Cajero actual: " + idCaj);
    }
    
    public void setIUltdCaj(int idUltCaj) {
        this.idUltCaj = idUltCaj + 1;
        System.out.println("Cajero anterior: " + idUltCaj);
    }

    public void setBilletes(int[][] billetes) {
        this.billetes = billetes;
    }

    public int[][] getBilletes() {
        return billetes;
    }
    public void setListaTarjeta(List<Tarjeta> listaTarjeta) {
        this.listaTarjeta = listaTarjeta;
    }
    

    public CajeroAutomatico(Integer idUltCaj, Integer idCaj, int[][] billetes, List<Tarjeta> listaTarjeta) {
        this.idCaj = idCaj;
        this.billetes =billetes;
        this.listaTarjeta = listaTarjeta;
    }

    public void setTarjeta(List<Tarjeta> listaTarjeta) {
        this.listaTarjeta = listaTarjeta;
    }
    public List<Tarjeta> getListaTarjeta() {
        return listaTarjeta;
    }


}
