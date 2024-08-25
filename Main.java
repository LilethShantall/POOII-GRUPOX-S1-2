/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad2;

/**
 *
 * @author Lileth
 */
    import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear puntos para figuras geometricas
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(3, 4);
        Punto p3 = new Punto(4, 2);

        // Crear un triángulo con los puntos
        Triangulo triangulo = new Triangulo(p1, p2, p3);

        // Crear una lista de figuras geométricas
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(triangulo);

        // Crear una superficie plana y indicar las áreas
        SuperficiePlana superficie = new SuperficiePlana(figuras);
        superficie.mostrarAreas();

        // Indicar si el triángulo es regular
        System.out.println(triangulo.toString());
        System.out.println("¿Es regular? " + triangulo.esRegular());
    }
}


