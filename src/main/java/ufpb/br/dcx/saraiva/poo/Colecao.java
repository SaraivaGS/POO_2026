package ufpb.br.dcx.saraiva.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Colecao implements ProgramaGibi{
    HashMap<String, Gibi> estante = new HashMap<>();
    private String id = "0001";

    public void adicionarHq(Gibi hq){
        if (estante.containsValue(hq)){
            GibiRepetidoException mensagem = new GibiRepetidoException("Gibi repido");
            System.out.println(mensagem.getMessage());
            } else {
            estante.put(id, hq);
        }
        }
    }


