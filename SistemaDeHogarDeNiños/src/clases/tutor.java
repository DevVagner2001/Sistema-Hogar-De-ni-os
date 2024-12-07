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


public class tutor {
    private String   IdT;
    private String   Descripcion;
    private String   Nombre;
    private String   Apellido;
    private String   Sexo;
    private String   Cel;
    private String   Direccion;
    
    Conexion c = new Conexion();
    public tutor(){
        
    }

    public String getIdT() {
        return IdT;
    }

    public void setIdT(String IdT) {
        this.IdT = IdT;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public void guardar (){
        String consulta ="insert into tutor (IdT , Descripcion ,  Nombre , Apellido , Sexo , Cel , Direccion ) values ('"+this.IdT+"' , '"+this.Descripcion+"' , '"+this.Nombre+"' , '"+this.Apellido+"' , '"+this.Sexo+"' , ' "+this.Cel+" ' , ' "+this.Direccion+" ' );"; 
        c.ejecutarComando(consulta);
    }
    
    public void modificar  (){
        String consulta = "UPDATE Tutor SET Descripcion = '" + this.Descripcion + "', Nombre = '" + this.Nombre + "', Apellido = '" + this.Apellido + "', Sexo = '" + this.Sexo + "', Cel = '" + this.Cel + "', Direccion = '" + this.Direccion + "' WHERE IdT = '" + this.IdT + "';";
        c.ejecutarComando(consulta);
    }
    
    public void eliminar () {
        String comando =  " delete from Tutor where IdT = ' "+this.IdT +" '";
        c.ejecutarComando(comando);
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," DESCRIPCION " , "NOMBRE" , "APELLIDO" , "SEXO" ,"CEL", "DIRECCION" };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from Tutor ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[7];
                filadatos[0] = resultado.getObject("IdT");
                filadatos[1] = resultado.getObject("Descripcion");
                filadatos[2] = resultado.getObject("Nombre");
                filadatos[3] = resultado.getObject("Apellido");
                filadatos[4] = resultado.getObject("Sexo");
                filadatos[5] = resultado.getObject("Cel");
                filadatos[6] = resultado.getObject("Direccion");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(tutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
