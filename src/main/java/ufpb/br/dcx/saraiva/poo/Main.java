package ufpb.br.dcx.saraiva.poo;

import javax.swing.*;

public class Main {
    public static void main (String[]agrs){
        JFrame window = new JFrame("Home");
        JOptionPane lay = new JOptionPane();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 300);

        Colecao cole = new Colecao();
        boolean loop = false;

        for(int i = 0; i < 2; i++) {
            String nomeM = JOptionPane.showInputDialog("Nome");
            String heroiM = JOptionPane.showInputDialog("Heroi:");
            String reviewM = JOptionPane.showInputDialog("Review");

            Gibi gibi = new Gibi();

            gibi.setHeroi(heroiM);
            gibi.setNome(nomeM);
            gibi.setReview(reviewM);
            cole.adicionarHq(gibi);


        }






        window.setVisible(true);



    }
}