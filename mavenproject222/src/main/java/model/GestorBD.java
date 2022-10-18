/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class GestorBD {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs;
    int legajo;
    String nombre;
    String apellido;
    Double promedio;
    Alumno alEncontrado;
    

    
}
