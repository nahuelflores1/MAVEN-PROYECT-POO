package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarBD {
    public static Connection con;
    private static String bd = "instituto";
    public static String usuario = "root";
    public static String passv = "";
    public static String url = "jdbc:mysql//localhost/3306"+bd;
public static Connection abrir() throws SQLException{
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(bd,usuario,passv);
    } catch(Exception e){
    System.out.println("Error en la conexion...");
    e.printStackTrace();
    }
    return con;
}
    

public static void cerrar(){
    try{
        if(con !=null)
            con.close();
    } catch(Exception e){
        System.out.println("Error: No se logro cerrarconexion:\n"+e);
    }
}
}
