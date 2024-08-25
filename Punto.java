/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad2;

/**
 *
 * @author USUARIO
 */
public class Punto {
    
    private int coordenada_x;
    private int coordenada_y;

    // Constructor sin parámetros para el punto
    public Punto() {
        this.coordenada_x = 0;
        this.coordenada_y = 0;
    }

    // Constructor con parámetros para el punto
    public Punto(int x, int y) {
        this.coordenada_x = x;
        this.coordenada_y = y;
    }

    // Métodos de acceso los getters y setters
    public int getCoordenadaX() {
        return coordenada_x;
    }

    public void setCoordenadaX(int x) {
        this.coordenada_x = x;
    }

    public int getCoordenadaY() {
        return coordenada_y;
    }

    public void setCoordenadaY(int y) {
        this.coordenada_y = y;
    }

    // Método para calcular la distancia a otro punto
    public double getDistancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getCoordenadaX() - this.coordenada_x, 2) + Math.pow(otroPunto.getCoordenadaY() - this.coordenada_y, 2));
    }

    // Método toString
    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + ", " + coordenada_y;
    }

  }

