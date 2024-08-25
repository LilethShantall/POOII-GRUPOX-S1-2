/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s1actividad1;

/**
 *
 * @author Lileth
 */
public class Circulo {
    private double radio;
    private String color;

    // Constructor por defecto
    public Circulo() {
        this.radio = 12.5;
        this.color = "azul";
    }

    // Constructor sobrecargado
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "azul";  // Color por defecto
    }

    // Métodos getter y setter
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular el área
    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }

    // Método toString para representar el objeto en forma de cadena
    @Override
    public String toString() {
        return "Círculo [radio=" + radio + ", color=" + color + ", área=" + getArea() + "]";
    }
}

