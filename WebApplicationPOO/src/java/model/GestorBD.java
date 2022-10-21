package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
public class GestorBD {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs;
    int legajo;
    String nombre;
    String apellido;
    int promedio;
    Alumno alEncontrado;
    
  public boolean registrar(int legajo, String nombre,String apellido,int promedio){
int resultUpdate=0;
 try{
    conn = ConectarBD.abrir();
    stm = conn.createStatement();
    String sql = "call ALUMNO("+legajo+",'"+nombre+"', '"+apellido+"', "+promedio+")";
    JOptionPane.showMessageDialog(null, sql);
    resultUpdate = stm.executeUpdate(sql);
    JOptionPane.showMessageDialog(null, resultUpdate);
    
    if(resultUpdate !=0){
        ConectarBD.cerrar();
        return true;
    }else{
        ConectarBD.cerrar();
        return false;
    }
   }catch(Exception e){
      System.out.println("Error en la bd");
      JOptionPane.showMessageDialog(null, e );
      e.printStackTrace();
    return false;
    } 
    
}
  public Alumno consultar(int legajo){
      try{
          conn=ConectarBD.abrir();
          stm=conn.createStatement();
          String sql="SELECT * FROM ALUMNO WHERE legajo" + legajo;
          rs=stm.executeQuery(sql);
          if (!rs.next()) {
              System.out.println(" No se encontro el registro");
              ConectarBD.cerrar();
          return null;
          }else{
          System.out.println("Se encontro el registro");
          this.legajo = rs.getInt("legajo");
          nombre = rs.getString("nombre");
          apellido = rs.getString("apellido");
          promedio=rs.getInt("promedio");
          alEncontrado =new Alumno(this.legajo,nombre,apellido,promedio);
          ConectarBD.cerrar();
          return alEncontrado;
          }   
    } catch(SQLException ex){
        System.out.println("Error en la base de datos");
        return null;  
    } 
  }
}
