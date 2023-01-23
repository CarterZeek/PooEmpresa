package org.lindap.main;
import org.lindap.herencia.Gerente;
import org.lindap.herencia.Persona;
public class EjemploEmpresa {
    public static void main(String[] args) {
        System.out.println("Sistema de administración Kaly Zev Art");

        Gerente nagito = new Gerente("Nagito","Komaeda",
                "769023N174", "Despair academy");
        nagito.setRemuneracion(400d);
        nagito.setPresupuesto(100d);

        imprimir(nagito);
    }

    public static void imprimir (Persona persona){
        System.out.println("~~~~~~~~~~~");
        System.out.println(persona);
    }
}