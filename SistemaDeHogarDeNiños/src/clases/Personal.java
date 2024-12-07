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

public class Personal {
     
    protected Conexion c = new Conexion();
    
    protected String  ci;
    protected String Nombre;
    protected String Apellido;
    protected String sexo;
    protected String Tipo;
    protected String correo;
    protected String cel_ref;
    protected String Fecha_i;
    protected String FEcha_f;
    
    
    public Personal(){    
    }
    // () <-- 
 
    public Personal(String ci, String Nombre, String Apellido, String sexo, String Tipo, String correo, String cel_ref, String Fecha_i, String FEcha_f) {
        this.ci = ci;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.sexo = sexo;
        this.Tipo = Tipo;
        this.correo = correo;
        this.cel_ref = cel_ref;
        this.Fecha_i = Fecha_i;
        this.FEcha_f = FEcha_f;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
            this.ci = ci;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCel_ref() {
        return cel_ref;
    }

    public void setCel_ref(String cel_ref) {
        this.cel_ref = cel_ref;
    }

    public String getFecha_i() {
        return Fecha_i;
    }

    public void setFecha_i(String Fecha_i) {
        this.Fecha_i = Fecha_i;
    }

    public String getFEcha_f() {
        return FEcha_f;
    }

    public void setFEcha_f(String FEcha_f) {
        this.FEcha_f = FEcha_f;
    }
    
    public void InsertarPersonal(){
        String comando = "insert into personal(ci, Nombre, Apellido, sexo, Tipo , correo , cel_ref , Fecha_i , fecha_f ) values ('"+this.ci+"','"+this.Nombre+"','"+this.Apellido+"','"+this.sexo+"','"+this.Tipo+"','"+this.correo+"','"+this.cel_ref+"','"+this.Fecha_i+"','"+this.FEcha_f+"');";
        c.ejecutarComando(comando);
    }
    
    public void EliminarPersonal(){
        String comando = "delete from personal where ci = '"+this.ci+"'" ;
        c.ejecutarComando(comando);
    }
        
    public void ModificarPersonal(){
        String comando =" update personal set nombre = '"+this.Nombre+"' ,apellido = '"+this.Apellido+"' ,sexo = '"+this.sexo+"' ,tipo = ' "+this.Tipo+" ',correo = '"+this.correo+"' ,	 cel_ref = '"+this.cel_ref+"' ,fecha_i = '"+this.Fecha_i+"' ,fecha_f = '"+this.FEcha_f+"'  where ci = '"+this.ci+"' ;";
        c.ejecutarComando(comando);
    }
    public void MostrarPersonal(JTable tabla){
        String[] Titulo = { "CI" ," NOMBRE "," APELLIDO"," SEXO"," TIPO","CORREO ELECTRONICO","PHONE","FECHA I","FECHA F"};
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from personal;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[9];
                filadatos[0] = resultado.getObject("ci");
                filadatos[1] = resultado.getObject("Nombre");
                filadatos[2] = resultado.getObject("Apellido");
                filadatos[3] = resultado.getObject("sexo");
                filadatos[4] = resultado.getObject("Tipo");
                filadatos[5] = resultado.getObject("correo");
                filadatos[6] = resultado.getObject("cel_ref");
                filadatos[7] = resultado.getObject("Fecha_i");
                filadatos[8] = resultado.getObject("fecha_f");
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
