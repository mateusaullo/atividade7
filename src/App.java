import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double quadrado,resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o valor do quadrado: ");
        quadrado = teclado.nextDouble();
        teclado.close();

        resultado = (quadrado * quadrado) *2;

        System.out.printf("O valor do dobro da area do quadrado eh: %.0f",resultado);
    }
}
