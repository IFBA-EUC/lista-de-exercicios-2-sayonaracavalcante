import java.util.Scanner;
public class questão16 {
    public static void main(String[] args) {
        double S = pedirsegundos();
        double M = calcmin(S);
        double H = hora(M);
        
        System.out.print("Os segundos introduzidos em horas é" + H + " : " + M + " : " + S);
    }
    
    public static double pedirsegundos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira os segundos ");
        int SEG = teclado.nextInt();
        return SEG;
    }
    public static double calcmin(double MIN) {
        return (MIN / 60);
    }
    public static double hora(double MIN2) {
        return (MIN2 / 60);
    }
}