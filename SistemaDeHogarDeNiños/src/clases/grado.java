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


public class grado {
    Conexion c = new Conexion();
    
    private String idg ;
    private String Descripcion ;
    
    public grado (){
        
    }

    public String getIdg() {
        return idg;
    }

    public void setIdg(String idg) {
        this.idg = idg;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public void InsertarTI(){
        String operacion = "insert into Grado(Idg , Descripcion ) values ( '"+this.idg+"' , '" +this.Descripcion+"')";
        c.ejecutarComando(operacion) ;
    }
    
    public void EliminarTI (){
        String operacion = "delete from Grado where  Idg = '"+this.idg+"'  ";
        c.ejecutarComando(operacion) ;
    }
    
    public void ModificarTI (){
        String o = " update Grado set Descripcion = '"+this.Descripcion+"' where Idg = '"+this.idg+"' ";
        c.ejecutarComando(o) ;
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," DESCRIPCION " };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from Grado ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[2];
                filadatos[0] = resultado.getObject("Idg");
                filadatos[1] = resultado.getObject("Descripcion");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(grado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
