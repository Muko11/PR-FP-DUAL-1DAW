package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public abstract class FiguraAbstracta implements Figura {

    @Override
    public void pintar() {
        System.out.println("FiguraAbstracta.pintar");
    }

    @Override
    public void mover() {
        System.out.println("FiguraAbstracta.mover");
    }

}
