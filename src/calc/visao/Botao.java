package calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("courir", Font.PLAIN, 25));
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
