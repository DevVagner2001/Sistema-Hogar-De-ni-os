/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package j_frame;

/**
 *
 * @author byvagner
 */
import clases.area;

public class JF_area extends javax.swing.JFrame {

    /**
     * Creates new form JF_area
     */
    area a = new area();
    
    public JF_area() {
        initComponents();
        this.setLocationRelativeTo(null);
        a.MostrarJtableArea(jTablearea);
        this.LogearArea();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablearea = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jButtonuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonmodificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSeleccionar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabeltxtarea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablearea.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablearea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 350, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 740, -1));

        jLabel1.setText("area");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel2.setText("id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, -1));
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 40, -1));

        jButtonuevo.setText("Nuevo");
        jButtonuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        jButtonmodificar.setText("Modificar");
        jButtonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 90, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 90, -1));

        jButtonSeleccionar.setText("SELECCIONAR");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 130, -1));

        jButton1.setText("SELECCIONAR ID ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 160, -1));

        jButton2.setText("atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 80, -1));
        jPanel1.add(jLabeltxtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void limpiar (){
       jTextFieldID.setText("");
       jTextFieldDescripcion.setText("");
   }
   public void LogearArea(){
        switch(JF_principal.valiladorPrincipal){
            case"1":
                break;
            case"2":
                break;
            case"3":
            case"4":
                JF_area.jButtonEliminar.setEnabled(false);
                break;
            default:
                break;               
        }
    }
    private void jButtonuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuevoActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jButtonuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        a.setIdAr(jTextFieldID.getText());
        a.setDescripcion(jTextFieldDescripcion.getText());
        a.InsertarArea();
        a.MostrarJtableArea(jTablearea);
        this.limpiar();
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodificarActionPerformed
        // TODO add your handling code here:
         a.setIdAr(jTextFieldID.getText());
        a.setDescripcion(jTextFieldDescripcion.getText());
        a.ModificarArea();
        a.MostrarJtableArea(jTablearea);
        this.limpiar();
    }//GEN-LAST:event_jButtonmodificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        a.setIdAr(jTextFieldID.getText());
        a.EliminarArea();
        a.MostrarJtableArea(jTablearea);
        this.limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        int fila =jTablearea.getSelectedRow();
        if (fila > -1){
            String idAr = jTablearea.getValueAt(fila, 0).toString();
            String Descripcion = jTablearea.getValueAt(fila, 1).toString();
            
            jTextFieldID.setText(idAr);
            jTextFieldDescripcion.setText(Descripcion);
            
        }
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          
        int fila =jTablearea.getSelectedRow();
        if (fila > -1){
           String id = jTablearea.getValueAt(fila, 0).toString();
           if (JF_labor.OficialLabor!=null&&JF_labor.OficialLabor.isVisible()) {
            JF_labor.OficialLabor.jTextFieldIDarea.setText(id);
            JF_area.jButtonuevo.setEnabled(true);
            JF_area.jButtonGuardar.setEnabled(true);
            JF_area.jButtonmodificar.setEnabled(true);
            JF_area.jButtonEliminar.setEnabled(true);
            JF_area.jButtonSeleccionar.setEnabled(true);
            JF_area.jButton2.setEnabled(true);
            JF_area.jButtonuevo.setEnabled(true);
            JF_area.jLabeltxtarea.setText("");
            
        }
           this.dispose();
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new JF_principal().setVisible(true);
        JF_area.jButton1.setEnabled(true);
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
            java.util.logging.Logger.getLogger(JF_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonGuardar;
    public static javax.swing.JButton jButtonSeleccionar;
    public static javax.swing.JButton jButtonmodificar;
    public static javax.swing.JButton jButtonuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabeltxtarea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablearea;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
