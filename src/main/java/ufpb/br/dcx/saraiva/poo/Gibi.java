package ufpb.br.dcx.saraiva.poo;

public class Gibi {
    private String nome;
    private String review;
    private double nota;

    public Gibi(String nome, String review, double nota){
        this.nome = nome;
        this.review = review;
        this.nota = nota;
    }
    public Gibi(){
        this.nome = "Sem nome";
        this.review = "vazio";
        this.nota = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
