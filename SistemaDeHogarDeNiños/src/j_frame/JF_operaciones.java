/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package j_frame;

/**
 *
 * @author byvagner
 */
import clases.Operaciones;

public class JF_operaciones extends javax.swing.JFrame {

    /**
     * Creates new form JF_operaciones
     */
    Operaciones o = new Operaciones();
    
    public JF_operaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jTextFieldIDUE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableoperaciones = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButtonMostrar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldtutor = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButtonmostrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldfechainicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2FECHAINICIAL = new javax.swing.JTextField();
        jTextFieldfechafinal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("operaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setText("buscar todos los niños que estudian en cierta unidad educativa  !");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextFieldIDUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDUEActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldIDUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, -1));

        jButton1.setText("ID UE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, -1));

        jTableoperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableoperaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 230));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 980, 20));

        jButton2.setText("atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 70, -1));

        jButtonMostrar1.setText("MOSTRAR");
        jButtonMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, -1));

        jLabel3.setText("mostrar Niños por medio de tutores ! ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(jTextFieldtutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        jButton3.setText("ID Tutor ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, -1));

        jButtonmostrar.setText("MOSTRAR");
        jButtonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, -1));

        jLabel4.setText("Mostrar Ingresos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        jPanel1.add(jTextFieldfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, -1));

        jLabel5.setText("mostrar labores por fehca inicial ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));
        jPanel1.add(jTextField2FECHAINICIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 90, -1));
        jPanel1.add(jTextFieldfechafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 90, -1));

        jLabel6.setText("AÑO - MES - DIA ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jButton4.setText("MOSTRAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 110, -1));

        jLabel7.setText("AÑO - MES - DIA ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jButton5.setText("MOSTRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new JF_UE().setVisible(true);
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new JF_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldIDUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDUEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDUEActionPerformed

    private void jButtonMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrar1ActionPerformed
        // TODO add your handling code here:
        o.setPrincipal(jTextFieldIDUE.getText());
        o.mostrarJtableOperacion1(jTableoperaciones);
        jTextFieldIDUE.setText("");
        
        
    }//GEN-LAST:event_jButtonMostrar1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if ( JF_principal.tutor == null){
            JF_principal.tutor = new JF_tutor();
        }
        JF_principal.tutor.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmostrarActionPerformed
        // TODO add your handling code here:
        o.setPrincipal(jTextFieldtutor.getText());
        o.mostrarJtableOperacion2(jTableoperaciones);
        jTextFieldtutor.setText("");
        
    }//GEN-LAST:event_jButtonmostrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        o.setPrincipal(jTextFieldfechainicio.getText());
        o.setPrincipal2(jTextFieldfechafinal.getText());
        o.mostrarJtableIngresosPorRangoFechas(jTableoperaciones);
        jTextFieldfechainicio.setText("");
        jTextFieldfechafinal.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        o.setPrincipal(jTextField2FECHAINICIAL.getText());
        o.mostrarJtableNiñosConLabor(jTableoperaciones);
        jTextField2FECHAINICIAL.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonMostrar1;
    private javax.swing.JButton jButtonmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableoperaciones;
    private javax.swing.JTextField jTextField2FECHAINICIAL;
    public static javax.swing.JTextField jTextFieldIDUE;
    private javax.swing.JTextField jTextFieldfechafinal;
    private javax.swing.JTextField jTextFieldfechainicio;
    public static javax.swing.JTextField jTextFieldtutor;
    // End of variables declaration//GEN-END:variables
}
