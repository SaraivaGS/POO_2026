package ufpb.br.dcx.saraiva.poo;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
    List<Gibi> estante = new ArrayList<>();

    public void bling(Gibi hq){
        estante.add(hq);
    }
    public void show(){
        System.out.println(estante);
    }
}
