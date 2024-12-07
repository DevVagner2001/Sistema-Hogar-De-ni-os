package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String USER = "postgres";
    private final String PASS = "admin";
    private final String DATABASE = "sistemahogar2";
    private final String HOST = "localhost";
    private final String URL = "jdbc:postgresql://" + HOST + "/" + DATABASE;

    private Connection bd;

    public Conexion() {
        conectar();
        //System.out.println("entramos pe");
    }

    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            bd = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion a la base de datos realizada");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexión: " + ex.getMessage());
        }
    }

    public void desconectar() {
        if (bd != null) {
            try {
                bd.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    public Connection getConnection() {
        return bd;
    }

    public ResultSet ejecutarConsulta(String query) {
        ResultSet resultado = null;
        try {
            Statement sttm = bd.createStatement();
            resultado = sttm.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean ejecutarComando(String comando) {
        try {
            Statement sttm = bd.createStatement();
            sttm.execute(comando);
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar comando: " + ex.getMessage());
            return false;
        }
    }
    
    public void mostrarDatosConsola(ResultSet resultQuery) {
        try {
            ResultSetMetaData metaData = resultQuery.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Imprimir los nombres de las columnas
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir las filas de datos
            while (resultQuery.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultQuery.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Error al mostrar los datos: " + ex.getMessage());
        }
    }
}
