package ufpb.br.dcx.saraiva.poo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Colecao implements ProgramaGibi{
    HashMap<String, Gibi> estante = new HashMap<>();
    String id;

    @Override
    public void adicionarHq(Gibi hq){
        if (estante.containsValue(hq)){
            GibiRepetidoException mensagem = new GibiRepetidoException("Gibi repido.");
            System.out.println(mensagem.getMessage());
            } else {
            estante.put(id, hq);
        }

        }
        @Override
        public void removerHq(Gibi hq){
        if (estante.containsValue(hq)){
            estante.remove(id, hq);
        } else{ GibiNaoEncontrado mensagem = new GibiNaoEncontrado("Gibi não foi encontrado.");

        }

        }

    @Override
    public String toString() {
        return "Colecao" + estante ;
    }

    public void filtarPorHeroi(String Heroi){





        }
    }


