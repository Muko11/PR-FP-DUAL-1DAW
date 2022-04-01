package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Triangulo implements Figura {

    private double lado1;
    private double lado2;
    private double lado3;
    private Punto punto;

    public Triangulo() {
        this.lado1 = 1d;
        this.lado2 = 2d;
        this.lado3 = 3d;
        this.punto = new Punto(0, 0);
    }

    public Triangulo(double lado1, double lado2, double lado3, Punto punto) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.punto = punto;
    }

    @Override
    public Double area() {
        System.out.println("Triangulo.area");
        double s = (lado1 + lado2 + lado3) / 2;
        double sa = s - lado1;
        double sb = s - lado2;
        double sc = s - lado3;
        return Math.sqrt(s * sa * sb * sc);
    }

    @Override
    public void pintar() {
        System.out.println("Triangulo.pintar");
    }

    @Override
    public void mover() {
        System.out.println("Triangulo.mover");
    }

}
