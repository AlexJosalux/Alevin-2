/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.mavenproject8;
import java.util.Scanner;
/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        double precioFinal;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el precio del producto");
        double precio=leer.nextDouble();
        
        if (precio>100){
            precioFinal=0.2;
        }else{
            precioFinal=0.1;
        }
        double respuesta=precio-(precio*precioFinal);
        System.out.println("El precio final es de "+respuesta);
    }
}
