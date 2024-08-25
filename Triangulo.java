/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad2;

/**
 *
 * @author Lileth
 */
public class Triangulo extends FiguraGeometrica{

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    // Constructor sin parámetros para Triangulo
    public Triangulo() {
        super("Triángulo");
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    // Constructor con parámetros para Triangulo
    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super("Triángulo");
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    // Métodos de acceso y manipulación
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto p1) {
        this.punto1 = p1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto p2) {
        this.punto2 = p2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto p3) {
        this.punto3 = p3;
    }

    // Sobreescribir los métodos hereados de la clase Figura Geométrica(calcularArea)

    @Override
    public double calcularAreaFigura() {
        double a = punto1.getDistancia(punto2);
        double b = punto2.getDistancia(punto3);
        double c = punto3.getDistancia(punto1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Sobreescribir esRegular (un triángulo es regular si todos sus lados son iguales)
    @Override
    public boolean esRegular() {
        double a = punto1.getDistancia(punto2);
        double b = punto2.getDistancia(punto3);
        double c = punto3.getDistancia(punto1);
        return a == b && b == c;
    }

    // Método toString
    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " 
            + punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString();
    }
}


