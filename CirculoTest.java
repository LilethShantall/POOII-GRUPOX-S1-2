/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad1;

/**
 *
 * @author Lileth
 */
public class CirculoTest {
    public static void main(String[] args) {
        // Usando el constructor por defecto
        Circulo circulo1 = new Circulo();
        System.out.println("Radio del círculo 1: " + circulo1.getRadio());
        System.out.println("Área del círculo 1: " + circulo1.getArea());

        // Usando el constructor sobrecargado
        Circulo circulo2 = new Circulo(6.55);
        System.out.println("Radio del círculo 2: " + circulo2.getRadio());
        System.out.println("Área del círculo 2: " + circulo2.getArea());

        // Cambiar los valores predeterminados mediante el uso de métodos setter
        circulo1.setRadio(15.0);
        circulo1.setColor("rojo");
        System.out.println("Radio modificado: " + circulo1.getRadio());
        System.out.println("Color modificado: " + circulo1.getColor());

        // Mostrar la representación del objeto usando el método toString()
        System.out.println("Detalles del círculo 1: " + circulo1);
        System.out.println("Detalles del círculo 2: " + circulo2);
    }
}

