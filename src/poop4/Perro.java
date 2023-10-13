/*
 * Clase Perro: Representa un perro con atributos de nombre, raza, color, edad y métodos relacionados.
 */
package poop4;

/**
 * La clase Perro representa a un perro con atributos como nombre, raza, color, edad y métodos relacionados.
 */
public class Perro {
    String Nombre, raza, color;
    int edad;

    // Constructor por defecto
    public Perro() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param Nombre El nombre del perro.
     * @param raza   La raza del perro.
     * @param color  El color del perro.
     * @param edad   La edad del perro.
     */
    public Perro(String Nombre, String raza, String color, int edad) {
        this.Nombre = Nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    // Métodos relacionados con las acciones de un perro
    public void sentado() {
        System.out.println("Sentado");
    }
    
    public void ladra(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau");
        }
    }
    
    public void corre(int distancia) {
        System.out.println("Corrió " + distancia + " metros");
    }
    
    public void duerme(int horas) {
        System.out.println("Durmió " + horas + " horas");
    }

    /**
     * Devuelve una representación de cadena del perro en un formato específico.
     *
     * @return Representación de cadena del perro.
     */
    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
}

