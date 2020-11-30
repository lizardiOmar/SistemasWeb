package uv.mx.mvn_velocity;

import static spark.Spark.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
    public static void main( String[] args )
    {
        
        staticFiles.location("/public");
        get("/", (req, res) -> {
            Map<String, Object> modelo = new HashMap<>();
            Date fecha=new Date();
            modelo.put("fecha", fecha);
            System.out.println("Hola ha entrado");
            return new ModelAndView(modelo, "velocity/index.vm");
        }, new VelocityTemplateEngine());

        
    }
}
