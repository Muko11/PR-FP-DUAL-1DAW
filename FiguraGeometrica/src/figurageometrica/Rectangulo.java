package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Rectangulo implements Figura {

    private double alto;
    private double ancho;
    private Punto punto;

    public Rectangulo() {
        System.out.println("Rectangulo.Constructor sin parámetros");
        this.alto = 1d;
        this.ancho = 1.3;
        this.punto = new Punto(0, 0);
    }

    public Rectangulo(double alto, double ancho, Punto punto) {
        super();
        System.out.println("Rectangulo.Constructor con parámetros");
        this.alto = alto;
        this.ancho = ancho;
        this.punto = punto;
    }

    @Override
    public Double area() {
        System.out.println("Rectangulo.area");
        return this.alto * this.ancho;
    }

    @Override
    public void pintar() {
        System.out.println("Rectangulo.pintar");
    }

    @Override
    public void mover() {
        System.out.println("Rectangulo.mover");
    }

}
