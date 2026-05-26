package ufpb.br.dcx.saraiva.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela {
    public static void main(String[] args) {
        JFrame window = new JFrame("Home");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setLayout(new FlowLayout());

        Colecao cole = new Colecao();
        Gibi abobra = new Gibi("1", "Reino do ontem", "superman", "batman é bom demais", 9);

        try {
            cole.adicionarHq(abobra);
        } catch (GibiRepetidoException e) {
            JOptionPane.showMessageDialog(window, e.getMessage());
        }

        JButton botao1 = new JButton("mostrar hqs");

        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(window, cole.toString());
            }
        });

        window.add(botao1);
        window.setVisible(true);
    }
}