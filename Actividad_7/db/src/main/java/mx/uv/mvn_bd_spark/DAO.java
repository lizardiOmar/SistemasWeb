package mx.uv.mvn_bd_spark;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Conexion conn = new Conexion();
    List<Usuarios> resultado =new ArrayList<>();


    public List <Usuarios> dameUsuarios() {
        Statement stmt;
        try {
            stmt = conn.conectar().createStatement();
            ResultSet rs=stmt.executeQuery("select * from usuarios;");
            while (rs.next()) {
                String id = rs.getString("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Usuarios u=new Usuarios(id, email, password);
                resultado.add(u);
                System.out.println("/////////////////////");
                System.out.println(id + ","+ email + "," + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;  
        
    }
}
    

