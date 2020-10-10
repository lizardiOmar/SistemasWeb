package y;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        get("/", (req, res) -> "Hola desde Spark.");
        get("/hola", (req, res) -> "Hola desde Spark.");
        get("/adios", (req, res) -> "Adios desde Spark.");
    }
}
