/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad2;

/**
 *
 * @author Lileth
 */
public abstract class FiguraGeometrica {

    private String nombre;

    // Constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso y manipulación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularAreaFigura();
    public abstract boolean esRegular();
    }


