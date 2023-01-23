package org.lindap.main;
import org.lindap.herencia.Cliente;
import org.lindap.herencia.Empleado;
import org.lindap.herencia.Gerente;
import org.lindap.herencia.Persona;

import java.util.Scanner;

public class EjemploEmpresaConsola {
    public static void main(String[] args) {
        int option =0,id=0;
        String datos,nombre,apellido,direccion,fiscal;
        double sueldo=0;
        Scanner console = new Scanner(System.in);
        System.out.println("Sistema de administración Kaly Zev Art");

        Empleado empleado = new Empleado();
        System.out.println("Ingrese nombre:");
        nombre = console.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Ingrese apellido:");
        apellido = console.nextLine();
        empleado.setApellido(apellido);
        System.out.println("Ingrese numero fiscal: ");
        fiscal = console.nextLine();
        empleado.setNumeroFiscal(fiscal);
        System.out.println("Ingrese dirección: ");
        direccion = console.nextLine();
        empleado.setDireccion(direccion);
        System.out.println("Ingrese sueldo diario:");
        sueldo = console.nextDouble();
        empleado.setRemuneracion(sueldo);
        System.out.println("Ingrese el ID del empleado");
        id = console.nextInt();
        empleado.setEmpleadoId(id);

        Empleado linda = new Empleado("linda","Prieto","1256890f13",
                "Cerrada del bosque #83");
        linda.setEmpleadoId(1256);
        linda.setRemuneracion(200d);

        Empleado guillermo = new Empleado("Guillermo", "Guerra","567893G888",
                "Tepetlapa anden 4");
        guillermo.setRemuneracion(250d);
        guillermo.setEmpleadoId(1258);

        Cliente daniel = new Cliente("Daniel","Lezama","527346H987");
        daniel.setClienteId(236);

        Gerente nagito = new Gerente("Nagito","Komaeda","769023N174",
                "Despair academy");
        nagito.setRemuneracion(400d);
        nagito.setPresupuesto(100d);

        imprimir(empleado);
        imprimir(linda);
        imprimir(guillermo);
        imprimir(nagito);
    }

    public static void imprimir (Persona persona){
        System.out.println("~~~~~~~~~~~");
        System.out.println(persona);
    }
}