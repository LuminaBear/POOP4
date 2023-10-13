/*
 * Clase Punto: Representa un punto en un plano cartesiano con coordenadas (x, y) y un método para imprimir el punto.
 */
package poop4;

/**
 * La clase Punto representa un punto en un plano cartesiano con coordenadas (x, y) y un método para imprimir el punto.
 */
public class Punto {
    public int x, y;

    // Constructor por defecto
    public Punto() {
    }
    
    /**
     * Constructor con argumentos.
     *
     * @param x Coordenada en el eje x.
     * @param y Coordenada en el eje y.
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Método para imprimir las coordenadas del punto (x, y).
     * (Este método se vuelve deprecado al implementar el método toString())
     *
     * @param x Coordenada en el eje x.
     * @param y Coordenada en el eje y.
     */
    public void imprimirPunto(int x, int y) {
        System.out.println("(x, y) = (" + x + ", " + y + ")");
    }

    /**
     * Devuelve una representación de cadena del punto en un formato específico.
     *
     * @return Representación de cadena del punto.
     */
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}

    