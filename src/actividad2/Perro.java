/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    public Perro() {
    }

    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    
    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    public void corretear(){
        System.out.println("Estoy corretiando");
    }

    @Override
    public String toString() {
        return "{Perro "+super.toString()+ "colaCortada= " + colaCortada + '}';
    }
    
}
