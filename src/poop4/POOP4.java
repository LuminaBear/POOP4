/*
 * Clase POOP4: Contiene el método principal (main) para probar las clases Punto, Perro, Coche, TrianguloRectangulo, Alumno y Profesor.
 */
package poop4;

/**
 * La clase POOP4 contiene el método principal (main) para probar las clases Punto, Perro, Coche, TrianguloRectangulo, Alumno y Profesor.
 */
public class POOP4 {

    /**
     * Método principal (main) para probar las clases y sus funcionalidades.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        
        //Punto ---------------------------------
        Punto punto = new Punto();
        punto.imprimirPunto(0, 0);
        Punto punto2 = new Punto(10, 6);
        punto2.imprimirPunto(10, 6);
        System.out.println(punto);
        
        //Perro ---------------------------------
        Perro perrito = new Perro("Lola", "Labrador", "Cafe", 3);
        
        System.out.println(perrito);
        
        perrito.corre(100);
        perrito.duerme(2);
        perrito.ladra(10);
        perrito.sentado();
        
        //Coche ---------------------------------
        Coche carcachita = new Coche("Chevrolete", "Camaro", "Amarillo", "V6", "De la roja paps");
        
        System.out.println(carcachita);
        String direccion = "derecha";
        
        carcachita.encender();
        carcachita.acelerar();
        carcachita.frenar();
        carcachita.girar(direccion);
        carcachita.frenar();
        carcachita.apagar();
        
        //TrianguloRectangulo -------------------
        TrianguloRectangulo tri = new TrianguloRectangulo(3, 4, 5);
        
        System.out.println(tri);
        
        tri.area(3, 4);
        tri.perimetro(3, 4, 5);
        tri.hipotenusa(10, 4);
        
        //Alumno --------------------------------
        Alumno alumno1 = new Alumno("Jorge", "3", "Mixto", 18, 170);
        
        System.out.println(alumno1);
        
        alumno1.estudiar();
        alumno1.leer();
        alumno1.dormir(5);
        
        //Profesor ------------------------------
        Profesor prof1 = new Profesor("Manuel", "Español", "Licenciatura", 30);
        
        System.out.println(prof1);
        
        prof1.Trabajar();
        prof1.Estudiar();
        prof1.Comer();
    }   
}
