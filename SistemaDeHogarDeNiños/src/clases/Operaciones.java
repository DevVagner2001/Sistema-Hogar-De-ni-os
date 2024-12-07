package clases;

import conexion.Conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones {


    private String Principal;
    private String Principal2;
    
    private Conexion c = new Conexion();

    public String getPrincipal() {
        return Principal;
    }

    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public String getPrincipal2() {
        return Principal2;
    }

    public void setPrincipal2(String Principal2) {
        this.Principal2 = Principal2;
    }

    

    public void mostrarJtableOperacion1(JTable tabla) {
    String[] Titulo = { "ID Niño", "Nombre", "Apellido", "Edad", "ID UE", "ID Grado" };
    DefaultTableModel model = new DefaultTableModel(null, Titulo);

    String consulta = "SELECT * FROM ObtenerNiñosPorUnidadEducativa(" + this.Principal + ");";
    ResultSet resultado = c.ejecutarConsulta(consulta);  // Ejecutar la consulta

    try {
        while (resultado.next()) {
            Object[] filaDatos = new Object[6];
            filaDatos[0] = resultado.getObject("Id_Niño");
            filaDatos[1] = resultado.getObject("Nombre");
            filaDatos[2] = resultado.getObject("Apellido");
            filaDatos[3] = resultado.getObject("Edad");
            filaDatos[4] = resultado.getObject("Id_UE");
            filaDatos[5] = resultado.getObject("Id_Grado");

            model.addRow(filaDatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, "Error al mostrar los datos en la tabla", ex);
    }
}
    
    public void mostrarJtableOperacion2(JTable tabla ) {
    String[] Titulo = { "ID Niño", "Nombre", "Apellido", "Edad", "ID Personal" };
    DefaultTableModel model = new DefaultTableModel(null, Titulo);

    String consulta = "SELECT * FROM ObtenerNiñosSinTutor(" + this.Principal + ");";
    ResultSet resultado = c.ejecutarConsulta(consulta);  // Ejecutar la consulta

    try {
        while (resultado.next()) {
            Object[] filaDatos = new Object[5];
            filaDatos[0] = resultado.getObject("Id_Niño");
            filaDatos[1] = resultado.getObject("Nombre");
            filaDatos[2] = resultado.getObject("Apellido");
            filaDatos[3] = resultado.getObject("Edad");
            filaDatos[4] = resultado.getObject("Id_Personal");

            model.addRow(filaDatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, "Error al mostrar los datos en la tabla", ex);
    }
}
    public void mostrarJtableIngresosPorRangoFechas(JTable tabla) {
    String[] Titulo = { "ID Ingreso", "Monto", "Fecha", "Descripcion", "Tipo Ingreso" };
    DefaultTableModel model = new DefaultTableModel(null, Titulo);

    // Consulta para llamar a la función con los parámetros de fecha
    String consulta = "SELECT * FROM ObtenerIngresosPorRangoFechas('" + this.Principal + "', '" + this.Principal2 + "');";
    ResultSet resultado = c.ejecutarConsulta(consulta);  // Ejecutar la consulta

    try {
        while (resultado.next()) {
            Object[] filaDatos = new Object[5];
            filaDatos[0] = resultado.getObject("ID Ingreso");
            filaDatos[1] = resultado.getObject("Monto");
            filaDatos[2] = resultado.getObject("Fecha");
            filaDatos[3] = resultado.getObject("Descripcion");
            filaDatos[4] = resultado.getObject("Tipo Ingreso");

            model.addRow(filaDatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, "Error al mostrar los ingresos en la tabla", ex);
    }
}
    public void mostrarJtableNiñosConLabor(JTable tabla) {
    String[] Titulo = { "Fecha", "Nombre Niño", "Nombre Labor", "Nombre Encargado" };
    DefaultTableModel model = new DefaultTableModel(null, Titulo);

    // Consulta para llamar a la función con el parámetro de fecha
    String consulta = "SELECT * FROM ObtenerNiñosConLabor('" + this.Principal + "');";
    ResultSet resultado = c.ejecutarConsulta(consulta);  // Ejecutar la consulta

    try {
        while (resultado.next()) {
            Object[] filaDatos = new Object[4];
            filaDatos[0] = resultado.getObject("Fecha");
            filaDatos[1] = resultado.getObject("Nombre_Niño");
            filaDatos[2] = resultado.getObject("Nombre_Labor");
            filaDatos[3] = resultado.getObject("Nombre_Encargado");

            model.addRow(filaDatos);
        }
        tabla.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, "Error al mostrar los datos en la tabla de niños con labor", ex);
    }
}



}
