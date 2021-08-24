import java.util.Scanner;

public class questão2 {
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        Distancia Dis = new Distancia();   
        System.out.println("Digite os 1º pontos: "); 
        int X1 = input.nextInt(); 
        int X2 = input.nextInt(); 
        System.out.println("Digite os 2º pontos: "); 
        int Y1 = input.nextInt(); 
        int Y2 = input.nextInt();
        System.out.println("Digite os 3º pontos: "); 
        int Z1 = input.nextInt(); 
        int Z2 = input.nextInt();

        System.out.printf("Distancia = %.2f", Dis.distancia(X1, X2, Y1, Y2, Z1, Z2));
    }

    public class Distancia { 
        
        public double distancia(int X1, int X2, int Y1, int Y2, int Z1, int Z2) {

            double A = Math.pow((X2 - X1), 2); 
            double B = Math.pow((Y2 - Y1), 2); 
            double C = Math.pow((Z2 - Z1), 2); 
            double S = A + B + C; 
            double raiz = Math.sqrt(S); 
            return raiz;
        }
    }
}


