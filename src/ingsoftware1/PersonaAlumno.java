/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingsoftware1;

/**
 *
 * @author paula
 */
public class PersonaAlumno {

    
    public static void main(String[] args) {
        Alumno alum1 = new Alumno();
        
        alum1.setNombre("Paula");
        alum1.setEdad(26);
        System.out.println(alum1.calcularPromedio(7,9));
        System.out.println(alum1.obtenerInfoAlumno());
    }
    
}
