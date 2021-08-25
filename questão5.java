import java.util.Scanner;

public class questão5 {
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número da tabuada");
        int A = in.nextInt();
        System.out.println("");
        {
        for(int B = 0; B <= 10; B++)
        System.out.println("* "+A+" X "+B+" = "+A*B+" *");
        
        }
        
    }
}