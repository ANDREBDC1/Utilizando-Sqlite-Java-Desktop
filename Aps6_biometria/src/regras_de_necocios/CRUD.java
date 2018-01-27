/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author André Rian
 */
public class CRUD {

    private static String url;
    protected static Connection connection;
    protected static Statement statement;

    public CRUD(String fileDb) {
        fillParamente(fileDb);
    }

    private static void fillParamente(String fileDb) {
        try {
            Class.forName("org.sqlite.JDBC");
            url = "jdbc:sqlite:" + fileDb;
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    protected void statementexecuteUpdate(String sql) {
        this.conectionDb();
        try {
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            this.desconect();
        }
    }

    // connection
    protected void conectionDb() {
        try {

            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao se conectar com banco de dados\n" + ex.getMessage());
        }
    }

    protected void desconect() {
        try {
            connection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    // create table
    public void criateTable() {

        String tableloginUsuario = "Create table if not exists login_usuario("
                + " [id_user] INTEGER PRIMARY KEY  AUTOINCREMENT NOT NULL,"
                + "usuario          STRING (30),"
                + "senha            STRING (30),"
                + "tipo_usuario     STRING (30),"
                + "nome_imagem      STRING (30),"
                + "caminho_imagem   STRING (100)"
                + ");";

        String tableCliente = "Create table if not exists cliente("
                + "cpf         STRING (16)  PRIMARY KEY NOT NULL,"
                + "nome        STRING (100) NOT NULL,"
                + "rua         STRING (100) NOT NULL,"
                + "cep         STRING (10)  NOT NULL,"
                + "cidade      STRING (100)  NOT NULL,"
                + "bairro      STRING (100) NOT NULL,"
                + "numero      INTEGER,"
                + "uf_endereco STRING (2)   NOT NULL,"
                + "email       STRING (100),"
                + "nome_mae    STRING (100)"
                + ");";

        statementexecuteUpdate(tableCliente);
        statementexecuteUpdate(tableloginUsuario);

    }

    // insert
    private void insertTable() {
        String insertCliente = "INSERT INTO cliente ("
                + "                        cpf,"
                + "                        nome,"
                + "                        rua,"
                + "                        cep,"
                + "                        bairro,"
                + "                        numero,"
                + "                        uf_endereco,"
                + "                        email,"
                + "                        nome_mae"
                + "                    )"
                + "                    VALUES ("
                + "                        'cpf',"
                + "                        'nome',"
                + "                        'rua',"
                + "                        'cep',"
                + "                        'bairro',"
                + "                        'numero',"
                + "                        'uf_endereco',"
                + "                        'email',"
                + "                        'nome_mae'"
                + "                    );";

        String insertLoginUsuario = "INSERT INTO login_usuario ("
                + "                              usuario,"
                + "                              senha,"
                + "                              tipo_usuario,"
                + "                              nome_imagem,"
                + "                              caminho_imagem"
                + "                          )"
                + "                          VALUES ("
                + "                              'andre',"
                + "                              'rian',"
                + "                              'adm',"
                + "                              'a',"
                + "                              'C://'"
                + "                          );";
        statementexecuteUpdate(insertLoginUsuario);
        statementexecuteUpdate(insertCliente);

    }

    public void insertTableUser() {

        if (!isSelectUser()) {
            return;
        }
        String insertLoginUsuario = "INSERT INTO login_usuario ("
                + "                              usuario,"
                + "                              senha,"
                + "                              tipo_usuario,"
                + "                              nome_imagem,"
                + "                              caminho_imagem"
                + "                          )"
                + "                          VALUES ("
                + "                              'admin',"
                + "                              'admin',"
                + "                              'Administrador',"
                + "                              'n',"
                + "                              'n'"
                + "                          );";
        statementexecuteUpdate(insertLoginUsuario);

    }

    protected String sqlInserirLoginUser(UsuarioLogin usuarioLogin) {

        String sqlInsertLoginUser = "INSERT INTO login_usuario ("
                + "                              usuario,"
                + "                              senha,"
                + "                              tipo_usuario,"
                + "                              nome_imagem,"
                + "                              caminho_imagem"
                + "                          )"
                + "                          VALUES ("
                + "                              '" + usuarioLogin.getNomeUsuario() + "',"
                + "                              '" + usuarioLogin.getSenha() + "',"
                + "                              '" + usuarioLogin.getTipoDeUsuario() + "',"
                + "                              '" + usuarioLogin.getNomeDaImagem() + "',"
                + "                              '" + usuarioLogin.getCaminhoDaImagem() + "' );";

        return sqlInsertLoginUser;

    }

    protected String sqlInserirCliente(Cliente cliente) {
        String sqlInsertCliente = "INSERT INTO cliente ("
                + "                        cpf,"
                + "                        nome,"
                + "                        rua,"
                + "                        cep,"
                + "                        cidade,"
                + "                        bairro,"
                + "                        numero,"
                + "                        uf_endereco,"
                + "                        email,"
                + "                        nome_mae"
                + "                    )"
                + "                    VALUES ("
                + "                        '" + cliente.getCpf() + "',"
                + "                        upper('" + cliente.getNone() + "'),"
                + "                        upper('" + cliente.getRua() + "'),"
                + "                         '" + cliente.getCep() + "',"
                + "                        upper('" + cliente.getCidade()+ "'),"
                + "                        upper('" + cliente.getBairro() + "'),"
                + "                        " + cliente.getNumero() + ","
                + "                        upper('" + cliente.getUfEndreco() + "'),"
                + "                        upper('" + cliente.getEmail() + "'),"
                + "                        upper('" + cliente.getNomeMae() + "')"
                + "                    );";

        return sqlInsertCliente;

    }

    // update
    private void updateTable() {

        String updateUsuarioLoginId = "UPDATE login_usuario SET "
                + "       usuario = 'aa',"
                + "       senha = 'aa',"
                + "       tipo_usuario = 'tipo',"
                + "       nome_imagem = 'aa',"
                + "       caminho_imagem = 'd://'"
                + " WHERE id_user = 1";

        String updateClienteCpf = "UPDATE cliente"
                + "   SET cpf = 'cpf',"
                + "       nome = 'nome',"
                + "       rua = 'rua',"
                + "       cep = 'cep',"
                + "       bairro = 'bairro',"
                + "       numero = 'numero',"
                + "       uf_endereco = 'uf_endereco',"
                + "       email = 'email',"
                + "       nome_mae = 'nome_mae'"
                + " WHERE cpf = 'cpf'";

        statementexecuteUpdate(updateUsuarioLoginId);
        //   statementexecuteUpdate(updateClienteCpf);

    }

    protected String sqlUpdateCliente(Cliente cliente) {

        String sqlUpdateClienteCpf = "UPDATE cliente"
                + "   SET cpf = '" + cliente.getCpf() + "',"
                + "       nome = upper('" + cliente.getNone() + "'),"
                + "       rua = upper('" + cliente.getRua() + "'),"
                + "       cep = '" + cliente.getCep() + "',"
                + "       cidade = upper('" + cliente.getCidade() + "'),"
                + "       bairro = upper('" + cliente.getBairro() + "'),"
                + "       numero = " + cliente.getNumero() + ","
                + "       uf_endereco = upper('" + cliente.getUfEndreco() + "'),"
                + "       email = upper('" + cliente.getEmail() + "'),"
                + "       nome_mae = upper('" + cliente.getNomeMae() + "')"
                + " WHERE cpf = '" +cliente.getCpf()+"'";

        return sqlUpdateClienteCpf;

    }

    protected String sqlUpdateLogin(UsuarioLogin usuarioLogin) {
        String sqlUpdateUsuarioLoginId = "UPDATE login_usuario SET "
                + "       usuario = '" + usuarioLogin.getNomeUsuario() + "',"
                + "       senha = '" + usuarioLogin.getSenha() + "',"
                + "       tipo_usuario = '" + usuarioLogin.getTipoDeUsuario() + "',"
                + "       nome_imagem = '" + usuarioLogin.getNomeDaImagem() + "',"
                + "       caminho_imagem = '" + usuarioLogin.getCaminhoDaImagem() + "'"
                + " WHERE id_user = " + usuarioLogin.getIDUsuario();

        return sqlUpdateUsuarioLoginId;

    }

    // delete
    private void deleteTable() {

        String deleteClienteCpf = "DELETE FROM cliente"
                + "      WHERE cpf = 'cpf'";

        String deleteUsuarioLoginId = "DELETE FROM login_usuario"
                + "      WHERE id_user = 1";

        //statementexecuteUpdate(deleteClienteCpf);
        statementexecuteUpdate(deleteUsuarioLoginId);

    }

    protected String sqlExcluirUsuarioId(int Id) {

        String sqlDeleteUsuario = "DELETE FROM login_usuario"
                + "      WHERE id_user = " + Id;

        return sqlDeleteUsuario;

    }

    protected String sqlExcluirCliente(String chave) {
        String sqlDeleteCliente = "DELETE FROM  "
                + "cliente "
                + "  where cpf = '" + chave + "'";

        return sqlDeleteCliente;

    }

    // select 
    private void select() {

        String selectCliente = "SELECT "
                + "       cpf,"
                + "       nome,"
                + "       rua,"
                + "       cep,"
                + "       bairro,"
                + "       numero,"
                + "       uf_endereco,"
                + "       email,"
                + "       nome_mae"
                + "  FROM "
                + "cliente"
                + "where cpf = '';";

        String selectUsuarioLogin = "SELECT id_user,"
                + "       usuario,"
                + "       senha,"
                + "       tipo_usuario,"
                + "       nome_imagem,"
                + "       caminho_imagem"
                + "  FROM login_usuario "
                + "where id_user = 1";

        //ResultSet resultSet1 = statementExecuteQuery(selectCliente);
        //ResultSet resultSet2 = statementExecuteQuery(selectUsuarioLogin);
    }

    protected String sqlConsultaLogin(String chave) {

        String sqlSelectUsuarioLogin = "SELECT id_user,"
                + "       usuario,"
                + "       senha,"
                + "       tipo_usuario,"
                + "       nome_imagem,"
                + "       caminho_imagem"
                + "  FROM login_usuario"
                + "  where usuario = '" + chave + "'";

        return sqlSelectUsuarioLogin;

    }

    protected String sqlConsultaLogin(String chave, String chave2) {
        String sqlSelectUsuarioLogin = "SELECT"
                + "       id_user,"
                + "       usuario,"
                + "       senha,"
                + "       tipo_usuario,"
                + "       nome_imagem,"
                + "       caminho_imagem"
                + "  FROM login_usuario"
                + "  where usuario = '" + chave + "' AND tipo_usuario = '" + chave2 + "'";

        return sqlSelectUsuarioLogin;
    }

    protected String sqlConsultaCliente(String cpf) {

        String sqlSelectCliente = "SELECT "
                + "       cpf,"
                + "       nome,"
                + "       rua,"
                + "       cep,"
                + "       cidade,"
                + "       bairro,"
                + "       numero,"
                + "       uf_endereco,"
                + "       email,"
                + "       nome_mae"
                + "  FROM  cliente"
                + "  where cpf = '" + cpf + "';";

        return sqlSelectCliente;
    }

    protected boolean isSelectUser() {

        conectionDb();
        String idUser = "";
        try {

            String selectUsuarioLogin = "SELECT id_user"
                    + "  FROM login_usuario"
                    + " where id_user = 1;";

            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(selectUsuarioLogin);
            while (rs.next()) {
                idUser = rs.getString("id_user");
            }

            if (!idUser.isEmpty()) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }

//    private ResultSet statementExecuteQuery(String sql) {
//        conectionDb();
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            return rs;
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex.getMessage());
//        } finally {
//            this.desconect();
//        }
//    }
}
