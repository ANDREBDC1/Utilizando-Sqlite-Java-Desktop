/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.File;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lb.Imagem;
import regras_de_necocios.CRUD;
import regras_de_necocios.MensagemUsuario;
import regras_de_necocios.NCliente;
import regras_de_necocios.UsuarioLogin;

/**
 *
 * @author André Rian
 */
public class CadastroLogin extends javax.swing.JFrame {

    private TelaLogin telaLogin;
    private Imagem imagem;
    private byte[] imagemByte;
    private BufferedImage bufferedImage;
    private String caminhoDaImagem;
    private UsuarioLogin usuarioLogin;
    private int num;
    private String nomeDaImagem;
    private final NCliente sqlite;

    /**
     * Creates new form CadastroLogin
     */
    public CadastroLogin() {
        initComponents();
        carregarPadraoWindwos();
        sqlite = new NCliente("db/Cadastro.db");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        btBusca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btCadastra = new javax.swing.JButton();
        lbImgDigital = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVolta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario icone.png"))); // NOI18N
        jLabel1.setText("Usuário:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_24.png"))); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setText("Tipo de Usuário:");

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Usuario", "Cliente" }));

        btBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa2.png"))); // NOI18N
        btBusca.setText("Busca...");
        btBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaActionPerformed(evt);
            }
        });

        jLabel4.setText("Imagem do usuário:");

        btCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save-icon.png"))); // NOI18N
        btCadastra.setText("Cadastra");
        btCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastraActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(btCadastra))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btExcluir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btLimpar)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbImgDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbImgDigital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastra)
                    .addComponent(btExcluir)
                    .addComponent(btEditar))
                .addGap(10, 10, 10))
        );

        btVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btVolta.setText("Volta");
        btVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btVolta)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaLogin = new TelaLogin();
        telaLogin.setVisible(true);


    }//GEN-LAST:event_btVoltaActionPerformed

    private void btCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastraActionPerformed
        // TODO add your handling code here:

        if (txtSenha.getText().isEmpty() || txtUsuario.getText().isEmpty()) {
            MensagemUsuario.mensagemAlerta("Usuário e senha obrigatorios!");
            return;
        }

        if (lbImgDigital.getIcon() == null) {
            MensagemUsuario.mensagemAlerta("Informe uma imagem para o usuário!");
            return;
        }

        this.cadastraDadosLogin();


    }//GEN-LAST:event_btCadastraActionPerformed

    private void cadastraDadosLogin() {
        usuarioLogin = new UsuarioLogin();
        try {
            String tipoUsuario = cbTipoUsuario.getSelectedItem().toString();
            usuarioLogin = sqlite.consultaLogin(txtUsuario.getText().trim(), tipoUsuario.trim());

            if (usuarioLogin != null) {

                MensagemUsuario.mensagemAviso("Usuário já cadastrado!");
                mostraDadosLogin(usuarioLogin);
                btEditar.setEnabled(true);
                btExcluir.setEnabled(true);
                return;

            }
            usuarioLogin = new UsuarioLogin();
            Random rd = new Random();
            num = rd.nextInt();
            nomeDaImagem = (String) "Img" + num + ".png";
            usuarioLogin.setNomeDaImagem(nomeDaImagem);
            this.pegaDadosLogin();
            sqlite.inserirLogin(usuarioLogin);
            this.salvaImagem();
            MensagemUsuario.mensagemAviso("Usuário cadastro com sucesso!");
        } catch (Exception e) {
            MensagemUsuario.mensagemErro(e.getMessage());
        }
    }

    private void mostraDadosLogin(UsuarioLogin usuarioLogin) {

        txtUsuario.setText(usuarioLogin.getNomeUsuario());
        txtSenha.setText(usuarioLogin.getSenha());
        cbTipoUsuario.setSelectedItem(usuarioLogin.getTipoDeUsuario());
        if (usuarioLogin.getIDUsuario() > 1) {
            caminhoDaImagem = usuarioLogin.getCaminhoDaImagem().trim() + "/" + usuarioLogin.getNomeDaImagem().trim();
            bufferedImage = this.imagem.coverterParaBufferedImage(caminhoDaImagem);
            imagemByte = this.imagem.coverteImagemEmArryByte(bufferedImage);
            Imagem.colocarImagemLabel(lbImgDigital, bufferedImage);
        }
    }

    private void pegaDadosLogin() {

        caminhoDaImagem = "Imagem Usuario";
        usuarioLogin.setNomeUsuario(txtUsuario.getText());
        usuarioLogin.setSenha(txtSenha.getText());
        usuarioLogin.setTipoDeUsuario(cbTipoUsuario.getSelectedItem().toString());
        usuarioLogin.setCaminhoDaImagem(caminhoDaImagem);
        usuarioLogin.setNomeDaImagem(usuarioLogin.getNomeDaImagem());

    }

    private void salvaImagem() {

        Imagem.salvaImagem(usuarioLogin.getNomeDaImagem(), caminhoDaImagem, "Imagem Usuario", imagemByte);

    }

    private void limparCampos() {

        this.txtSenha.setText("");
        this.txtUsuario.setText("");
        this.lbImgDigital.setIcon(null);
        this.cbTipoUsuario.setSelectedIndex(0);
        txtUsuario.grabFocus();

    }

    private void btBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaActionPerformed
        // TODO add your handling code here:
        imagem = new Imagem();
        JFileChooser abrirImagem = new JFileChooser();
        abrirImagem.setDialogTitle("Procura digital");
        FileNameExtensionFilter extecaoPermitida = new FileNameExtensionFilter("Imagem", "jpg", "png");
        abrirImagem.setFileFilter(extecaoPermitida);

        int foiSelecionadoImagem = abrirImagem.showOpenDialog(null);

        if (foiSelecionadoImagem != JFileChooser.APPROVE_OPTION) {
            MensagemUsuario.mensagemAviso("Você não selecionou nem uma imagem!");
            return;
        }
        File pegaImagem = abrirImagem.getSelectedFile();
        this.imagemByte = imagem.coverterImagemEmArryDeByte(pegaImagem);
        Imagem.colocarImagemLabel(lbImgDigital, imagemByte);


    }//GEN-LAST:event_btBuscaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        this.limparCampos();

    }//GEN-LAST:event_btLimparActionPerformed


    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        try {
            this.pegaDadosLogin();
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            sqlite.updateLogin(usuarioLogin);
            salvaImagem();
            MensagemUsuario.mensagemAviso("Dados atualizados com sucesso!");
        } catch (Exception e) {
            MensagemUsuario.mensagemAlerta(e.getMessage());
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        try {
            int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este usuário!", "Alerta", JOptionPane.YES_NO_OPTION);
            if (opc != JOptionPane.YES_OPTION) {
                return;
            }
            sqlite.excluirUsuario(usuarioLogin.getIDUsuario());
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            this.limparCampos();
            excluirImagem();
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            MensagemUsuario.mensagemAviso("Usuário excluirdo com sucesso!");

        } catch (Exception e) {
            MensagemUsuario.mensagemAlerta(e.getMessage());
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void excluirImagem() {
        imagem.deletarImagem(usuarioLogin.getCaminhoDaImagem() + "/" + usuarioLogin.getNomeDaImagem());
    }

    private void carregarPadraoWindwos() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btCadastra;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVolta;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImgDigital;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
