/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Mascota extends SerVivo{
    private String color,raza,colorOjos;

    public Mascota() {
    }

    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    public void dormir(){
        System.out.println("Zzzzzz"); 
    }
    public void jugar(){
        System.out.println("Pasame la pelota");
    }
    public void saltar(){
        System.out.println("Estoy saltando");
    }

    @Override
    public String toString() {
        return "Mascota["+super.toString()+ "color= " + color + ", raza= " + raza + ", colorOjos= " + colorOjos + ']';
    }
    
}
