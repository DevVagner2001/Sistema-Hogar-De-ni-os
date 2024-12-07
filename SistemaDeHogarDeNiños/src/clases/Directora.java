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
import clases.*;

public class Directora extends Personal {
    
    public Directora(){
        
    }

    public Directora(String idP, String Nombre, String Apellido, String sexo, String Tipo, String correo, String cel_ref, String Fecha_i, String FEcha_f) {
        super(idP, Nombre, Apellido, sexo, Tipo, correo, cel_ref, Fecha_i, FEcha_f);
    }
    
    public void GuardarDirec(){
        String comando = "insert into personal(ci, Nombre, Apellido, sexo, Tipo , correo , cel_ref , Fecha_i , fecha_f ) values ('"+this.ci+"','"+this.Nombre+"','"+this.Apellido+"','"+this.sexo+"','"+this.Tipo+"','"+this.correo+"','"+this.cel_ref+"','"+this.Fecha_i+"','"+this.FEcha_f+"');";
        c.ejecutarComando(comando);
        String comando2 = "insert into Directora values ('"+this.ci+"');" ;
        c.ejecutarComando(comando2);
    }
    public void ModificarDirectora(){
        String comando =" update personal set nombre = '"+this.Nombre+"' ,apellido = '"+this.Apellido+"' ,sexo = '"+this.sexo+"' ,tipo = '"+this.Tipo+"',correo = '"+this.correo+"' ,	 cel_ref = '"+this.cel_ref+"' ,fecha_i = '"+this.Fecha_i+"' ,fecha_f = '"+this.FEcha_f+"'  where ci = '"+this.ci+"' ;";
        c.ejecutarComando(comando);
    }
    public void EliminarDirec(){
        String comando2 = "delete from Directora where cid = '"+this.ci+"'" ;
        c.ejecutarComando(comando2);
        String comando = "delete from personal where ci = '"+this.ci+"'" ;
        c.ejecutarComando(comando);
        
    }
    public void MostrarDirect(JTable tabla ){
        String[] Titulo = { "CI" ," NOMBRE "," APELLIDO"," SEXO"," TIPO","CORREO ELECTRONICO","PHONE","FECHA I","FECHA F"};
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from personal p where p.tipo = 'Directora';";
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
            Logger.getLogger(Encargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
