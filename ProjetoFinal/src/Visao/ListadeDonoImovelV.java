/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Visao;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controle.DonosC;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ListadeDonoImovelV extends javax.swing.JInternalFrame {

    private javax.swing.JTable JListaDonoImovel;
    private DefaultTableModel ListaDonoImovel;

    public ListadeDonoImovelV() {
        initComponents();
        
        ListaDonoImovel = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "ID", "Nome Completo", "CPF/CNPJ", "RG/IE", 
                "Telefone", "Email", "Endereço", "Banco", 
                "Agência", "Conta", "Tipo Conta", "Data Cadastro", "Ativo"
            }
        ) {
            Class[] types = new Class[]{
                Integer.class, String.class, String.class, 
                String.class, String.class, String.class, 
                String.class, String.class, String.class, 
                String.class, String.class, String.class, 
                Boolean.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };

        JListaDonoImovel = new javax.swing.JTable(ListaDonoImovel);
        jScrollPane1.setViewportView(JListaDonoImovel);
        
        carregarDados();
    }

    private void carregarDados() {
        DonosC dados = new DonosC();
        ResultSet listaDonos = null;
        
        try {
            listaDonos = dados.consultarTodosDonos();
            int j = 0;
            
            while(listaDonos.next()) {
                ListaDonoImovel.setRowCount(j+1);
                
                for(int i = 1; i <= 13; i++) {
                    if(i == 13) { // Coluna "Ativo" (booleana)
                        JListaDonoImovel.setValueAt(listaDonos.getBoolean(i), j, i-1);
                    }
                    else if(i == 1) { // Coluna "ID" (inteiro)
                        JListaDonoImovel.setValueAt(listaDonos.getInt(i), j, i-1);
                    }
                    else { // Demais colunas (strings)
                        JListaDonoImovel.setValueAt(listaDonos.getString(i), j, i-1);
                    }
                }
                j++;
            }
        } catch(Exception er) {
            er.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar donos: " + er.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            if(listaDonos != null) {
                try {
                    listaDonos.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
