import java.util.Scanner;

public class questão15 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int N1, N2, N3;
        int M, I, CA = 0;
        
        for(I = 0; I < 3; I++){
            
            CA++;
            System.out.println("Aluno " + CA + ", digite sua 1ª nota: ");
            N1 = ent.nextInt();
        
            System.out.println("Aluno " + CA+ ", digite sua 2ª nota: ");
            N2 = ent.nextInt();
            
            System.out.println("Aluno " + CA + ", digite sua 3ª nota: ");
            N3 = ent.nextInt();
            
            M = (N1 + N2 + N3) / 3;
            System.out.println("A média do aluno " + CA + " é " + M);
            
            if( (M >= 0) && (M <4) ){
                System.out.println("Nota, Reprovado!");
            } if((M >= 4) && (M <= 6) ){
                System.out.println("Nota Verificação Suplementar.");
            } else if(M > 6){
                System.out.println("Nota, Aprovado!");
            }
        }
    }
}