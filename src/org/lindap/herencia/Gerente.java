package org.lindap.herencia;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Gerente(String nombre, String apellido, String numeroFiscal){
        super(nombre,apellido,numeroFiscal);
    }
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
    }
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,double presupuesto){
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente: " +
                "\nPresupuesto: " + presupuesto;
    }
}
