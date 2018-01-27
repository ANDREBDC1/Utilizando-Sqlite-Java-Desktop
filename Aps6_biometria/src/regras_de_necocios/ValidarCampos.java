/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

/**
 *
 * @author andre
 */
public class ValidarCampos  extends  KeyAdapter{
    private JTextField txtCampo;
    private JFormattedTextField txtCampo2;
    private boolean somenteNumeros;
    private int qtdCaracter;
    public  ValidarCampos(JTextField campoTexto, boolean  somenteNumeros, int qtdCaracter){
        this.txtCampo = campoTexto;
        this.somenteNumeros = somenteNumeros;
        this.qtdCaracter = qtdCaracter;
        
        
        
    }
    
    public  ValidarCampos(JFormattedTextField campoTexto , boolean  somenteNumeros, int qtdCaracter){
        this.txtCampo2 = campoTexto;
        this.somenteNumeros = somenteNumeros;
        this.qtdCaracter = qtdCaracter;
        
    }
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
        String numero ="1234567890";
        String caracter = "?:,=";
        if(somenteNumeros){
            if(this.txtCampo.getText().length() < this.qtdCaracter -1 && numero.contains(""+ke.getKeyChar()) && !caracter.contains(""+ke.getKeyChar())){
                
            }else{
                ke.consume();
            }
            
        }else{
            if(this.txtCampo.getText().length() <= this.qtdCaracter -1 && !caracter.contains(""+ke.getKeyChar())){
                
            }else{
                ke.consume();
            }
        }
    }
    
}
