package ufpb.br.dcx.saraiva.poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela {
    public static void main(String[] agrs) {
        JFrame window = new JFrame("Home");
        JOptionPane lay = new JOptionPane();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 300);

        Colecao cole = new Colecao();
        Gibi abobra = new Gibi("Reino do ontem","superman", "batma é bom dimai", 9);
        cole.adicionarHq(abobra);


        window.setVisible(true);

        JButton botao1 = new JButton("mostar hqs");

        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cole.toString());
            }
        });
        window.setVisible(true);
        window.add(botao1);


    }

}