/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author byvagner
 */
import conexion.Conexion;
import javax.naming.spi.DirStateFactory;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import clases.*;


public class Secretaria extends Personal{
  
    private String velocidad_t ;
  
    public Secretaria(){
        
    }
    public String getVelocidad_t() {
        return velocidad_t;
    }

    public void setVelocidad_t(String velocidad_t) {
        this.velocidad_t = velocidad_t;
    }
    
   
  
    public Secretaria(String velocidad_t, String ci, String Nombre, String Apellido, String sexo, String Tipo, String correo, String cel_ref, String Fecha_i, String FEcha_f) {
        super(ci, Nombre, Apellido, sexo, Tipo, correo, cel_ref, Fecha_i, FEcha_f);
        this.velocidad_t = velocidad_t;
    }
      
    public void InsertarSecre() {
    // Verificar si el CI ya existe en la tabla Personal
    String verificarCI = "SELECT ci FROM Personal WHERE ci = '" + this.ci + "';";
    ResultSet resultado = c.ejecutarConsulta(verificarCI);
    try {
        if (!resultado.next()) { 
            String comando = "INSERT INTO personal(ci, Nombre, Apellido, sexo, Tipo, correo, cel_ref, Fecha_i, fecha_f) " +
                             "VALUES ('" + this.ci + "', '" + this.Nombre + "', '" + this.Apellido + "', '" + this.sexo + "', " +
                             "'" + this.Tipo + "', '" + this.correo + "', '" + this.cel_ref + "', '" + this.Fecha_i + "', '" + this.FEcha_f + "');";
            c.ejecutarComando(comando);

            String comando2 = "INSERT INTO Secretaria VALUES ('" + this.ci + "', '" + this.velocidad_t + "');";
            c.ejecutarComando(comando2);
        } else {
            System.out.println("El CI ya existe en la base de datos. No se puede insertar.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Secretaria.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public void ModificarSecre(){
        String comando = "UPDATE personal SET nombre = '"+this.Nombre+"', apellido = '"+this.Apellido+"', sexo = '"+this.sexo+"', tipo = '"+this.Tipo+"', correo = '"+this.correo+"', cel_ref = '"+this.cel_ref+"', fecha_i = '"+this.Fecha_i+"', fecha_f = '"+this.FEcha_f+"' WHERE ci = '"+this.ci+"';";
        c.ejecutarComando(comando);
        String comando2 = "UPDATE Secretaria SET velocidad_t = '"+this.velocidad_t+"' WHERE cis = '"+this.ci+"';";
        c.ejecutarComando(comando2);

    }
    
    public void EliminarSecre(){
        
        String comando2 = " delete from secretaria where cis = '"+this.ci+"'; ";
        c.ejecutarComando(comando2);
        String comando = "delete from personal where ci = '"+this.ci+"'" ;
        c.ejecutarComando(comando);
    }
    
    public void MostrarSecre(JTable tabla) {
    String[] Titulo = {"CI", "NOMBRE", "APELLIDO", "SEXO", "TIPO", "CORREO", "CELULAR", "FECHA_INICIO", "FECHA_FIN", "VELOCIDAD_T"};
    DefaultTableModel model = new DefaultTableModel(null, Titulo);
  
    String consulta ="SELECT p.ci, p.Nombre, p.Apellido, p.sexo, p.Tipo, p.correo, p.cel_ref, p.Fecha_i, p.fecha_f, s.velocidad_t " +
                  "FROM Personal p " +
                  "JOIN Secretaria s ON p.ci = s.cis " +
                  "WHERE p.tipo = 'Secretaria';";

    ResultSet resultado = c.ejecutarConsulta(consulta);
    try {
        while (resultado.next()) {
            Object[] filadatos = new Object[10]; 
            filadatos[0] = resultado.getObject("ci");
            filadatos[1] = resultado.getObject("Nombre");
            filadatos[2] = resultado.getObject("Apellido");
            filadatos[3] = resultado.getObject("sexo");
            filadatos[4] = resultado.getObject("Tipo");
            filadatos[5] = resultado.getObject("correo");
            filadatos[6] = resultado.getObject("cel_ref");
            filadatos[7] = resultado.getObject("Fecha_i");
            filadatos[8] = resultado.getObject("fecha_f");
            filadatos[9] = resultado.getObject("velocidad_t");
            model.addRow(filadatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Secretaria.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
   
    
}
