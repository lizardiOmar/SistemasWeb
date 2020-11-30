package mx.uv.mvn_bd_spark;
import static spark.Spark.*;

import java.util.Map;
import java.util.UUID;
import java.util.HashMap;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{ 
    private static Gson gson=new Gson();
   
    private static Map<String, Usuarios> usuarios=new HashMap<>();
    public static void main( String[] args )
    {
        DAO dao=new DAO();
        
        get("usuarios_g",(req,res) -> gson.toJson(dao.dameUsuarios()));
        
        post("usuarios_p",(req,res)->{
            String query=req.body();
            System.out.println("Peticion"+query);
            Usuarios u=gson.fromJson(query, Usuarios.class);
            
            String id=UUID.randomUUID().toString();
            u.setId(id);
            usuarios.put(id,u);
            return "Se creo el usuario";
        });
        System.out.println( "Hello World!" );
    }
}
