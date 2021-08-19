package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtilities {
    // se hace la comunicacion con la base de datos y se pasa a un objeto connection para que la maneje
    
    private static final String DATABASE_LOCATION = "C:\\Temp\\java\\reto4\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;
        

        return DriverManager.getConnection(url);
    }
}
