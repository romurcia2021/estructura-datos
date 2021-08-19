package Modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_1;

public class Requerimiento_1Dao {

    // Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();

        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "SELECT ID_Proyecto ,Ciudad, Banco_Vinculado,Constructora FROM Proyecto WHERE Ciudad = 'Bogota' ORDER BY Banco_Vinculado;";
          
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulSet = statement.executeQuery();
            
            while (resulSet.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();

                requerimiento_1.setID_Proyecto(resulSet.getInt("id_Proyecto")); 
                requerimiento_1.setCiudad(resulSet.getString("ciudad"));
                requerimiento_1.setBanco_Vinculado(resulSet.getString("banco_vinculado"));
                requerimiento_1.setContructora(resulSet.getString("Constructora"));

                respuesta.add(requerimiento_1);

            }

            resulSet.close();;
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return respuesta;

    }
}