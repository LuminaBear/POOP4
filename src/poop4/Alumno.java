/*
 * Clase Alumno: Representa un estudiante con atributos de nombre, grado, turno, edad, estatura y métodos relacionados.
 */
package poop4;

/**
 * La clase Alumno representa a un estudiante con atributos como nombre, grado, turno, edad, estatura y métodos relacionados.
 */
public class Alumno {
    String Nombre, Grado, Turno;
    int Edad, Estatura;

    // Constructor por defecto
    public Alumno() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param Nombre    El nombre del estudiante.
     * @param Grado     El grado o nivel de estudios del estudiante.
     * @param Turno     El turno en el que estudia el estudiante.
     * @param Edad      La edad del estudiante.
     * @param Estatura  La estatura del estudiante en centímetros.
     */
    public Alumno(String Nombre, String Grado, String Turno, int Edad, int Estatura) {
        this.Nombre = Nombre;
        this.Grado = Grado;
        this.Turno = Turno;
        this.Edad = Edad;
        this.Estatura = Estatura;
    }
    
    // Métodos relacionados con las acciones de un estudiante
    public void estudiar() {
        System.out.println("Hora de estudiar");
    }
    
    public void leer() {
        System.out.println("Estoy leyendo");
    }
    
    public void dormir(int horas) {
        for (int i = 0; i < horas; i++) {
            System.out.println("hora " + (i + 1) + ": ZzZ");
        }
    }

    /**
     * Devuelve una representación de cadena del estudiante en un formato específico.
     *
     * @return Representación de cadena del estudiante.
     */
    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Grado=" + Grado + ", Turno=" + Turno + ", Edad=" + Edad + ", Estatura=" + Estatura + '}';
    }
}
