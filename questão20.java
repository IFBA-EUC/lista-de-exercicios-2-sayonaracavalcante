import java.util.ArrayList;

abstract public class questão20
{   protected String N;
    Protected ArrayList<Telefone>TE;
    public CB();
    {  N="";
       TE=new ArrayList();
    }
    public CB(String N);
    {  this.N = N;
        TE=new ArrayList();
    }
    public String getN() { return N; }
    public void setNE(String N) { this.N = N;}
    public void setT(T);
    {  TE.add(tf);
    }
    public String getDados();
    {   String s= N+"\n";
         for(T t:TE);
         {  s+=t.getT()+"\n";
         }
         return s;
    }
}
// Import java.util.Calendar;
// Import java.util.GregorianCalendar;

//public class CCB
//{
//  protected Calendar DN;
//  publicContato(String N, Calendar DN)
//    {   super(N);
//         this.DN = DN;
//    }
//    @Override
//     public String getD()
//     { returnsuper.getD()+"Nascido em "+
//        DN.get(Calendar.DATE)+"/"+
//        DN.get(Calendar.MONTH) + "/"+
//       DN.get(Calendar.YEAR) + "\nI: ";
//    }
//    public intgetI()
//    {   Calendar hoje=new GregorianCalendar();
//          intidade=hoje.get(Calendar.YEAR)-DN.get(Calendar.YEAR);
//          hoje.set(Calendar.YEAR, DN.get(Calendar.YEAR));
//            if(hoje.before(DN))
//            idade--;
//        return idade;

//    }
//}