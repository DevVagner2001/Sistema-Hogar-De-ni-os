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

public class JF_niños extends javax.swing.JFrame {
     
 
    
    /**
     * Creates new form JF_niños
     */
    
    niños n = new niños();
    
    
    public JF_niños() {
        if (JF_niños.niñoss != null) {
        JF_niños.niñoss.dispose(); // Cierra la ventana anterior
        }
        niñoss = this ;
        initComponents();
        this.setLocationRelativeTo(null);
        n.MostrarNiños(jTableniños);
        this.logear();
        System.out.println("->"+JF_principal.valiladorPrincipal);
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
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextFSexo = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jTextFEdad = new javax.swing.JTextField();
        jTextFecha_Incial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextIDTutor = new javax.swing.JTextField();
        jTextIDCIsecre = new javax.swing.JTextField();
        jButtonPersonal = new javax.swing.JButton();
        Tutor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jButtonseleccionar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFechaFinal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableniños = new javax.swing.JTable();
        jButtonatras = new javax.swing.JButton();
        jButtonseleccionarId = new javax.swing.JButton();
        jLabetxtniños = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("niños huerfano etc (ya lo ven ustedes que poner) ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, -1));

        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, -1));

        jTextFSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 40, -1));

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 40, -1));

        jTextFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFEdadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 50, -1));

        jTextFecha_Incial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFecha_IncialActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFecha_Incial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, -1));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setText("Fecha Inicial ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel8.setText("Ci Secre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel9.setText("ID Tutor ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 20));

        jTextIDTutor.setEditable(false);
        jPanel1.add(jTextIDTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 60, -1));

        jTextIDCIsecre.setEditable(false);
        jPanel1.add(jTextIDCIsecre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 60, -1));

        jButtonPersonal.setText("Buscar Secre ");
        jButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersonalActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, -1));

        Tutor.setText("Buscar Tutor");
        Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorActionPerformed(evt);
            }
        });
        jPanel1.add(Tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, -1));

        jLabel10.setText("Operaciones");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        Nuevo.setText("Nuevo ");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 80, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 80, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 80, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 110, -1));

        jButtonseleccionar.setText("SELECCIONAR");
        jButtonseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 120, -1));

        jLabel12.setText("Fecha Final ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(jTextFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, -1));

        jTableniños.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableniños);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 760, 270));

        jButtonatras.setText("atras");
        jButtonatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonatrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 90, -1));

        jButtonseleccionarId.setText("SELECCIONAR ID ");
        jButtonseleccionarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseleccionarIdActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonseleccionarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 140, -1));
        jPanel1.add(jLabetxtniños, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //operaciones .
    
    public static JF_niños niñoss ;
    
    
    public void limpiar (){
        jTextID.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextFecha_Incial.setText("");
        jTextFechaFinal.setText("");
        jTextFSexo.setText("");
        jTextFEdad.setText("");
        jTextIDCIsecre.setText("");
        jTextIDTutor.setText("");
        
    }

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_NuevoActionPerformed
    public void logear(){
        switch( JF_principal.valiladorPrincipal){
            case"1"://directora
                JF_niños.Tutor.setEnabled(false);
                JF_niños.jButtonPersonal.setEnabled(false);
                JF_niños.jButtonseleccionar.setEnabled(false);
                JF_niños.jButtonseleccionarId.setEnabled(false);
                JF_niños.Nuevo.setEnabled(false);
                JF_niños.Guardar.setEnabled(false);
                JF_niños.Eliminar.setEnabled(false);
                JF_niños.Modificar.setEnabled(false);
                break;
             case"2":
               
                 break;
             case"3":
             case"4":
                 JF_niños.Eliminar.setEnabled(false);
                 break;
            default:
                break;
        }
    }
    private void jButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersonalActionPerformed
        new JF_Secretaria().setVisible(true);
        JF_Secretaria.jButtonatras.setEnabled(false);
        JF_Secretaria.jButtonNuevo.setEnabled(false);
        JF_Secretaria.jButtonModificar.setEnabled(false);
        JF_Secretaria.jButtonguardar.setEnabled(false);
        JF_Secretaria.jButtonEliminar.setEnabled(false);
        JF_Secretaria.jButtonSeleccionar.setEnabled(false);
        JF_Secretaria.jLabelSecretaria.setText("ESCOGA UN ID PARA SELECCIONAR");
        
        
    }//GEN-LAST:event_jButtonPersonalActionPerformed

    private void jTextFecha_IncialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFecha_IncialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFecha_IncialActionPerformed

    private void jTextFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFEdadActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jTextFSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFSexoActionPerformed

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseleccionarActionPerformed
        // TODO add your handling code here:int fila =Tabla_Personal.getSelectedRow();
        int fila =jTableniños.getSelectedRow();
        if (fila > -1){
            String id = jTableniños.getValueAt(fila, 0).toString();
            String nombre = jTableniños.getValueAt(fila, 1).toString();
            String apellido = jTableniños.getValueAt(fila, 2).toString();
            String fecha_i = jTableniños.getValueAt(fila, 3).toString();
            String fecha_f = (jTableniños.getValueAt(fila, 4) != null) ? jTableniños.getValueAt(fila, 4).toString() : "";
            String sexo = jTableniños.getValueAt(fila, 5).toString();
            String edad = jTableniños.getValueAt(fila, 6).toString();
            String id_tutor = jTableniños.getValueAt(fila, 7).toString();
            String ci_secre = jTableniños.getValueAt(fila, 8).toString();  
            
            jTextID.setText(id);
            jTextNombre.setText(nombre);
            jTextApellido.setText(apellido);
            jTextFecha_Incial.setText(fecha_i);
            jTextFechaFinal.setText(fecha_f);
            jTextFSexo.setText(sexo);
            jTextFEdad.setText(edad);
            jTextIDTutor.setText(id_tutor);
            jTextIDCIsecre.setText(ci_secre);
        }  
    }//GEN-LAST:event_jButtonseleccionarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        n.setIdN(jTextID.getText());
        n.setNombre(jTextNombre.getText());
        n.setApellido(jTextApellido.getText());
        n.setFecha_i(jTextFecha_Incial.getText());
        n.setFecha_F(jTextFechaFinal.getText());
        n.setSexo(jTextFSexo.getText());
        n.setEdad(jTextFEdad.getText());
        n.setIdTutor(jTextIDTutor.getText());
        n.setCisecre(jTextIDCIsecre.getText());
        n.guardar();
        n.MostrarNiños(jTableniños);
        this.Limpiar();
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        n.setIdN(jTextID.getText());
        n.setNombre(jTextNombre.getText());
        n.setApellido(jTextApellido.getText());
        n.setFecha_i(jTextFecha_Incial.getText());
        n.setFecha_F(jTextFechaFinal.getText());
        n.setSexo(jTextFSexo.getText());
        n.setEdad(jTextFEdad.getText());
        n.setIdTutor(jTextIDTutor.getText());
        n.setCisecre(jTextIDCIsecre.getText());
        n.modificar();
        n.MostrarNiños(jTableniños);
        this.Limpiar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorActionPerformed
        // TODO add your handling code here:
        new JF_tutor().setVisible(true);     
        //poner trasparente
        JF_tutor.jButtonatras.setEnabled(false);
        JF_tutor.jButtonNuevo.setEnabled(false);
        JF_tutor.jButtonGuardar.setEnabled(false);
        JF_tutor.jButtonModifcar.setEnabled(false);
        JF_tutor.jButtonEliminar.setEnabled(false);
        JF_tutor.jButtonSeleccionar.setEnabled(false);
        JF_tutor.jLabelRTexto.setText("ESCOGA UN ID PARA SELECCIONAR");
        
        
    }//GEN-LAST:event_TutorActionPerformed

    private void jButtonatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonatrasActionPerformed
        
        new JF_principal().setVisible(true);
        JF_niños.jButtonseleccionarId.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButtonatrasActionPerformed

    private void jButtonseleccionarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseleccionarIdActionPerformed
        // TODO add your handling code here:
        int fila =jTableniños.getSelectedRow();
        if (fila > -1){
           String id = jTableniños.getValueAt(fila, 0).toString();
           if ( JF_formacion.OficialFormacion != null && JF_formacion.OficialFormacion.isVisible()) {
            JF_formacion.OficialFormacion.jTextFieldIDNIÑOS.setText(id);
            JF_niños.Tutor.setEnabled(true);
            JF_niños.jButtonPersonal.setEnabled(true);
            JF_niños.jButtonseleccionar.setEnabled(true);
            JF_niños.Nuevo.setEnabled(true);
            JF_niños.Guardar.setEnabled(true);
            JF_niños.Eliminar.setEnabled(true);
            JF_niños.Modificar.setEnabled(true);
            JF_niños.jButtonatras.setEnabled(true);
            JF_niños.jLabetxtniños.setText("");
        }
            if (JF_labor.OficialLabor != null && JF_labor.OficialLabor.isVisible()) {
            JF_labor.OficialLabor.jTextFieldIDniños.setText(id);
            JF_niños.Tutor.setEnabled(true);
            JF_niños.jButtonPersonal.setEnabled(true);
            JF_niños.Nuevo.setEnabled(true);
            JF_niños.Guardar.setEnabled(true);
            JF_niños.Eliminar.setEnabled(true);
            JF_niños.Modificar.setEnabled(true);
            JF_niños.jButtonseleccionar.setEnabled(true);
            JF_niños.jButtonatras.setEnabled(true);
            JF_niños.jLabetxtniños.setText("");  
        }
           this.dispose();
        } 
    }//GEN-LAST:event_jButtonseleccionarIdActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        n.setIdN(jTextID.getText());
        n.eliminar();
        n.MostrarNiños(jTableniños);
        this.Limpiar();
    }//GEN-LAST:event_EliminarActionPerformed
    public void Limpiar(){
        jTextID.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextFecha_Incial.setText("");
        jTextFechaFinal.setText("");
        jTextFSexo.setText("");
        jTextFEdad.setText("");
        jTextIDTutor.setText("");
        jTextIDCIsecre.setText("");
        
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
            java.util.logging.Logger.getLogger(JF_niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_niños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Eliminar;
    public static javax.swing.JButton Guardar;
    public static javax.swing.JButton Modificar;
    public static javax.swing.JButton Nuevo;
    public static javax.swing.JButton Tutor;
    public static javax.swing.JButton jButtonPersonal;
    public static javax.swing.JButton jButtonatras;
    public static javax.swing.JButton jButtonseleccionar;
    public static javax.swing.JButton jButtonseleccionarId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabetxtniños;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableniños;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextFEdad;
    private javax.swing.JTextField jTextFSexo;
    private javax.swing.JTextField jTextFechaFinal;
    private javax.swing.JTextField jTextFecha_Incial;
    private javax.swing.JTextField jTextID;
    public static javax.swing.JTextField jTextIDCIsecre;
    public static javax.swing.JTextField jTextIDTutor;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
