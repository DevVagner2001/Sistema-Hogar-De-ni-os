/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package j_frame;

/**
 *
 * @author byvagner
 */
import clases.*;

public class JF_tutor extends javax.swing.JFrame {

    /**
     * Creates new form JF_tutor
     */
   tutor t = new tutor();

   
    public JF_tutor() {
        initComponents();       
        this.setLocationRelativeTo(null);
        t.MostrarJtableTI(jTabletutor);
        this.logear();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabletutor = new javax.swing.JTable();
        jButtonSeleccionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldNomvbre = new javax.swing.JTextField();
        jTextFieldapellido = new javax.swing.JTextField();
        jTextFieldsexo = new javax.swing.JTextField();
        jTextFieldcelular = new javax.swing.JTextField();
        jTextFieldiereccion = new javax.swing.JTextField();
        jTextFieldIDDD = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModifcar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSeleID = new javax.swing.JButton();
        jButtonatras = new javax.swing.JButton();
        jLabelRTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("tutor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jTabletutor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabletutor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 690, 140));

        jButtonSeleccionar.setText("SELECCIONAR ");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 140, -1));

        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 505, 880, 10));

        jLabel2.setText("descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setText("nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setText("sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setText("cel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setText("direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel8.setText("id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));
        jPanel1.add(jTextFieldNomvbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, -1));
        jPanel1.add(jTextFieldapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, -1));
        jPanel1.add(jTextFieldsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 40, -1));
        jPanel1.add(jTextFieldcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, -1));
        jPanel1.add(jTextFieldiereccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 70, -1));
        jPanel1.add(jTextFieldIDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, -1));

        jButtonNuevo.setText("nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, -1));

        jButtonModifcar.setText("modificar");
        jButtonModifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifcarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModifcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, -1));

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, -1));

        jButtonGuardar.setText("guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, -1));

        jButtonSeleID.setText("SELECCIONAR ID ");
        jButtonSeleID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleIDActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSeleID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 160, -1));

        jButtonatras.setText("atras");
        jButtonatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonatrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 110, -1));
        jPanel1.add(jLabelRTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 290, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar(){
        jTextFieldIDDD.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldNomvbre.setText("");
        jTextFieldapellido.setText("");
        jTextFieldsexo.setText("");
        jTextFieldcelular.setText("");
        jTextFieldiereccion.setText("");
    }
    public void logear(){
        switch( JF_principal.valiladorPrincipal){
            case"1":
                JF_tutor.jButtonNuevo.setEnabled(false);
                JF_tutor.jButtonGuardar.setEnabled(false);
                JF_tutor.jButtonModifcar.setEnabled(false);
                JF_tutor.jButtonEliminar.setEnabled(false);
                JF_tutor.jButtonSeleccionar.setEnabled(false);
                JF_tutor.jButtonSeleID.setEnabled(false);     
                break;
            case"2":
                 break;
            case"3":
            case"4":
                JF_tutor.jButtonEliminar.setEnabled(false);
                 break;
            default:
                break;
        }
    }
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
       this.limpiar();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        t.setIdT(jTextFieldIDDD.getText());
        t.setDescripcion(jTextFieldDescripcion.getText());
        t.setNombre(jTextFieldNomvbre.getText());
        t.setApellido(jTextFieldapellido.getText());
        t.setSexo(jTextFieldsexo.getText());
        t.setCel(jTextFieldcelular.getText());
        t.setDireccion(jTextFieldiereccion.getText());
        t.guardar();
        t.MostrarJtableTI(jTabletutor);
        this.limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifcarActionPerformed
        // TODO add your handling code here:
        t.setIdT(jTextFieldIDDD.getText());
        t.setDescripcion(jTextFieldDescripcion.getText());
        t.setNombre(jTextFieldNomvbre.getText());
        t.setApellido(jTextFieldapellido.getText());
        t.setSexo(jTextFieldsexo.getText());
        t.setCel(jTextFieldcelular.getText());
        t.setDireccion(jTextFieldiereccion.getText());
        t.modificar();
        t.MostrarJtableTI(jTabletutor);
        this.limpiar();
    }//GEN-LAST:event_jButtonModifcarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        t.setIdT(jTextFieldIDDD.getText());
        t.eliminar();
        t.MostrarJtableTI(jTabletutor);
        this.limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        int fila =jTabletutor.getSelectedRow();
        if (fila > -1){
            String uno = jTabletutor.getValueAt(fila, 0).toString();
            String dos = jTabletutor.getValueAt(fila, 1).toString();
            String tres = jTabletutor.getValueAt(fila, 2).toString();
            String cuatro = jTabletutor.getValueAt(fila, 3).toString();
            String cinco = jTabletutor.getValueAt(fila, 4).toString();
            String seis = jTabletutor.getValueAt(fila, 5).toString();
            String siete = jTabletutor.getValueAt(fila, 6).toString();
            
            jTextFieldIDDD.setText(uno);
            jTextFieldDescripcion.setText(dos);
            jTextFieldNomvbre.setText(tres);
            jTextFieldapellido.setText(cuatro);
            jTextFieldsexo.setText(cinco);
            jTextFieldcelular.setText(seis);
            jTextFieldiereccion.setText(siete);
         
        }
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButtonSeleIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleIDActionPerformed
       
        int fila =jTabletutor.getSelectedRow();
        if (fila > -1){
            String id = jTabletutor.getValueAt(fila, 0).toString();
            if(JF_niños.niñoss!=null && JF_niños.niñoss.isVisible()){
                JF_niños.niñoss.jTextIDTutor.setText(id);   
                JF_tutor.jButtonatras.setEnabled(true);      
                JF_tutor.jButtonNuevo.setEnabled(true);
                JF_tutor.jButtonGuardar.setEnabled(true);
                JF_tutor.jButtonModifcar.setEnabled(true);
                JF_tutor.jButtonEliminar.setEnabled(true);
                JF_tutor.jButtonSeleccionar.setEnabled(true);
                JF_tutor.jLabelRTexto.setText("");
            }
        }
        this.dispose();
    }//GEN-LAST:event_jButtonSeleIDActionPerformed

    private void jButtonatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonatrasActionPerformed
        // TODO add your handling code here:
        new JF_principal().setVisible(true);
        JF_tutor.jButtonSeleID.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButtonatrasActionPerformed

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
            java.util.logging.Logger.getLogger(JF_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_tutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonGuardar;
    public static javax.swing.JButton jButtonModifcar;
    public static javax.swing.JButton jButtonNuevo;
    public static javax.swing.JButton jButtonSeleID;
    public static javax.swing.JButton jButtonSeleccionar;
    public static javax.swing.JButton jButtonatras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelRTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabletutor;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldIDDD;
    private javax.swing.JTextField jTextFieldNomvbre;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcelular;
    private javax.swing.JTextField jTextFieldiereccion;
    private javax.swing.JTextField jTextFieldsexo;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
