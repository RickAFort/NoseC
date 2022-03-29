/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Mesero extends Empleado2{
    private String restaurante, colorUniforme;
    private int numMesas;

    public Mesero() {
    }

    public Mesero(String restaurante, String colorUniforme, int numMesas, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.colorUniforme = colorUniforme;
        this.numMesas = numMesas;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
    public void recibirPedidos(){
        System.out.println("Recibiendo pedido");
    }
    public void darPedidos(){
        System.out.println("Dando pedidos");
    }
    public void recibirPropina(){
        System.out.println("Recibiendo propina");
    }
    public void tomarDescanso(){
        System.out.println("Tomando un descanso");
    }

    @Override
    public String toString() {
        return "Mesero{"+super.toString() + "restaurante= " + restaurante + ", colorUniforme= " + colorUniforme + ", numMesas= " + numMesas + '}';
    }
    
}
