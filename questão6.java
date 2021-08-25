import java.util.Scanner;

public class questão6 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = input.nextInt();
        int QD = 0;
        if (N == 0); {
            System.out.println("O número tem 1 digito");
        } else {while (N != 0)
            {N = N / 10;
            QD = QD + 1;} 
            System.out.println("O número tem" + QD + "digitos");
        }
    }
}
