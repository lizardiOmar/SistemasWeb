package mx.uv.mvn_bd_spark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    //From JDBC 4.0, we don't need to include 'Class.forName()' in our code to load JDBC driver. JDBC 4.0 drivers that are found in your classpath are automatically loaded.
    public Connection conectar(){
        Connection connection=null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo_simple?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return connection;
    }
}
