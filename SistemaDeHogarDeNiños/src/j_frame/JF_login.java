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
import javax.swing.JOptionPane;
import conexion.Conexion;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;

public class JF_login extends javax.swing.JFrame {

    /**
     * Creates new form JF_usuario
     */
    usuario u = new usuario();
    
    public JF_login() {
        initComponents();
        customizeButton();
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
        txtuser = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 270, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 270, -1));

        Login.setText("ingresar");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("USER");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("PASSSWORD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(0, 207, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 400, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String user = txtuser.getText();

        String password = String.valueOf(txtpassword.getPassword());

        String resul = u.validarUser(user, password);
        // "" = "" ;
        if (resul != null) { //  ""
            JF_principal.valiladorPrincipal = resul ;
            new JF_principal().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error");
            // Opcional: Limpiar el campo de contraseña
            txtpassword.setText("");
            txtuser.setText("");
        }

    
        
    }//GEN-LAST:event_LoginActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed
    private void customizeButton() {
Login.setPreferredSize(new Dimension(200, 50));
Login.setFocusPainted(false);
Login.setBorderPainted(false);
Login.setContentAreaFilled(false);
Login.setOpaque(true); // Fondo no transparente

// Colores más fuertes
Color normalColor = new Color(100, 149, 237); // Azul claro fuerte
Color hoverColor = new Color(70, 130, 180); // Azul intermedio
Color pressColor = new Color(30, 60, 120); // Azul oscuro

// Establece el color inicial del fondo
Login.setBackground(normalColor);
Login.setForeground(Color.WHITE); // Texto en blanco
Login.setFont(new Font("Arial", Font.BOLD, 16));

// Bordes redondeados usando 'setBorder' directamente
Login.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2)); // Borde negro

// Agregar efectos de cambio de color y sombra
Login.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        // Efecto de cambio de color suave
        Login.setBackground(hoverColor); // Color cuando el cursor entra
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor

        // Sombra dinámica
        Login.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50), 3)); // Cambia el borde a más grueso
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Login.setBackground(normalColor); // Vuelve al color normal
        Login.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2)); // Vuelve al borde normal
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
        Login.setBackground(pressColor); // Color cuando se presiona
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        Login.setBackground(hoverColor); // Vuelve al color de hover después de soltar
    }
});

    
    }
    
    
    
    
    
    public static void MostrarLable(){
       
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
            java.util.logging.Logger.getLogger(JF_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titulo;
    public static javax.swing.JPasswordField txtpassword;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
