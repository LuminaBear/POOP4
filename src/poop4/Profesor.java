/*
 * Clase Profesor: Representa un profesor con atributos de nombre, materia, nivel de estudio, edad y métodos relacionados.
 */
package poop4;

/**
 * La clase Profesor representa a un profesor con atributos como nombre, materia que enseña, nivel de estudio y edad, además de métodos relacionados.
 */
public class Profesor {
    String Nombre, Materia, NivEstudio;
    int Edad;

    // Constructor por defecto
    public Profesor() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param Nombre     El nombre del profesor.
     * @param Materia    La materia que enseña.
     * @param NivEstudio El nivel de estudio del profesor.
     * @param Edad       La edad del profesor.
     */
    public Profesor(String Nombre, String Materia, String NivEstudio, int Edad) {
        this.Nombre = Nombre;
        this.Materia = Materia;
        this.NivEstudio = NivEstudio;
        this.Edad = Edad;
    }
    
    // Métodos relacionados con las acciones de un profesor
    public void Trabajar() {
        System.out.println("Hora de ir al trabajo.");
    }
    
    public void Estudiar() {
        System.out.println("Leeré un poco sobre este tema.");
    }
    
    public void Comer() {
        System.out.println("Qué rica está la comida.");
    }
}

