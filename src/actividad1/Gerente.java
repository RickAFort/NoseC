/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *Clase que crea un gerente
 * @author alumno
 */
public class Gerente extends Empleado{
    private int presupuesto;
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
    }
/**
 * Constructor vacìo
 */
    public Gerente() {
    }
/**
 * Constructor con atributos
 * @param presupuesto Cantidad de presupuesto del gerente
 * @param nombre Nombre del gerente
 * @param numEmpleado Nùmero de empleado del Gerente
 * @param sueldo Sueldo que recibe el gerente
 */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);//super signifca que viene de super clase es un método construtor
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
/**
 * Mètodo que imprime los atributos del gerente
 * @return  Atributos del gerente
 */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    //con un super se sacan los demàs parametros
    
}
