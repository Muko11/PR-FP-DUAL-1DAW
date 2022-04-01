package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void mover() {
        System.out.println("Punto: mover");
    }
}
