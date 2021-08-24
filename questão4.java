import javax.swing.JOptionPane;

public class questão4 {
    
    public static void main(String[] args) { 
        Produto produto new = Produto()

        produto.setN(JOptionPane.showInputDialog("Digite o nome do Produto: "));
        produto.setP(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peço do Produto: ")));
        produto.setQ(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Produto: ")));
    }

        private String N;
        private double P;
        private int Q;

        public Produto() {}

         public String getN(){
             return N;
         }

         public void setN(String N){
             this.N = N;
         }
         public double getP(){
             this.P = P;
         }

         public void setP(Double P){
             this.P = P;
         }

         public int getQ(){
             return Q;
         }

         public void setQ(int Q){
             this.Q = Q;
         }

         public String toString() {
             return "Produto [N*" + N + ", P*" + P + ", Q*" + Q +" ]";
         }
         public Double calcularValorTotal(){
             Double T = P * Q;

            if(Q <= 10){
                 return T;
            }else if(Q >= 11 && Q <= 20){
                 T = T - (T * 10) / 100;
             }else if (Q >= 21 && Q <= 50){
                 T = T - (T * 20) / 100;
            }else if (Q > 50){
                 T = T - (T * 50) / 100;
             }
             return T;
             System.out.println(produto.calcularValorTotal());
        }
}