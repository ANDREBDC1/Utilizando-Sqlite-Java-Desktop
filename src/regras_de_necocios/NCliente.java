/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author André Rian
 */
public class NCliente extends CRUD {

    public NCliente(String fileDb) {
        super(fileDb);
    }

    public UsuarioLogin consultaLogin(String chave) {

        String selectUsuarioLogin = sqlConsultaLogin(chave);
        UsuarioLogin usuarioLogin = null;
        ArrayList<UsuarioLogin> listUser = new ArrayList<UsuarioLogin>();

        try {
            conectionDb();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(selectUsuarioLogin);
            while (rs.next()) {
                usuarioLogin = new UsuarioLogin();
                usuarioLogin.setSenha(rs.getString("senha").trim());
                usuarioLogin.setIDUsuario(Integer.parseInt(rs.getString("id_user")));
                usuarioLogin.setTipoDeUsuario(rs.getString("tipo_usuario").trim());
                usuarioLogin.setNomeDaImagem(rs.getString("nome_imagem").trim());
                usuarioLogin.setCaminhoDaImagem(rs.getString("caminho_imagem").trim());
                usuarioLogin.setNomeUsuario(rs.getString("usuario").trim());
                listUser.add(usuarioLogin);

            }
            if (usuarioLogin != null) {
                usuarioLogin.setListUser(listUser);
                return usuarioLogin;
            }

        } catch (SQLException ex) {

            throw new RuntimeException("Erro ao realizar a consulta na tebela login_Cadastro!\n" + ex.getMessage());
        }

        return null;
    }

    public UsuarioLogin consultaLogin(String chave, String chave2) {

        String selectUsuarioLogin = sqlConsultaLogin(chave, chave2);

        UsuarioLogin usuarioLogin = null;
        try {
            conectionDb();
            Statement stm = connection.createStatement();
            ResultSet rs;
            rs = stm.executeQuery(selectUsuarioLogin);
            while (rs.next()) {
                usuarioLogin = new UsuarioLogin();
                usuarioLogin.setIDUsuario(Integer.parseInt(rs.getString("id_user")));
                usuarioLogin.setSenha(rs.getString("senha").trim());
                usuarioLogin.setTipoDeUsuario(rs.getString("tipo_usuario").trim());
                usuarioLogin.setNomeDaImagem(rs.getString("nome_imagem").trim());
                usuarioLogin.setCaminhoDaImagem(rs.getString("caminho_imagem"));
                usuarioLogin.setNomeUsuario(rs.getString("usuario"));

            }

            if (usuarioLogin != null) {
                usuarioLogin.setConsultaUsuario(true);
                return usuarioLogin;
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao realizar a consulta na tebela!\n" + ex.getMessage());

        }

        return usuarioLogin;
    }

    public Cliente consultaCliente(String cpf) {

        String selectCliente = sqlConsultaCliente(cpf);

        Cliente cliente = null;
        try {
            conectionDb();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(selectCliente);
            while (rs.next()) {

                cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNone(rs.getString("nome").trim());
                cliente.setRua(rs.getString("rua").trim());
                cliente.setCep(rs.getString("cep").trim());
                cliente.setBairro(rs.getString("bairro").trim());
                cliente.setCidade(rs.getString("cidade").trim());
                cliente.setNumero(rs.getString("numero").trim());
                cliente.setUfEndreco(rs.getString("uf_endereco").trim());
                cliente.setEmail(rs.getString("email").trim());
                cliente.setNomeMae(rs.getString("nome_mae").trim());

            }

            if (cliente != null) {
                return cliente;
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return cliente;
    }

    public void excluirCliente(String chave) {
        String deleteCliente = sqlExcluirCliente(chave);
        statementexecuteUpdate(deleteCliente);

    }

    public void excluirUsuario(int Id) {

        String deleteUsuario = sqlExcluirUsuarioId(Id);
        statementexecuteUpdate(deleteUsuario);

    }

    public void inserirCliente(Cliente cliente) {
        String insertCliente = sqlInserirCliente(cliente);
        statementexecuteUpdate(insertCliente);
    }

    public void inserirLogin(UsuarioLogin usuarioLogin) {

        String insertLoginUsuario = sqlInserirLoginUser(usuarioLogin);

        statementexecuteUpdate(insertLoginUsuario);

    }

    public void updateCliente(Cliente cliente) {

        String updateClienteCpf = sqlUpdateCliente(cliente);
        statementexecuteUpdate(updateClienteCpf);

    }

    public void updateLogin(UsuarioLogin usuarioLogin) {
        String updateUsuarioLoginId = sqlUpdateLogin(usuarioLogin);
        statementexecuteUpdate(updateUsuarioLoginId);

    }

}
