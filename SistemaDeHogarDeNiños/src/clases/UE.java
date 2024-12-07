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

public class UE {
    
    private String idUE;
    private String Nombre;
    private String Direccion;
    private String cel_ref;
    
    public UE (){
        
    }
    
   Conexion c = new Conexion();
   
    public String getIdUE() {
        return idUE;
    }

    public void setIdUE(String idUE) {
        this.idUE = idUE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCel_ref() {
        return cel_ref;
    }

    public void setCel_ref(String cel_ref) {
        this.cel_ref = cel_ref;
    }
    
    public void Insertar (){
        String operacion = "  insert into UE values (' "+this.idUE+" ',' "+this.Nombre+" ',' "+this.Direccion+" ','  "+this.cel_ref+" ');  ";
        c.ejecutarComando(operacion) ;
    }
    
    public void eliminar (){
        String operacion = "delete from UE where  idUE = '"+this.idUE+"'  ";
        c.ejecutarComando(operacion) ;
    }
    
    public void Modificar (){
         String o = " update UE set Nombre = '"+this.Nombre+"' , Direccion = '"+this.Direccion+"' , cel_ref = '"+this.cel_ref+"' where idUE = '"+this.idUE+"' ";
         c.ejecutarComando(o) ;
    }
    
    public void MostrarJt(JTable tabla){
        String[] Titulo = { "ID" ," NOMBRE " , "DIRECCION " , "CEL" };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from UE ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[4];
                filadatos[0] = resultado.getObject("idUE");
                filadatos[1] = resultado.getObject("Nombre");
                filadatos[2] = resultado.getObject("Direccion");
                filadatos[3] = resultado.getObject("cel_ref");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(UE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
