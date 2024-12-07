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

public class area {
    private String idAr;
    private String Descripcion ;
    
    Conexion c = new Conexion();
    
    public area (){
        
    }

    public String getIdAr() {
        return idAr;
    }

    public void setIdAr(String idAr) {
        this.idAr = idAr;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Conexion getC() {
        return c;
    }

    public void setC(Conexion c) {
        this.c = c;
    }
    
    public void InsertarArea(){
        String operacion = "insert into area(idAr , Descripcion ) values ( '"+this.idAr+"' , '" +this.Descripcion+"')";
        c.ejecutarComando(operacion) ;
    }
    
    public void EliminarArea(){
        String operacion = "delete from area where  idAr = '"+this.idAr+"'  ";
        c.ejecutarComando(operacion) ;
    }
    
    public void ModificarArea (){
        String o = " update area set Descripcion = '"+this.Descripcion+"' where idAr = '"+this.idAr+"' ";
        c.ejecutarComando(o) ;
    }
    
    public void MostrarJtableArea (JTable tabla ){
        String[] Titulo = { "IDA" ," DESCRIPCION " };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from area ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[2];
                filadatos[0] = resultado.getObject("idAr");
                filadatos[1] = resultado.getObject("Descripcion");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(area.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
