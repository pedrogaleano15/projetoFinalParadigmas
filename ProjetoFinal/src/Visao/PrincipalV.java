/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;

/**
 *
 * @author User
 */
public class PrincipalV extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalV
     */
    public PrincipalV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        CadastroDeContrato = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jMenuItem1.setText("Cadastrar Inqulino");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarinquilino(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cadastro Dono Imovel");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDonoImovel(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cadastro Propriedade");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroPropriedade(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        CadastroDeContrato.setText("Cadastro de Contrato");
        CadastroDeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroContrato(evt);
            }
        });
        jMenu1.add(CadastroDeContrato);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Login");

        jMenuItem4.setText("Login");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telalogin(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Atualizar");

        jMenuItem5.setText("Atualizar Inquilino");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Atualizar Dono Imovel");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Atualizar Propriedades");
        jMenu3.add(jMenuItem7);

        jMenuItem12.setText("Atualizar Contrato");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Listas");

        jMenuItem8.setText("Lista de Inquilinos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaInquilino(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Lista de Donos de Imovel");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDonoImovel(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Lista de propriedades");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadePropriedade(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Lista de contratos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadeContratos(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarinquilino(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarinquilino
        try {
        // Cria uma nova instância da tela de login
            CadastroInquilinoV telaCadInquilino = new CadastroInquilinoV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaCadInquilino);
        
        
        
        // Torna a tela visível
        telaCadInquilino.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de Cadastro de Dono do imovel " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_cadastrarinquilino

    private void cadastroDonoImovel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDonoImovel
        try {
        // Cria uma nova instância da tela de login
            cadastroDonoV telaCadDono = new cadastroDonoV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaCadDono);
        
        
        
        // Torna a tela visível
        telaCadDono.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de Cadastro de Dono do imovel " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_cadastroDonoImovel

    private void CadastroPropriedade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroPropriedade
        try {
        // Cria uma nova instância da tela de login
            TelaCadastroPropriedadeV telaCadPropriedade = new TelaCadastroPropriedadeV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaCadPropriedade);
        
        
        
        // Torna a tela visível
        telaCadPropriedade.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de Cadastro de Propriedade " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_CadastroPropriedade

    private void telalogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telalogin
        try {
        // Cria uma nova instância da tela de login
        TelalogarV telaLogin = new TelalogarV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaLogin);
        
        
        
        // Torna a tela visível
        telaLogin.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de login: " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_telalogin

    private void ListaInquilino(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaInquilino
       try {
        // Cria uma nova instância da tela de login
        ListadeInquilinoV telaListaInquilino = new ListadeInquilinoV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaListaInquilino);
        
        
        
        // Torna a tela visível
        telaListaInquilino.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de lista inquilino: " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
 
    }//GEN-LAST:event_ListaInquilino

    private void ListaDonoImovel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDonoImovel
        try {
        // Cria uma nova instância da tela de login
            ListadeDonoImovelV telalistadonoimovel = new ListadeDonoImovelV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telalistadonoimovel);
        
        
        
        // Torna a tela visível
        telalistadonoimovel.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de lista dono imovel: " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ListaDonoImovel

    private void ListadePropriedade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadePropriedade
     try {
        // Cria uma nova instância da tela de login
            ListadePropriedadeV telaPropriedade = new ListadePropriedadeV();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaPropriedade);
        
        
        
        // Torna a tela visível
        telaPropriedade.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de lista propriedade: " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }   
    }//GEN-LAST:event_ListadePropriedade

    private void ListadeContratos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadeContratos
       try {
        // Cria uma nova instância da tela de login
            ListadeContratos listacontrato = new ListadeContratos();
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(listacontrato);
        
        
        
        // Torna a tela visível
        listacontrato.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de lista Contratos: " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_ListadeContratos

    private void TelaCadastroContrato(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaCadastroContrato
 try {
        // Cria uma nova instância da tela de login
            CadastroDeContratoV telaCadContrato = new CadastroDeContratoV();
            
        
        // Adiciona a tela ao JDesktopPane
        jDesktopPane1.add(telaCadContrato);
        
        
        
        // Torna a tela visível
        telaCadContrato.setVisible(true);
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao abrir tela de Cadastro de Contrato " + e.getMessage(), 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_TelaCadastroContrato

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroDeContrato;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
