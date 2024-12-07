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

public class T_ingreso {
    
    private String   inTi ;
    private String   Descripcion ;
    
    Conexion c = new Conexion();
    
    public T_ingreso(){
        
    }

    public T_ingreso(String inTi, String Descripcion) {
        this.inTi = inTi;
        this.Descripcion = Descripcion;
    }
    
    //get y set 

    public String getInTi() {
        return inTi;
    }

    public void setInTi(String inTi) {
        this.inTi = inTi;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    // operacion de Guardar 
    
    public void InsertarTI(){
        String operacion = "insert into Tipo_i(idTI , Descripcion ) values ( '"+this.inTi+"' , '" +this.Descripcion+"')";
        c.ejecutarComando(operacion) ;
    }
    
    public void EliminarTI (){
        String operacion = "delete from Tipo_i where  idTI = '"+this.inTi+"'  ";
        c.ejecutarComando(operacion) ;
    }
    
    public void ModificarTI (){
        String o = " update Tipo_I set Descripcion = '"+this.Descripcion+"' where idTI = '"+this.inTi+"' ";
        c.ejecutarComando(o) ;
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," DESCRIPCION " };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from Tipo_I ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[2];
                filadatos[0] = resultado.getObject("idTI");
                filadatos[1] = resultado.getObject("Descripcion");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(T_ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
