/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package j_frame;

/**
 *
 * @author byvagner
 */
import clases.administrador;

public class JF_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Jf_administrador
     */
    administrador a = new administrador();
    
    public JF_Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        a.mostraraADM(jTablesadm);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNOMBREd = new javax.swing.JTextField();
        jTextFieldAPELLIDOd = new javax.swing.JTextField();
        jTextFieldSEXOd = new javax.swing.JTextField();
        jTextFieldTIPOd = new javax.swing.JTextField();
        jTextFieldCORREOd = new javax.swing.JTextField();
        jTextFieldCELULARd = new javax.swing.JTextField();
        jTextFieldFECHA_Id = new javax.swing.JTextField();
        jTextFieldFECHA_Fd = new javax.swing.JTextField();
        jTextFielCId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablesadm = new javax.swing.JTable();
        jButtonNuevod = new javax.swing.JButton();
        jButtonguardard = new javax.swing.JButton();
        jButtonModificard = new javax.swing.JButton();
        jButtonEliminard = new javax.swing.JButton();
        jButtonSeleccionar = new javax.swing.JButton();
        jButtonSeleccionarId = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 80, -1));

        jLabel3.setText("APELLIDO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setText("SEXO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel5.setText("CI");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel6.setText("TIPO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel7.setText("CORREO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel8.setText("CELULAR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel9.setText("FEHCA INICO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel10.setText("FECHA FINAL");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel11.setText("NOMBRE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        jPanel2.add(jTextFieldNOMBREd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, -1));
        jPanel2.add(jTextFieldAPELLIDOd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, -1));
        jPanel2.add(jTextFieldSEXOd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, -1));

        jTextFieldTIPOd.setEditable(false);
        jTextFieldTIPOd.setText("Administrador");
        jPanel2.add(jTextFieldTIPOd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));
        jPanel2.add(jTextFieldCORREOd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, -1));
        jPanel2.add(jTextFieldCELULARd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 190, -1));
        jPanel2.add(jTextFieldFECHA_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 170, -1));
        jPanel2.add(jTextFieldFECHA_Fd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, -1));
        jPanel2.add(jTextFielCId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 220, -1));

        jTablesadm.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablesadm);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 940, 100));

        jButtonNuevod.setText("nuevo");
        jButtonNuevod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevodActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNuevod, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 70, -1));

        jButtonguardard.setText("guardar");
        jButtonguardard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguardardActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonguardard, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 70, -1));

        jButtonModificard.setText("modificar");
        jButtonModificard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificardActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonModificard, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 80, -1));

        jButtonEliminard.setText("eliminar");
        jButtonEliminard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminardActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminard, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 90, -1));

        jButtonSeleccionar.setText("seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 90, -1));

        jButtonSeleccionarId.setText("Seleccionar ID ");
        jPanel2.add(jButtonSeleccionarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 110, -1));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar(){
            jTextFielCId.setText("");
            jTextFieldNOMBREd.setText("");
            jTextFieldAPELLIDOd.setText("");
            jTextFieldSEXOd.setText("");
            jTextFieldTIPOd.setText("Administrador");
            jTextFieldCORREOd.setText("");
            jTextFieldCELULARd.setText("");
            jTextFieldFECHA_Id.setText("");
            jTextFieldFECHA_Fd.setText("");
    }
    private void jButtonNuevodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevodActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jButtonNuevodActionPerformed

    private void jButtonguardardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguardardActionPerformed
        a.setCi(jTextFielCId.getText());
        a.setNombre(jTextFieldNOMBREd.getText());
        a.setApellido(jTextFieldAPELLIDOd.getText());
        a.setSexo(jTextFieldSEXOd.getText());
        a.setTipo(jTextFieldTIPOd.getText());
        a.setCorreo(jTextFieldCORREOd.getText());
        a.setCel_ref(jTextFieldCELULARd.getText());
        a.setFecha_i(jTextFieldFECHA_Id.getText());
        a.setFEcha_f(jTextFieldFECHA_Fd.getText());
        a.InsertarADM();
        a.mostraraADM(jTablesadm);
        this.limpiar();
    }//GEN-LAST:event_jButtonguardardActionPerformed

    private void jButtonModificardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificardActionPerformed
        a.setCi(jTextFielCId.getText());
        a.setNombre(jTextFieldNOMBREd.getText());
        a.setApellido(jTextFieldAPELLIDOd.getText());
        a.setSexo(jTextFieldSEXOd.getText());
        a.setTipo(jTextFieldTIPOd.getText());
        a.setCorreo(jTextFieldCORREOd.getText());
        a.setCel_ref(jTextFieldCELULARd.getText());
        a.setFecha_i(jTextFieldFECHA_Id.getText());
        a.setFEcha_f(jTextFieldFECHA_Fd.getText());
        a.modificaradm();
        a.mostraraADM(jTablesadm);
        this.limpiar();
    }//GEN-LAST:event_jButtonModificardActionPerformed

    private void jButtonEliminardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminardActionPerformed
        // TODO add your handling code here:
        a.setCi(jTextFielCId.getText());
        a.EliminarADM();
        a.mostraraADM(jTablesadm);
        this.limpiar();
    }//GEN-LAST:event_jButtonEliminardActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        int fila = jTablesadm.getSelectedRow();
        if (fila > -1){
            String ci =jTablesadm.getValueAt(fila, 0).toString();
            String Nombre = jTablesadm.getValueAt(fila, 1).toString();
            String Apellido = jTablesadm.getValueAt(fila, 2).toString();
            String sexo = jTablesadm.getValueAt(fila, 3).toString();
            String Tipo = jTablesadm.getValueAt(fila, 4).toString();
            String correo = jTablesadm.getValueAt(fila, 5).toString();
            String cel_ref = jTablesadm.getValueAt(fila, 6).toString();
            String Fecha_i = jTablesadm.getValueAt(fila, 7).toString();
            String fecha_f = jTablesadm.getValueAt(fila, 8) != null ? jTablesadm.getValueAt(fila, 8).toString() : "";

            jTextFielCId.setText(ci);
            jTextFieldNOMBREd.setText(Nombre);
            jTextFieldAPELLIDOd.setText(Apellido);
            jTextFieldSEXOd.setText(sexo);
            jTextFieldTIPOd.setText(Tipo);
            jTextFieldCORREOd.setText(correo);
            jTextFieldCELULARd.setText(cel_ref);
            jTextFieldFECHA_Id.setText(Fecha_i);
            jTextFieldFECHA_Fd.setText(fecha_f);

        }
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new JF_PrincipalPersonal().setVisible(true);
        JF_Administrador.jButtonSeleccionarId.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEliminard;
    private javax.swing.JButton jButtonModificard;
    private javax.swing.JButton jButtonNuevod;
    private javax.swing.JButton jButtonSeleccionar;
    public static javax.swing.JButton jButtonSeleccionarId;
    private javax.swing.JButton jButtonguardard;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablesadm;
    private javax.swing.JTextField jTextFielCId;
    private javax.swing.JTextField jTextFieldAPELLIDOd;
    private javax.swing.JTextField jTextFieldCELULARd;
    private javax.swing.JTextField jTextFieldCORREOd;
    private javax.swing.JTextField jTextFieldFECHA_Fd;
    private javax.swing.JTextField jTextFieldFECHA_Id;
    private javax.swing.JTextField jTextFieldNOMBREd;
    private javax.swing.JTextField jTextFieldSEXOd;
    private javax.swing.JTextField jTextFieldTIPOd;
    // End of variables declaration//GEN-END:variables
}
