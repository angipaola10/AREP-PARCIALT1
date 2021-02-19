package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/calculator", (req, res) -> {
            int num = Integer.parseInt( req.queryParams("value") );
            String operation = req.queryParams("operation");
            return Calculator.operate(num, operation);
        });
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
