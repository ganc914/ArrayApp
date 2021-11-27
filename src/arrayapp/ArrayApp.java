/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] alumnos = {"Gus", "Luis", "Edith", "Diana", "Fer"};
        System.out.println("Ejemplo 1 ****************************************************");
        System.out.println("longitud = " + alumnos.length);
        System.out.println(" ");
        System.out.println("Ejemplo 2 ****************************************************");

//        String[] materias = new String[5];
//        System.out.println("longitud = " + materias.length);
//        materias[0] = "Estructura de datos";
//        materias[1] = "Programacion Web";
//        materias[2] = "Investigacion de Operaciones";
//        materias[3] = "Ensablador y Compiladores";
//        materias[4] = "Contabilidad";
//        System.out.println("elemento = " + materias[3]);
        float[] costos = new float[5];
        System.out.println("Longitud = " + costos.length);
        System.out.println("elemento[0] = " + costos[0]);
        System.out.println("elemento[2] = " + costos[2]);
        //System.out.println("elemento = " + costos[3]);
        costos[0] = (float) 10.6;
        costos[1] = (float) 20.5;
        costos[2] = (float) 5.6;
        costos[3] = (float) 45.6;
        costos[4] = (float) .001;
        System.out.println("elemento[1] = " + costos[1]);
        System.out.println("elemento[0] = " + costos[0]);
        System.out.println("elemento[2] = " + costos[2]);
        
        System.out.println(" ");
        System.out.println("Array List ****************************************************");
        
        ArrayList<Prueba> p1= new ArrayList<Prueba>();
        Prueba prueba1 = new Prueba(1, "AC");
        p1.add(prueba1);
        
        Prueba prueba2 = new Prueba(2, "BA");
        p1.add(prueba2);
        
        Prueba prueba3 = new Prueba(3, "CA");
        p1.add(prueba3);
        
        System.out.println("longitud de arreglo de objetos: " + p1.size());
        System.out.println("datos del objeto 1: " + p1.get(0).getEstatus());
        System.out.println("datos del objeto 2: " + p1.get(1).getEstatus());
        System.out.println("datos del objeto 2: " + p1.get(2).getEstatus());
    }

}
