package ufpb.br.dcx.saraiva.poo;

import java.util.HashMap;

public class Colecao implements ProgramaGibi {
    protected HashMap<String, Gibi> estante = new HashMap<>();

    @Override
    public void adicionarHq(Gibi hq) throws GibiRepetidoException {
        if (estante.containsKey(hq.getId())) {
            throw new GibiRepetidoException("Gibi repetido.");
        } else {
            estante.put(hq.getId(), hq);
        }
    }

    @Override
    public void removerHq(Gibi hq) throws GibiNaoEncontrado {
        if (estante.containsKey(hq.getId())) {
            estante.remove(hq.getId());
        } else {
            throw new GibiNaoEncontrado("Gibi não foi encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Colecao: " + estante;
    }
}