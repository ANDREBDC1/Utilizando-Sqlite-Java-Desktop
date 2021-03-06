/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import regras_de_necocios.Cliente;
import regras_de_necocios.EstadosBrasilEnum;
import regras_de_necocios.MensagemUsuario;
import regras_de_necocios.ValidarCampos;
import regras_de_necocios.NCliente;

/**
 *
 * @author André Rian
 */
public final class CadastroCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private TelaLogin telaLogin;
    private static String tipoUsuario;
    private NCliente sqlite;
    private boolean clickAlterar;
    private boolean testeClientePesquisar = false;

    /**
     * Creates new form CadastroCliente
     *
     * @param tipoUsuario
     * @param nomeUsuario
     */
    public CadastroCliente(String tipoUsuario, String nomeUsuario) {
        initComponents();
        addEstados();
        carregarPadraoWindwos();
        sqlite = new NCliente("db/Cadastro.db");
        this.tipoUsuario = tipoUsuario;
        this.setTitle(nomeUsuario);
        txtNomeUsuario.setText(nomeUsuario + ": (" + tipoUsuario + ")");
        habilitarBotaoExcluirAlterar(tipoUsuario);

    }
    
   private void habilitarBotaoExcluirAlterar(String tipoUsuario){
       switch(tipoUsuario){
           case "Gerente":
               rbAlterar.setEnabled(true);
               rbExcluir.setEnabled(true);
               break;
           case "Usuario":
               rbAlterar.setEnabled(true);
               break;
               default:
       }
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
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        cbUfEndereco = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JTextField();
        btCancelaPesquisa = new javax.swing.JButton();
        btSalva = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbAlterar = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        btOk = new javax.swing.JToggleButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbLogoff = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setPreferredSize(new java.awt.Dimension(603, 100));

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        txtNome.setEnabled(false);

        jLabel3.setText("Nome da Mãe:");

        txtNomeMae.setEnabled(false);

        jLabel4.setText("Endereço:");

        txtEndereco.setEnabled(false);

        jLabel5.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setEnabled(false);

        jLabel6.setText("Bairro:");

        txtCidade.setEnabled(false);

        cbUfEndereco.setEnabled(false);

        jLabel7.setText("UF:");

        jLabel8.setText("Cidade:");

        txtBairro.setEnabled(false);

        jLabel9.setText("E-mail:");

        txtEmail.setEnabled(false);

        jLabel10.setText("Número:");

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa2.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNumero.setEnabled(false);

        btCancelaPesquisa.setText("Cancelar");
        btCancelaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelaPesquisaActionPerformed(evt);
            }
        });

        btSalva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save-icon.png"))); // NOI18N
        btSalva.setText("Salva");
        btSalva.setEnabled(false);
        btSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtEmail)
                    .addComponent(txtNome)
                    .addComponent(txtNomeMae))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalva)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btPesquisar)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(cbUfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalva)
                .addGap(12, 12, 12))
        );

        txtNome.addKeyListener(new ValidarCampos(txtNome, false, 80));
        txtNomeMae.addKeyListener(new ValidarCampos(txtNomeMae, false, 100));
        txtBairro.addKeyListener(new ValidarCampos(txtBairro, false, 100));
        txtCidade.addKeyListener(new ValidarCampos(txtCidade, false, 100));
        txtBairro.addKeyListener(new ValidarCampos(txtBairro, false, 100));
        txtNumero.addKeyListener(new ValidarCampos(txtNumero, true, 10));

        rbAlterar.setText("Alterar");
        rbAlterar.setEnabled(false);
        rbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlterarActionPerformed(evt);
            }
        });

        rbExcluir.setText("Excluir");
        rbExcluir.setEnabled(false);
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        btOk.setText("OK");
        btOk.setEnabled(false);
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAlterar)
                            .addComponent(rbExcluir)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbAlterar)
                .addGap(7, 7, 7)
                .addComponent(rbExcluir)
                .addGap(11, 11, 11)
                .addComponent(btOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoSair.png"))); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbLogoff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLogoff.setForeground(new java.awt.Color(153, 153, 255));
        lbLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-logoff_17-1129231406.png"))); // NOI18N
        lbLogoff.setText("Fazer logoff");
        lbLogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoffMouseClicked(evt);
            }
        });

        txtNomeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario icone.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbLogoff)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeUsuario)
                    .addComponent(lbLogoff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        try {

            if (retiraMascara(txtCpf).isEmpty()) {
                MensagemUsuario.mensagemAviso("Informe um CPF!");
                return;
            }
            this.cliente = new Cliente();
            cliente = sqlite.consultaCliente(retiraMascara(txtCpf));
            selecionaTipoUsuario(tipoUsuario);
            if(cliente != null){
                testeClientePesquisar = true;
            }
            

        } catch (Exception e) {
            MensagemUsuario.mensagemAlerta(e.getMessage());
        }


    }//GEN-LAST:event_btPesquisarActionPerformed

    private void selecionaTipoUsuario(String tipoUsuario) {
        switch (tipoUsuario) {
            case "Gerente":
                gerente(cliente);
                break;
            case "Usuario":
                usuario(cliente);
                break;
            case "Cliente":
                cliente(cliente);
                break;
            default:
                MensagemUsuario.mensagemAlerta("Tipo de usuario não encontrado!");
        }

    }

    private void cliente(Cliente cliente) {

        if (cliente == null) {
            MensagemUsuario.mensagemAviso("Nem um cliente em contrado com este CPF!");
            return;
        }

        setDadosNaTela(cliente);

    }

    private void usuario(Cliente cliente) {
        if (cliente == null) {
            habilitarCampos();
            txtCpf.setEnabled(false);
            txtNome.grabFocus();
            

        } else {
            setDadosNaTela(cliente);
            rbAlterar.setEnabled(true);

        }

    }

    private void gerente(Cliente cliente) {
        if (cliente == null) {
            habilitarCampos();
            txtCpf.setEnabled(false);
            txtNome.grabFocus();
            return;

        }

        setDadosNaTela(cliente);
        rbAlterar.setEnabled(true);
        rbExcluir.setEnabled(true);

    }
    private void btCancelaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelaPesquisaActionPerformed
        // TODO add your handling code here:
        DesabilitarCampos();
        limparCampos();
        txtCpf.setEnabled(true);
        txtCpf.grabFocus();
    }//GEN-LAST:event_btCancelaPesquisaActionPerformed

    private void btSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvaActionPerformed
        // TODO add your handling code here:
        try {
            this.cliente = new Cliente();
            getDadosDaTela();
            sqlite.inserirCliente(cliente);
            DesabilitarCampos();
            MensagemUsuario.mensagemAviso("Cadastro realizado com sucesso!");
            cliente = sqlite.consultaCliente(retiraMascara(txtCpf));
            this.setDadosNaTela(cliente);
            habilitarBotaoExcluirAlterar(tipoUsuario);
            

        } catch (Exception e) {
            MensagemUsuario.mensagemAlerta(e.getMessage());

        }
    }//GEN-LAST:event_btSalvaActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        // TODO add your handling code here:
        if(!testeClientePesquisar || retiraMascara(txtCpf).isEmpty()){
           MensagemUsuario.mensagemAviso("Por favor, pesquese um CPF para realizar esta operação!");
           rbExcluir.setSelected(false);
           rbAlterar.setSelected(false);
           return;
        }
        rbExcluir.setSelected(false);
        habilitarCampos();
        txtCpf.setEnabled(false);
        btOk.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalva.setEnabled(false);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        // TODO add your handling code here:
         if(!testeClientePesquisar || retiraMascara(txtCpf).isEmpty()){
           MensagemUsuario.mensagemAviso("Por favor, pesquese um CPF para realizar esta operação!");
           rbAlterar.setSelected(false);
           rbExcluir.setSelected(false);
           return;
        }
        rbAlterar.setSelected(false);
        btOk.setEnabled(true);
        btCancelar.setEnabled(true);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        // TODO add your handling code here:

        try {
            if (rbAlterar.isSelected()) {

                if (!clickAlterar) {
                    habilitarCampos();
                    txtCpf.setEnabled(false);
                    btSalva.setEnabled(false);
                    clickAlterar = true;
                    return;
                }
                getDadosDaTela();
                sqlite.updateCliente(cliente);
                DesabilitarCampos();
                MensagemUsuario.mensagemAviso("Dados alterado com sucesso!");
                habilitarBotaoExcluirAlterar(tipoUsuario);
                

            } else if (rbExcluir.isSelected()) {

                int opc = JOptionPane.showConfirmDialog(null, "deseja realmete excluir o cadastro", "Alerta", JOptionPane.OK_CANCEL_OPTION);
                if (opc != JOptionPane.OK_OPTION) {
                    return;
                }

                sqlite.excluirCliente(retiraMascara(txtCpf));
                limparCampos();
                DesabilitarCampos();
                txtCpf.setEnabled(true);
                txtCpf.grabFocus();
                MensagemUsuario.mensagemAviso("Dados excluidos com sucesso!");
                habilitarBotaoExcluirAlterar(tipoUsuario);
                this.testeClientePesquisar = false;

            } else {
                MensagemUsuario.mensagemAviso("Não foi selecionado Nem uma opcão!");

            }
        } catch (Exception e) {
            MensagemUsuario.mensagemErro(e.getMessage());
        }


    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:

        DesabilitarCampos();
        

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:]
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void lbLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoffMouseClicked
        // TODO add your handling code here:
        telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lbLogoffMouseClicked

    private void setDadosNaTela(Cliente cliente) {
        String c = cliente.getCpf();
        String cpf = "";
        if (c.length() <= 11) {
            cpf = "0" + c;
        }
        this.txtCpf.setText(cpf);
        this.txtNome.setText(cliente.getNone());
        this.txtEndereco.setText(cliente.getRua());
        this.txtCep.setText(cliente.getCep());
        this.txtBairro.setText(cliente.getBairro());
        this.txtCidade.setText(cliente.getCidade());
        this.txtNumero.setText(cliente.getNumero());
        this.cbUfEndereco.setSelectedItem(cliente.getUfEndreco());
        this.txtEmail.setText(cliente.getEmail());
        this.txtNomeMae.setText(cliente.getNomeMae());

    }

    private void getDadosDaTela() {

        cliente.setCpf(retiraMascara(txtCpf));
        cliente.setNone(this.txtNome.getText());
        cliente.setRua(this.txtEndereco.getText());
        cliente.setCep(retiraMascara(txtCep));
        cliente.setBairro(this.txtBairro.getText());
        cliente.setCidade(this.txtCidade.getText());
        cliente.setNumero(this.txtNumero.getText());
        cliente.setUfEndreco(this.cbUfEndereco.getSelectedItem().toString());
        cliente.setEmail(this.txtEmail.getText());
        cliente.setNomeMae(this.txtNomeMae.getText());

    }

    private String retiraMascara(JFormattedTextField campo) {
        String conteudo;
        conteudo = campo.getText().replaceAll("[\\D*]", "").trim();
        return conteudo;
    }

    private void addEstados() {

        for (EstadosBrasilEnum estados : EstadosBrasilEnum.values()) {
            cbUfEndereco.addItem("" + estados);

        }

    }

    private void habilitarCampos() {

        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCidade.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCep.setEnabled(true);
        txtNumero.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNomeMae.setEnabled(true);
        txtEndereco.setEditable(true);
        cbUfEndereco.setEnabled(true);
        btSalva.setEnabled(true);

    }

    private void DesabilitarCampos() {
        txtCpf.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCep.setEnabled(false);
        txtNumero.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNomeMae.setEnabled(false);
        txtEndereco.setEnabled(false);
        cbUfEndereco.setEnabled(false);
        btCancelar.setEnabled(false);
        btOk.setEnabled(false);
        rbAlterar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbAlterar.setSelected(false);
        rbExcluir.setSelected(false);
        btSalva.setEnabled(false);

    }

    private void limparCampos() {

        txtCpf.setText("");
        txtCep.setText("");
        txtNome.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtEmail.setText("");
        txtNomeMae.setText("");
        txtEndereco.setText("");
        rbExcluir.setEnabled(false);
        rbAlterar.setSelected(false);
        cbUfEndereco.setSelectedIndex(0);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelaPesquisa;
    private javax.swing.JButton btCancelar;
    private javax.swing.JToggleButton btOk;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalva;
    private javax.swing.JComboBox<String> cbUfEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbLogoff;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
