package pl.urbanik.computerapp.models;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private List<Computer> list;

    public Facture(){
        list = new ArrayList<Computer>();
    }

    public void add(Computer c){
        list.add(c);
    }
}
