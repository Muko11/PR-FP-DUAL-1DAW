package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Circulo extends FiguraAbstracta {

    private Punto centro;
    private Double radio;

    public Circulo() {
        this.centro = new Punto(10, 10);
        this.radio = 1d;
    }

    public Circulo(Punto centro, Double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public Double area() {
        System.out.println("Circulo.area");
        return Math.PI * Math.pow(this.radio, 2);
    }

}
