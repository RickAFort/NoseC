/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que crea un empleado en el paquete actividad 2
 * @author alumno
 */
public class Empleado2 extends Persona{
    private float salario;
    private int horaEntrada, horaSalida;
/**
 * Constructor vacío
 */
    public Empleado2() {
    }
/**
 * Constructor conatributos
 * @param salario Salario que recibe el empleado
 * @param horaEntrada Hora de entrada del empleado
 * @param horaSalida Hora de salida del empleado
 * @param mascota Mascota del empleado con sus atributos
 * @param nombre Nombre del empleado
 * @param edad  Edad del empleado
 */
    public Empleado2(float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    /**
     * Método para aclarar dudas
     */
    public void aclararDudas(){
        System.out.println("aclarando dudas");
    }
/**
 * Método que imprime los atributos del empleado
 * @return Atributos del empleado
 */
    @Override
    public String toString() {
        return super.toString()+", " + "salario= " + salario + ", horaEntrada= " + horaEntrada + ", horaSalida= " + horaSalida + " ";
    }
    
}
