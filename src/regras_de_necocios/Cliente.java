/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Cliente implements Serializable {

   
    private String none;
    private String cpf;
    private String email;
    private String rua;
    private String cep;
    private String cidade;
    private String bairro;
    private String ufEndreco;
    private String numero;
    private String nomeMae;
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(!cpf.isEmpty()){
        this.cpf = cpf.trim();
        }else{
           throw new RuntimeException("CPF invalido"); 
        }
    }


      public String getCep() {
        return cep;
    }

    public void setCep(String cep) {

        if (!cep.trim().isEmpty() && cep.length() == 8) {
            this.cep = cep.trim();

        } else {
            throw new RuntimeException("Cep invalido");
        }

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (!rua.isEmpty()) {
            this.rua = rua.trim();
        } else {
            throw new RuntimeException("Rua obrigatoria!");
        }

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {

        if (!numero.isEmpty()) {
            this.numero = numero.trim();
        } else {
            throw new RuntimeException("Numero obrigatorio!");
        }

    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {

        if (!none.isEmpty()) {
            this.none = none.trim();
        } else {
            throw new RuntimeException("Nome obrigatorio!");
        }

    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {

        if (!nomeMae.isEmpty()) {
            this.nomeMae = nomeMae.trim();
        } else {
            throw new RuntimeException("Nome da mãe obrigatorio!");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {

        if (!cidade.isEmpty()) {
            this.cidade = cidade.trim();
        } else {
            throw new RuntimeException("Cidade obrigatoria!");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {

        if (!bairro.isEmpty()) {
            this.bairro = bairro.trim();
        } else {
            throw new RuntimeException("bairro obrigatorio!");
        }
    }

    public String getUfEndreco() {
        return ufEndreco;
    }

    public void setUfEndreco(String ufEndreco) {

        this.ufEndreco = ufEndreco.trim();
    }

   
}
