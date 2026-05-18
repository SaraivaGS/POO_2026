package ufpb.br.dcx.saraiva.poo;

public class Gibi {
    private String nome;
    private String review;
    private double nota;
    private String heroi;

    public Gibi(String nome, String heroi, String review, double nota){
        this.nome = nome;
        this.review = review;
        this.nota = nota;
        this.heroi = heroi;
    }
    public Gibi(){
        this.nome = "Sem nome";
        this.review = "Vazio";
        this.nota = 0;
        this.heroi = "Não defenido";
    }

    @Override
    public String toString() {
        return "Gibi "+ nome + '\'' +
                " Review: " + review + '\'' +
                " Nota: " + nota +
                " Heroi: " + heroi;
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

    public String getHeroi() {
        return heroi;
    }

    public void setHeroi(String heroi) {
        this.heroi = heroi;
    }
}
