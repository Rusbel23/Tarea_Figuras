import Clases.Circulo;
import Clases.Figura;
import Clases.Rectangulo;
import Clases.Triangulo;
public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(4, 7);
        Figura circulo = new Circulo(3);

        System.out.println("            ♦ Área de la Figuras ♦");
        System.out.println("------------------------------------");
        System.out.println("    -> Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("------------------------------------");
        System.out.println("    -> Área del triángulo: " + triangulo.calcularArea());
        System.out.println("------------------------------------");
        System.out.println("    -> Área del círculo: " + circulo.calcularArea());
    }
}