/*
 * Clase TriánguloRectángulo: Representa un triángulo rectángulo con atributos de cateto1, cateto2, hipotenusa y métodos relacionados.
 */
package poop4;

/**
 * La clase TriánguloRectángulo representa un triángulo rectángulo con atributos de cateto1, cateto2, hipotenusa y métodos relacionados.
 */
public class TrianguloRectangulo {
    double cateto1, cateto2, hipotenusa;

    // Constructor por defecto
    public TrianguloRectangulo() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param cateto1    La longitud del cateto 1.
     * @param cateto2    La longitud del cateto 2.
     * @param hipotenusa La longitud de la hipotenusa.
     */
    public TrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

    /**
     * Método para calcular y mostrar el área del triángulo rectángulo.
     *
     * @param cateto1 La longitud del cateto 1.
     * @param cateto2 La longitud del cateto 2.
     */
    public void area(double cateto1, double cateto2) {
        double Area = (cateto1 * cateto2) / 2;
        System.out.println("El área del triángulo rectángulo es de: " + Area + " unidades cuadradas.");
    }

    /**
     * Método para calcular y mostrar el perímetro del triángulo rectángulo.
     *
     * @param cateto1    La longitud del cateto 1.
     * @param cateto2    La longitud del cateto 2.
     * @param hipotenusa La longitud de la hipotenusa.
     */
    public void perimetro(double cateto1, double cateto2, double hipotenusa) {
        double Perimetro = cateto1 + cateto2 + hipotenusa;
        System.out.println("El perímetro del triángulo rectángulo es de: " + Perimetro + " unidades.");
    }

    /**
     * Método para calcular y mostrar el valor de la hipotenusa del triángulo rectángulo.
     *
     * @param cateto1 La longitud del cateto 1.
     * @param cateto2 La longitud del cateto 2.
     */
    public void hipotenusa(int cateto1, int cateto2) {
        double sum = (cateto1 * cateto1) + (cateto2 * cateto2);
        double Hipotenusa = (int) Math.sqrt(sum);
        System.out.println("La longitud de la hipotenusa es de: " + Hipotenusa + " unidades.");
    }

    /**
     * Devuelve una representación de cadena del triángulo rectángulo en un formato específico.
     *
     * @return Representación de cadena del triángulo rectángulo.
     */
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", hipotenusa=" + hipotenusa + '}';
    }
}
