/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.ui;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import empresa.entity.Clientes;
import empresa.entity.Funcionarios;
import empresa.entity.Pessoa;
import empresa.util.HibernateUtil;

/**
 *
 * @author Paty
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form galere
     */
    public Consulta() {
        initComponents();
    }
    
    private static String QUERY_BASED_ON_FIRST_NAME="from Funcionarios a where a.nome like '";
    private static String QUERY_BASED_ON_LAST_NAME="from Funcionarios a where a.sobrenome like '";
    private static String QUERY_BASED_ON_FIRST_NAME_OF_CLI="from Clientes a where a.nome like '";
    private static String QUERY_BASED_ON_LAST_NAME_OF_CLI="from Clientes a where a.sobrenome like '";
    private static String QUERY_ALL_CLIENTES="from Clientes '";
    private static String QUERY_ALL_FUNCIONARIOS="from Funcionarios '";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        voltar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        listAll = new javax.swing.JButton();
        listAllCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Painel de consultas");

        jLabel2.setText("Nome");

        jLabel3.setText("Sobrenome");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            resultTable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            resultTable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            resultTable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            resultTable.getColumnModel().getColumn(4).setHeaderValue("Title 5");
        }

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        listAll.setText("Consultar Funcionários");
        listAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllActionPerformed(evt);
            }
        });

        listAllCli.setText("Consultar Clientes");
        listAllCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(listAllCli)
                                .addGap(18, 18, 18)))
                        .addComponent(listAll)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listAll)
                            .addComponent(listAllCli)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(sair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //CONSULTAS CLIENTES
    private void runQueryBasedOnFirstName() {
    executeHQLQuery (QUERY_BASED_ON_FIRST_NAME + firstNameTextField.getText() + "%'");
    }
    
    private void runQueryBasedOnLastName() {
    executeHQLQuery(QUERY_BASED_ON_LAST_NAME + lastNameTextField.getText() + "%'");
    }
    
    private void runQueryAllFuncionarios(){
        executeHQLQuery(QUERY_ALL_FUNCIONARIOS + "%'");
    }
    
    //CONSULTAS CLIENTES
    private void runQueryBasedOnFirstNameOfCli(){
    executeHQLQueryCli (QUERY_BASED_ON_FIRST_NAME_OF_CLI + firstNameTextField.getText() + "%'");
    }
    private void runQueryBasedOnLastNameOfCli() {
    executeHQLQueryCli(QUERY_BASED_ON_LAST_NAME_OF_CLI + lastNameTextField.getText() + "%'");
    }
    
    private void runQueryAllClientes(){
        executeHQLQueryCli(QUERY_ALL_CLIENTES + "%'");
    }
    
    
    
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Principal volta = new Principal();
        volta.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void listAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllActionPerformed
        if(!firstNameTextField.getText().trim().equals("")){
            runQueryBasedOnFirstName();
        }
        else if(!lastNameTextField.getText().trim().equals("")){
            runQueryBasedOnLastName();
        }
        else
            runQueryAllFuncionarios();
    }//GEN-LAST:event_listAllActionPerformed

    private void listAllCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllCliActionPerformed
        if(!firstNameTextField.getText().trim().equals("")){
            runQueryBasedOnFirstNameOfCli();
        }
        else if(!lastNameTextField.getText().trim().equals("")){
            runQueryBasedOnLastNameOfCli();
        }
        else
            runQueryAllClientes();
    }//GEN-LAST:event_listAllCliActionPerformed
    
    //LISTAR FUNCIONÁRIOS
    private void displayResult(List resultList) {
    Vector<String> tableHeaders = new Vector<String>();
    Vector tableData = new Vector(); 
    tableHeaders.add("id");
    tableHeaders.add("nome");
    tableHeaders.add("sobrenome");
    tableHeaders.add("endereco");
    tableHeaders.add("codigo");
    tableHeaders.add("salario");

    for(Object o : resultList) {
        Funcionarios func = (Funcionarios)o;
        Vector<Object> oneRow = new Vector<Object>();
        oneRow.add(func.getId());
        oneRow.add(func.getNome());
        oneRow.add(func.getSobrenome());
        oneRow.add(func.getEndereco());
        oneRow.add(func.getCodigo());
        oneRow.add(func.getSalario());
        tableData.add(oneRow);
    }
        
   
    resultTable.setModel(new DefaultTableModel(tableData, tableHeaders));
}
    
    private void executeHQLQuery(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        List resultList = q.list();
        displayResult(resultList);
        session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
    }
    
    //LISTAR CLIENTES
    private void displayResultCli(List resultList) {
    Vector<String> tableHeaders = new Vector<String>();
    Vector tableData = new Vector(); 
    tableHeaders.add("id");
    tableHeaders.add("nome");
    tableHeaders.add("sobrenome");
    tableHeaders.add("endereco");
    tableHeaders.add("codigo");
    tableHeaders.add("salario");
    
    for(Object a : resultList) {
        Clientes cliente = (Clientes)a;
        Vector<Object> oneRow = new Vector<Object>();
        oneRow.add(cliente.getId());
        oneRow.add(cliente.getNome());
        oneRow.add(cliente.getSobrenome());
        oneRow.add(cliente.getEndereco());
        oneRow.add(cliente.getCodigo());
        tableData.add(oneRow);
   }
   
    resultTable.setModel(new DefaultTableModel(tableData, tableHeaders));
}
    
    private void executeHQLQueryCli(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        List resultList = q.list();
        displayResultCli(resultList);
        session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
    }
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton listAll;
    private javax.swing.JButton listAllCli;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton sair;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
