package org.lindap.herencia;

public class Cliente extends Persona{
    private int clienteId;

    public Cliente(){
        super();
    }
    public Cliente(String nombre, String apellido){
        super(nombre,apellido);
    }
    public Cliente(String nombre, String apellido, String numeroFiscal){
        super(nombre, apellido, numeroFiscal);
    }
    public Cliente(String nombre, String apellido, String numeroFiscal, int clienteId){
        super(nombre, apellido, numeroFiscal);
        this.clienteId = clienteId;
    }
    public Cliente(int clienteId){
        this.clienteId = clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombreCliente: " +
                "\nclienteId: " + clienteId;
    }
}
