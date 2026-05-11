package ufpb.br.dcx.saraiva.poo;

import java.util.ArrayList;
import java.util.List;

public class Colecao implements ProgramaGibi{
    List<Gibi> estante = new ArrayList<>();

    public void adicionarHq(Gibi hq){
        if (estante.contains(hq)){
            GibiRepetidoException mensagem = new GibiRepetidoException("Gibi repido");
            System.out.println(mensagem.getMessage());
            } else {
            estante.add(hq);
        }
        }
    }


