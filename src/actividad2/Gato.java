/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Gato extends Mascota{

    public Gato() {
    }

    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    
    public void rasgunar(){
        System.out.println("Rasguñando");
    }
    public void trepar(){
        System.out.println("Estoy trepando");
    }

    @Override
    public String toString() {
        return "Gato "+ super.toString() ;
    }
    
}
