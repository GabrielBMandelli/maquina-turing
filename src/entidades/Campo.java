package entidades;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Campo {
    
    private int posicao;
    private JTextField textField;
    private JLabel labelArrow;

    public Campo(){
        
    }
    
    public Campo(int posicao, JTextField textField, JLabel label) {
        this.posicao = posicao;
        this.textField = textField;
        this.labelArrow = label;
        this.labelArrow.setVisible(false);
        
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
    
    public void setTexto(String texto) {
        this.textField.setText(texto);
    }
    
    public String getTexto() {
        return this.textField.getText();
    }
    
    public void setArrowVisible(boolean value) {
        this.labelArrow.setVisible(value);
    }
    
    public void setCor(Color value) {
        this.textField.setBackground(value);
    }

    @Override
    public String toString() {
        return "Campo{" + "posicao=" + posicao + ", textField=" + textField + '}';
    }
    
}
