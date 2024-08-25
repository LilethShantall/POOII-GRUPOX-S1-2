/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad2;

/**
 *
 * @author Lileth
 */
    import java.util.List;

public class SuperficiePlana {
    
    private final List<FiguraGeometrica> figurasGeometricas;
    

    // Constructor de SuperficiePlana
    public SuperficiePlana(List<FiguraGeometrica> figuras) {
        this.figurasGeometricas = figuras;
    }

    // Método para devolver las áreas de todas las figuras geométricas
    public void mostrarAreas() {
        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println("El área de la figura " + figura.getNombre() + " es: " + figura.calcularAreaFigura());
        }
    }
}



