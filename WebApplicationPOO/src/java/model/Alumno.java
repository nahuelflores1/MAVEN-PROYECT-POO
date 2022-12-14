/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private int promedio;

    public Alumno(String nombre, String apellido, int promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public Alumno(int legajo, String nombre, String apellido, int promedio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return (nombre+" "+apellido+" tiene promedio: "+promedio);
    }
    
}
