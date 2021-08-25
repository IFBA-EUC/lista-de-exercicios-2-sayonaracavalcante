import java.util.Scanner;

public class questão8 {
    static long fibo(int N){
        if (N < 2){
            return N;
        } else {
            return fibo (N - 1) + fibo(N - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = input.nextInt();
        for (int I = 0; I < N; I++){
            System.out.print(questão8.fibo(I) + ", \t");
        }
    }
}
