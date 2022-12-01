package br.com.cmarchi.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor){
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("FreeSans", Font.PLAIN,25));
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }


}
