package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Cuadrado extends Rectangulo {

    private double lado;

    public Cuadrado() {
        System.out.println("Cuadrado.Constructor sin parámetros");
        this.lado = 1d;
    }

    public Cuadrado(double lado) {
        System.out.println("Cuadrado.Constructor con parámetros");
        this.lado = lado;
    }

    @Override
    public Double area() {
        System.out.println("Cuadrado.area");
        return lado * lado;
    }

}
