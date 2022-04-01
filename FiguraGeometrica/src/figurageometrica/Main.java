package figurageometrica;

/**
 *
 * @author Ángel Cadenas
 */
public class Main {

    public static void main(String[] args) {
        Punto punto = new Punto(20, 30);

        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo(12.3, 67.1, 96.8, punto);
        Rectangulo rectangulo = new Rectangulo(15, 20, new Punto(5, 10));
        Cuadrado cuadrado = new Cuadrado();

        Rectangulo rectangulo2 = new Cuadrado(9); //Compila por el extends (la clase hija sí hereda de la padre)
        //Cuadrado cuadrado2 = new Rectangulo(); No compila porque la clase padre no puede heredar de la hija

        System.out.println("Area de rectangulo2: " + rectangulo2.area());

        Figura figuraCirculo = new Circulo(punto, 8d); //Instanciando con interfaz
        figuraCirculo.area();

        Figura figuraAleatoria = getFiguraAleatoria();
        System.out.println("Area de la figura aleatoria: " + figuraAleatoria.area());

    }

    //Método para polimorfismo
    public static Figura getFiguraAleatoria() {
        double aleatorio = Math.random() * 10;
        if (aleatorio < 2.5) {
            return new Circulo(new Punto(10, 15), 17d);
        } else if (aleatorio < 5) {
            return new Triangulo();
        } else if (aleatorio < 7.5) {
            return new Rectangulo();
        }
        return new Cuadrado();
    }
}
