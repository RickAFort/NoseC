/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Profesor extends Empleado2{
    private int numAlumnos;

    public Profesor() {
    }

    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    public void reprobar(){
        System.out.println("Estas reprobado");
    }
    public void pasarAlumnos(){
        System.out.println("Has pasado");
    }
    public void explicar(){
        System.out.println("Estoy explicando");
    }
    public void ensenar(){
        System.out.println("Estoy enseñando");
    }

    @Override
    public String toString() {
        return super.toString()+" ," + "numAlumnos= " + numAlumnos + ' ';
    }
    
            
}
