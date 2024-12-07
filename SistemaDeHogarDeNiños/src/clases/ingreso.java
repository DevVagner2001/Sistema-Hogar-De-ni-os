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

public class ingreso {
    
    private String  idI  ;
    private String  Monto  ;
    private String  Fecha  ;
    private String  Descripcion  ;
    private String  cisecre  ;
    private String  IdTipoIngreso  ;
    
    Conexion c = new Conexion();
    
    public ingreso (){
        
    }

    public String getIdI() {
        return idI;
    }

    public void setIdI(String idI) {
        this.idI = idI;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCisecre() {
        return cisecre;
    }

    public void setCisecre(String cisecre) {
        this.cisecre = cisecre;
    }

    
    public String getIdTipoIngreso() {
        return IdTipoIngreso;
    }

    public void setIdTipoIngreso(String IdTipoIngreso) {
        this.IdTipoIngreso = IdTipoIngreso;
    }
    
    public void guardar (){
        String consulta ="insert into Ingreso (idI , Monto , Fecha , Descripcion , cisecre , IdTipoIngreso ) values ('"+this.idI+"' , '"+this.Monto+"' , '"+this.Fecha+"' , '"+this.Descripcion+"' , '"+this.cisecre+"' , '"+this.IdTipoIngreso+"');"; 
        c.ejecutarComando(consulta);
    }
    
    public void modificar  (){
        String consulta = "UPDATE Ingreso SET Monto = '"+this.Monto+"', Fecha = '"+this.Fecha+"', Descripcion = '"+this.Descripcion+"', cisecre = '"+this.cisecre+"', IdTipoIngreso = '"+this.IdTipoIngreso+"' WHERE idI = '"+this.idI+"';";
        c.ejecutarComando(consulta);
    }
    
    public void eliminar () {
        String comando =  " delete from Ingreso where idI = ' "+this.idI +" ' ; ";
        c.ejecutarComando(comando);
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," MONTO  " , "FECHA" , "DESCRIPCION" , "CI S" , "ID T.I" };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from Ingreso ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[6];
                filadatos[0] = resultado.getObject("idI");
                filadatos[1] = resultado.getObject("Monto");
                filadatos[2] = resultado.getObject("Fecha");
                filadatos[3] = resultado.getObject("Descripcion");
                filadatos[4] = resultado.getObject("cisecre");
                filadatos[5] = resultado.getObject("IdTipoIngreso");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
