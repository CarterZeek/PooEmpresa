package org.lindap.main;
import org.lindap.herencia.Cliente;
import org.lindap.herencia.Empleado;
import org.lindap.herencia.Gerente;
import org.lindap.herencia.Persona;

import java.util.Scanner;

import static org.lindap.main.EjemploEmpresa.imprimir;

public class EjemploEmpresaModificable {
    public static void main(String[] args) {
        int option =0,id=0;
        String datos,nombre,apellido,direccion,fiscal;
        double sueldo=0;
        System.out.println("Sistema de administración Kaly Zev Art");
        Scanner console = new Scanner(System.in);
        while(option < 4){
            System.out.println("¿Qué operación desea realizar hoy?");
            System.out.println("1. Agregar a un nuevo empleado");
            System.out.println("2. Consultar datos del empleado");
            System.out.println("3. Ascender a un empleado existente");
            System.out.println("4. Salir");

            option = console.nextInt();
            Empleado empleado = new Empleado();
            switch (option) {
                case 1:
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
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre2;
                    nombre2 = console.nextLine();
                    if (nombre2.equals(empleado.getNombre())) {
                        imprimir(empleado);
                        System.out.println(empleado.getNombre());
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el ID del empleado que desea ascender: ");
                    id = console.nextInt();
                    if(id == empleado.getEmpleadoId()){
                        System.out.println("El nuevo sueldo del empleado es: "+ empleado.aumentarRemuneracion(sueldo,20d));
                    }else{
                        System.out.println("El empleado no puede recibir un aumento");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando el programa... ");
                    System.exit(0);
                    break;
                }
        }

    }
    public static void imprimir (Persona persona){
        System.out.println("~~~~~~~~~~~");
        System.out.println(persona);
    }
}