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

public class niños {
    private String IdN;
    private String Nombre;
    private String Apellido;
    private String Fecha_i;
    private String Fecha_F;
    private String sexo;
    private String edad;
    private String idTutor;
    private String cisecre;
    
    Conexion c = new Conexion();

    public String getIdN() {
        return IdN;
    }

    public void setIdN(String IdN) {
        this.IdN = IdN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha_i() {
        return Fecha_i;
    }

    public void setFecha_i(String Fecha_i) {
        this.Fecha_i = Fecha_i;
    }

    public String getFecha_F() {
        return Fecha_F;
    }

    public void setFecha_F(String Fecha_F) {
        this.Fecha_F = Fecha_F;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(String idTutor) {
        this.idTutor = idTutor;
    }

    public String getCisecre() {
        return cisecre;
    }

    public void setCisecre(String cisecre) {
        this.cisecre = cisecre;
    }

    

    public Conexion getC() {
        return c;
    }

    public void setC(Conexion c) {
        this.c = c;
    }
    
    
    public niños(){
        
    }
  
    public void guardar (){
        String consulta = " insert into niños values('"+this.IdN+"' , '"+this.Nombre+"' , '"+this.Apellido+"' , '"+this.Fecha_i+"' , '"+this.Fecha_F+"' , '"+this.sexo+"' , '"+this.edad+"' , '"+this.idTutor+"' , '"+this.cisecre+"'  ); ";
        c.ejecutarComando(consulta);
    }
    
    public void modificar (){
        String consulta = "update niños set Nombre = '"+this.Nombre+"' , Apellido = '"+this.Apellido+"' , Fecha_i = '"+this.Fecha_i+"' , Fecha_F = '"+this.Fecha_F+"' , sexo = '"+this.sexo+"' , edad = '"+this.edad+"' , idTutor = '"+this.idTutor+"' , ciSecre = '"+this.cisecre+"' where idN = '"+this.IdN+"' ; ";
        c.ejecutarComando(consulta);
    }
    
    public void eliminar (){
        String consulta = "delete from niños where idN = '"+this.IdN+"' ;";
        c.ejecutarComando(consulta);
    }
    
    public void MostrarNiños(JTable tabla) {
    String[] Titulo = { "ID", "NOMBRE", "APELLIDO", "F. INGRESO", "F. SALIDA", "SEXO", "EDAD", "ID T.", "Ci Secre." };
    DefaultTableModel model = new DefaultTableModel(null, Titulo);

    String consulta = "SELECT * FROM niños;";
    ResultSet resultado = c.ejecutarConsulta(consulta);
    
    try {
        while (resultado.next()) {
            Object[] filadatos = new Object[9];
            filadatos[0] = resultado.getObject("idN");
            filadatos[1] = resultado.getObject("Nombre");
            filadatos[2] = resultado.getObject("Apellido");
            filadatos[3] = resultado.getObject("Fecha_i");
            filadatos[4] = resultado.getObject("Fecha_F");
            filadatos[5] = resultado.getObject("sexo");
            filadatos[6] = resultado.getObject("edad");
            filadatos[7] = resultado.getObject("idTutor");
            filadatos[8] = resultado.getObject("ciSecre");
            model.addRow(filadatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(niños.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
}
