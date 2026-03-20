/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea4;
/**
 * Clase principal dode se utilizan los cálculos.
 * 
 * @author Alexandra Sánchez
 * @version 1.0
 * @since 2026-03-20
 */
public class Tarea4 {
    
    /**
    * Constructor por defecto de la clase Tarea4, lo incluimos para que no nos salte el warning
    */
    public Tarea4() {
    }
    
    /**
     * Método principal que inicia la ejecución de la aplicación
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hipotenusa(3, 4) + "cm");
    }

}
