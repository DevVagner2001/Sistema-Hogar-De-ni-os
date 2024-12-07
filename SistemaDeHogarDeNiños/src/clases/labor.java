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


public class labor {
    private String idL  ;
    private String Fecha_i  ;
    private String Fecha_F  ;
    private String Descripcion  ;
    private String idarea  ;
    private String idniños  ;
    private String cienc  ;
    
    Conexion c = new Conexion();
    
    public labor (){
        
    }

    public String getIdL() {
        return idL;
    }

    public void setIdL(String idL) {
        this.idL = idL;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    public String getIdniños() {
        return idniños;
    }

    public void setIdniños(String idniños) {
        this.idniños = idniños;
    }

    public String getCienc() {
        return cienc;
    }

    public void setCienc(String cienc) {
        this.cienc = cienc;
    }

    
    public void guardar (){
        String consulta = "insert into labor values('"+this.idL+"' , '"+this.Fecha_i+"' , '"+this.Fecha_F+"' , '"+this.Descripcion+"' , '"+this.idarea+"' , '"+this.idniños+"' , '"+this.cienc+"'  );";
        c.ejecutarComando(consulta);
    }
    
    public void modificar (){
        String consulta = "update labor set Fecha_i = '"+this.Fecha_i+"' , Fecha_F = '"+this.Fecha_F+"' , Descripcion = '"+this.Descripcion+"' , idarea = '"+this.idarea+"' , idniños = '"+this.idniños+"' , cienc = '"+this.cienc+"' where idL = '"+this.idL+"' ; ";
        c.ejecutarComando(consulta);
    }
    
    public void eliminar (){
        String consulta = "delete from Labor where idL = '"+this.idL+"' ;";
        c.ejecutarComando(consulta);
    }
    
    public void Mostrar(JTable tabla){
        String[] Titulo = { "ID" ,"FECHA INCIO  "," FECHA FINAL "," DESCRIPCION "," ID AREA  ","ID NIÑOS " ,"ID ENCARGADO "};
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from labor ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[7];
                filadatos[0] = resultado.getObject("idL");
                filadatos[1] = resultado.getObject("Fecha_i");
                filadatos[2] = resultado.getObject("Fecha_F");
                filadatos[3] = resultado.getObject("Descripcion");
                filadatos[4] = resultado.getObject("idarea");
                filadatos[5] = resultado.getObject("idniños");
                filadatos[6] = resultado.getObject("cienc");
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(labor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
