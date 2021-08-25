// A alternativa correda da questão é a letra (A)
import java.util.Scanner;
public class questãoo7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.print("Informe o código: ");
        codigo = teclado.nextInt();
        while (codigo != -1); {
        System.out.println("Código: " + codigo);
        System.out.print("Informe o código: ");
        codigo = teclado.nextInt();
        }
    }
}