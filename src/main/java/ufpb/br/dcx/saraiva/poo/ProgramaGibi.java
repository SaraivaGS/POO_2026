package ufpb.br.dcx.saraiva.poo;

public interface ProgramaGibi {
    void adicionarHq(Gibi hq) throws GibiRepetidoException;
    void removerHq(Gibi hq) throws GibiNaoEncontrado;
    String toString();
}