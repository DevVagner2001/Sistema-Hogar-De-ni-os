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


public class Formacion {
    
    Conexion c = new Conexion();
    
    private String  idF ;
    private String  Turno ;
    private String  idGrado ;
    private String  idUE;
    private String idniños ;
    
    public Formacion(){
        
    }

    public  String getIdF() {
        return idF;
    }

    public void setIdF(String idF) {
        this.idF = idF;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(String idGrado) {
        this.idGrado = idGrado;
    }

    public String getIdUE() {
        return idUE;
    }

    public void setIdUE(String idUE) {
        this.idUE = idUE;
    }

    public String getIdniños() {
        return idniños;
    }

    public void setIdniños(String idniños) {
        this.idniños = idniños;
    }
    
    public void guardar (){
        String consulta ="insert into Formacion (idF , Turno ,  idGrado , idUE , idniños ) values ('"+this.idF+"' , '"+this.Turno+"' , '"+this.idGrado+"' , '"+this.idUE+"' , '"+this.idniños+"' );"; 
        c.ejecutarComando(consulta);
    }
    
    public void modificar  (){
        String consulta = " update Formacion set Turno = ' "+this.Turno+" ' , idGrado = ' "+this.idGrado+" ' , idUE = ' "+this.idUE+" ' , idniños = ' "+this.idniños+" '  where idF = ' "+this.idF+" ' ; " ;
        c.ejecutarComando(consulta);
    }
    
    public void eliminar () {
        String comando =  " delete from Formacion where idF = ' "+this.idF +" '";
        c.ejecutarComando(comando);
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," TURNO  " , "GRADO" , "UE" , "NIÑOS"  };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from Formacion ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[5];
                filadatos[0] = resultado.getObject("idF");
                filadatos[1] = resultado.getObject("Turno");
                filadatos[2] = resultado.getObject("idGrado");
                filadatos[3] = resultado.getObject("idUE");
                filadatos[4] = resultado.getObject("idniños");
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Formacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
