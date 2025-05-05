/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsoftware1;

/**
 *
 * @author paula
 */
public class Alumno extends Persona{
    public Alumno(String nombre, int edad){
        super(nombre, edad);
    }
    public Alumno(){
    }
    @Override
    public double calcularPromedio(int nota1, int nota2){
        return ((nota1 + nota2) / 2);
    }
    @Override
    public String obtenerInfoAlumno(){
        return ("Sobreescribiendo obtenerInfoAlumno");
    }
}
