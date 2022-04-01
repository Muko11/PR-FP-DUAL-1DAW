package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Circulo implements Figura {

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

    public Double area() {
        System.out.println("Circulo.area");
        return Math.PI * Math.pow(this.radio, 2);
    }

    public void pintar() {
        System.out.println("Circulo.pintar");
    }

    public void mover() {
        System.out.println("Circulo.mover");
    }
}
