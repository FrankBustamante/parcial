
package capitulo4ej12;


public class Salario {
    double numH, ValorH, Gana=0 ;
    
    double salario_final(double numH, double ValorH)
    {
        double nHe , nHe8;
        
     if (numH > 40)
   {
       Gana = Gana + 40 * ValorH;
       nHe = numH - 40;
       
       if(nHe >8)
       {
         nHe8 = nHe -8; 
         Gana = Gana + nHe8 * 3 * ValorH;
         Gana = Gana + 16 * ValorH;
       }
       else
       {
           Gana = Gana + nHe * 2 * ValorH;
       }
   }
   else
   {
       Gana = Gana + numH * ValorH;
   }
     return Gana;
    }
}
