import java.util.Scanner;

public class questão1 {
    public static void main(String[] args) {
        float A, B, C,
        D,
        D2,
        R1,R2;

        Scanner input = new Scanner (System.in);

    System.out.println ("Equação do 2º grau: ax² + bx + c = 0");
    System.out.print ("Digite o valor de a: ");
    A = input.nextFloat();
    System.out.print ("Digite o valor de b: ");
    B = input.nextFloat();
    System.out.print ("Digite o valor de c: ");
    C = input.nextFloat();
    if(A != 0){
    D = (B*B) - (4*A*C);
    D2 = (float)Math.sqrt(D);
    
             if(D >=0){
                 R1 = ((-1)*B + D2)/(2*A);
                 R2 = ((-1)*B - D2)/(2*A);
                 System.out.printf("Raízes: %.2f e %.2f", R1, R2);
             }
             else{
                 D = -D;
                 D2 = (float)Math.sqrt(D);
                 System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-B)/(2*A), (D2)/(2*A));
                 System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-B)/(2*A), (D2)/(2*A));
              
            }
            
        }
         else{
            System.out.println("Coeficiente 'A' inválido. Não corresponde a uma equação do 2º grau");
         }
        
    }
}
