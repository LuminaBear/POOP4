/*
 * Clase Coche: Representa un vehículo con atributos de marca, modelo, color, motor, combustible y métodos relacionados.
 */
package poop4;

/**
 * La clase Coche representa un vehículo con atributos como marca, modelo, color, motor, combustible y métodos relacionados.
 */
public class Coche {
    String marca, modelo, color, motor, combustible;

    // Constructor por defecto
    public Coche() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param marca       La marca del coche.
     * @param modelo      El modelo del coche.
     * @param color       El color del coche.
     * @param motor       El tipo de motor del coche.
     * @param combustible El tipo de combustible que utiliza el coche.
     */
    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    
    // Métodos relacionados con las acciones de un coche
    public void acelerar() {
        System.out.println("Avanzando");
    }
    
    public void frenar() {
        System.out.println("Frenando");
    }
    
    public void reversa() {
        System.out.println("Retrocediendo");
    }
    
    public void encender() {
        System.out.println("Encendido");
    }
    
    public void apagar() {
        System.out.println("Apagando");
    }
    
    public void girar(String dir) {
        System.out.println("El coche gira a la " + dir);
    }

    /**
     * Devuelve una representación de cadena del coche en un formato específico.
     *
     * @return Representación de cadena del coche.
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }
}
