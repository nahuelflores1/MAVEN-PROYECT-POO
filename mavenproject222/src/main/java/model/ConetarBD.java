/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConetarBD {
    public static Connection con;
    private static String bd = "tienda";
    public static String usuario = "root";
    public static String passv = "ueadb01";
    public static String url = "jdbc:mysql//localhost/"+bd;
public static Connection abrir(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(url,usuario,passv);
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
