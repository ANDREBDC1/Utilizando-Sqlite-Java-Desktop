/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import java.util.ArrayList;

/**
 *
 * @author André Rian
 */
public class UsuarioLogin {

    private int IDUsuario;
    private String nomeUsuario;
    private String senha;
    private String nomeDaImagem;
    private String TipoDeUsuario;
    private String caminhoDaImagem;
    private boolean consultaUsuario;
    private ArrayList<UsuarioLogin> listUser;

    public String getCaminhoDaImagem() {
        return caminhoDaImagem.trim();
    }

    public void setCaminhoDaImagem(String caminhoDaImagem) {
        this.caminhoDaImagem = caminhoDaImagem.trim();
    }
    
    

    public ArrayList<UsuarioLogin> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<UsuarioLogin> listUser) {
        this.listUser = listUser;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public boolean isConsultaUsuario() {
        return consultaUsuario;
    }

    public void setConsultaUsuario(boolean consultaUsuario) {

        this.consultaUsuario = consultaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {

       
            this.nomeUsuario = nomeUsuario.trim();
        
    }

    public String getSenha() {
        return senha.trim();
    }

    public void setSenha(String senha) {
       
        this.senha = senha.trim();
        
    }

    public String getNomeDaImagem() {
        return nomeDaImagem.trim();
    }

    public void setNomeDaImagem(String nomeDaImagem) {
        
        this.nomeDaImagem = nomeDaImagem.trim();
        
    }

    public String getTipoDeUsuario() {
        return TipoDeUsuario.trim();
    }

    public void setTipoDeUsuario(String TipoDeUsuario) {
        this.TipoDeUsuario = TipoDeUsuario.trim();
    }

}
