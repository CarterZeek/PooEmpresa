package org.lindap.herencia;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;

    public Empleado(){
        super(); //se invoca el constructor del padre
    }
    public Empleado(String nombre,String apellido){
        super(nombre,apellido);
    }
    public Empleado(String nombre, String apellido, String numeroFiscal){
        super(nombre, apellido, numeroFiscal);
    }
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
    }
    public Empleado(String nombre, String apellido, String numeroFiscal,
                    String direccion, double remuneracion,int empleadoId){
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }
    public double aumentarRemuneracion(double remuneracion, double porcentaje){
        porcentaje = remuneracion * porcentaje;
        return porcentaje + remuneracion;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nRemuneracion: " + remuneracion +
                "\nEmpleadoId: " + empleadoId;
    }
}
