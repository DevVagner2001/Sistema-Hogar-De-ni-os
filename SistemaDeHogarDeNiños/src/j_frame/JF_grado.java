/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package j_frame;

/**
 *
 * @author byvagner
 */
import clases.grado ;

public class JF_grado extends javax.swing.JFrame {

    /**
     * Creates new form JF_grado
     */
    grado g = new grado();
    
    public JF_grado() {
        initComponents();
        this.setLocationRelativeTo(null);
        g.MostrarJtableTI(jTableGrado);
        this.LogearAGrado();
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGrado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonSeleccionaID = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabeltxtGradp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("grado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel2.setText("descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setText("id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 50, -1));
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 100, -1));

        jTableGrado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableGrado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 430, 190));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, 30));

        jButton2.setText("guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 154, 110, 30));

        jButton3.setText("modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 224, 110, 30));

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 294, 110, 30));

        jButton5.setText("SELECCIONAR ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 140, 30));

        jButtonSeleccionaID.setText("SELECCIONAR ID ");
        jButtonSeleccionaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionaIDActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSeleccionaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 160, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 20, 500));

        jButton7.setText("Atras");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 494, 110, 30));
        jPanel1.add(jLabeltxtGradp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        g.setIdg(jTextFieldID.getText());
        g.EliminarTI();
        g.MostrarJtableTI(jTableGrado);
        this.limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int fila =jTableGrado.getSelectedRow();
        if (fila > -1){
            String id = jTableGrado.getValueAt(fila, 0).toString();
            String Descripcion = jTableGrado.getValueAt(fila, 1).toString();
            
            jTextFieldID.setText(id);
            jTextFieldDescripcion.setText(Descripcion);
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public void limpiar(){
        jTextFieldID.setText("");
        jTextFieldDescripcion.setText("");
        
    }
    public void LogearAGrado(){
        switch(JF_principal.valiladorPrincipal){
            case"1":
                JF_grado.jButton1.setEnabled(false);
                JF_grado.jButton2.setEnabled(false);
                JF_grado.jButton3.setEnabled(false);
                JF_grado.jButtonEliminar.setEnabled(false);
                JF_grado.jButtonSeleccionaID.setEnabled(false);
                JF_grado.jButton5.setEnabled(false);   
                break;
            case"2":
                break;
            case"3":
            case"4":
                JF_grado.jButtonEliminar.setEnabled(false);
                break;
            default:
                break;               
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        g.setIdg(jTextFieldID.getText());
        g.setDescripcion(jTextFieldDescripcion.getText());
        g.InsertarTI();
        g.MostrarJtableTI(jTableGrado);
        this.limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        g.setIdg(jTextFieldID.getText());
        g.setDescripcion(jTextFieldDescripcion.getText());
        g.ModificarTI();
        g.MostrarJtableTI(jTableGrado);
        this.limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonSeleccionaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionaIDActionPerformed
        // TODO add your handling code here:
        int fila =jTableGrado.getSelectedRow();
        if (fila > -1){
           String id = jTableGrado.getValueAt(fila, 0).toString();
           if (JF_formacion.OficialFormacion != null &&JF_formacion.OficialFormacion .isVisible()) {
           JF_formacion.OficialFormacion.jTextFieldIDGRADO.setText(id);
           JF_grado.jButton1.setEnabled(true);
           JF_grado.jButton2.setEnabled(true);
           JF_grado.jButton3.setEnabled(true);
           JF_grado.jButtonEliminar.setEnabled(true);
           JF_grado.jButton5.setEnabled(true);
           JF_grado.jButton7.setEnabled(true);
           JF_grado.jLabeltxtGradp.setText("");
        }
           this.dispose();
        } 
        
    }//GEN-LAST:event_jButtonSeleccionaIDActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new JF_principal().setVisible(true);
        JF_grado.jButtonSeleccionaID.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_grado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonSeleccionaID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabeltxtGradp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableGrado;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
