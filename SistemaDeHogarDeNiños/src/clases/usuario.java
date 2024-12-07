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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;
import javax.naming.spi.DirStateFactory;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class usuario {
    private String id_u ;
    private String username ;
    private String password ;
    private String personalci ;
    
    public usuario(){
        
    }
    
    Conexion c = new Conexion();
    

    public usuario(String id_u, String username, String password, String personalci) {
        this.id_u = id_u;
        this.username = username;
        this.password = password;
        this.personalci = personalci;
        
    }
    
    public String getId_u() {
        return id_u;
    }

    public void setId_u(String id_u) {
        this.id_u = id_u;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalci() {
        return personalci;
    }

    public void setPersonalci(String personalci) {
        this.personalci = personalci;
    }

    public void guardar (){
        String consulta ="insert into usuario (id_u , username , password , personalci  ) values ('"+this.id_u+"' , '"+this.username+"' , '"+this.password+"' , '"+this.personalci+"' );"; 
        c.ejecutarComando(consulta);
    }
    
    public void modificar  (){
        String consulta = " update usuario set username = ' "+this.username+" ' , password = ' "+this.password+" ' , personalci = ' "+this.personalci+" '  where id_u = ' "+this.id_u+" ' ; " ;
        c.ejecutarComando(consulta);
    }
    
    public void eliminar () {
        String comando =  " delete from usuario where id_u = ' "+this.id_u +" '";
        c.ejecutarComando(comando);
    }
    
    public void MostrarJtableTI (JTable tabla ){
        String[] Titulo = { "ID" ," user  " , "password" , "CI Personal" };
        DefaultTableModel model = new DefaultTableModel(null, Titulo);
        

        String consulta = "select * from usuario ;";
        ResultSet resultado = c.ejecutarConsulta(consulta);
        try {
            while(resultado.next()){
                Object [] filadatos = new Object[4];
                filadatos[0] = resultado.getObject("id_u");
                filadatos[1] = resultado.getObject("username");
                filadatos[2] = resultado.getObject("password");
                filadatos[3] = resultado.getObject("personalci");
               
                
                model.addRow(filadatos);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String validarUser(String user , String passw ){//solo para retornar id 
        
        try {
            String consulta = "select id_u from usuario where username ='"+user+"'  and password = '"+passw+"';" ;
            ResultSet res = c.ejecutarConsulta(consulta);
            if(res.next()){
                return res.getString("id_u") ;
            }else{
                return null ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return null ;
    }
    
    public void validarUserLogeado(String user , JLabel id ,JLabel nombre , JLabel tipo , JLabel correo ){
        
        try {
            String consulta = "select u.id_u , p.nombre , p.tipo , p.correo from usuario u , personal p where u.personalci = p.ci and u.id_u = '"+user+"';";
            ResultSet res = c.ejecutarConsulta(consulta);
            res.next();
            
            String iduu = res.getString("id_u");
            String nombres = res.getString("nombre");
            String tipos = res.getString("tipo");
            String correos = res.getString("correo");
            
            id.setText(iduu);
            nombre.setText(nombres);
            tipo.setText(tipos);
            correo.setText(correos);
            
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}