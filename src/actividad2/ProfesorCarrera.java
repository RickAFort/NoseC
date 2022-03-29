/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignaturas, grupos;

    public ProfesorCarrera() {
    }

    public ProfesorCarrera(int numAsignaturas, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignaturas = numAsignaturas;
        this.grupos = grupos;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "ProfesorCarrera{"+super.toString()+ "numAsignaturas= " + numAsignaturas + ", grupos= " + grupos + '}';
    }
    
}
