/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea4;
/**
 * Métodos para realizar los cálculos.
 * 
 * @author Alexandra Sánchez
 * @version 1.0
 * @since 2026-03-20
 */

public class Utilidades {

    /**
    * Constructor por defecto de la clase Utilidades, lo incluimos para que no nos salte el warning
    */
    public Utilidades() {
    }
    
    /**
     * Determina si un año pasado por parámetro es bisiesto
     * @param anio El año a comprobar
     * @return true si es bisiesto, false en caso contrario
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    /**
     * Convierte una velocidad de kilómetros por hora a metros por segundo
     * @param kmh Velocidad en km/h
     * @return La velocidad equivalente en m/s
     */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Convierte un ángulo de grados decimales a radianes
     * @param grados Valor del ángulo en grados
     * @return El valor del ángulo en radianes
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    /**
     * Convierte un ángulo en formato sexagesimal (grados, minutos, segundos) a radianes
     * @param grados Parte entera de los grados
     * @param minutos Minutos del ángulo
     * @param segundos Segundos del ángulo
     * @return El valor del ángulo en radianes
     */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }

    /**
     * Convierte una temperatura de grados Celsius a grados Fahrenheit
     * @param celsius Temperatura en grados Celsius
     * @return La temperatura equivalente en Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte una temperatura de grados Fahrenheit a grados Celsius
     * @param fahrenheit Temperatura en grados Fahrenheit
     * @return La temperatura equivalente en Celsius
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Calcula el área de un círculo dado su radio
     * @param radio Radio del círculo
     * @return El área calculada (PI * r^2)
     */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }

    /**
     * Calcula la longitud de la circunferencia de un círculo
     * @param radio Radio del círculo
     * @return La longitud calculada (2 * PI * r)
     */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Calcula el cuadrado de un número decimal
     * @param num Número base
     * @return El resultado de elevar el número a la potencia 2
     */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }

    /**
     * Calcula la hipotenusa de un triángulo rectángulo a partir de sus catetos
     * @param cateto1 Longitud del primer cateto
     * @param cateto2 Longitud del segundo cateto
     * @return El valor de la hipotenusa
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }

    /**
     * Calcula el valor de un cateto conocido el otro cateto y la hipotenusa
     * @param hipotenusa Longitud de la hipotenusa
     * @param cateto Longitud del cateto conocido
     * @return El valor del cateto restante
     */
    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }

    /**
     * Convierte una velocidad de millas por hora a kilómetros por hora
     * @param mph Velocidad en millas por hora
     * @return La velocidad equivalente en kilómetros por hora
     */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }

    /**
     * Convierte una velocidad de kilómetros por hora a millas por hora
     * @param kmh Velocidad en kilómetros por hora
     * @return La velocidad equivalente en millas por hora
     */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}
