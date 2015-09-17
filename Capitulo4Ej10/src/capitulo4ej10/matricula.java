
package capitulo4ej10;


public class matricula {
     double aum=0 ,  valM = 50000 , pat;
       int est;   
      double valor_matricula(int est , double pat)
       {
             aum=0 ; valM = 50000 ;
       if(pat > 2000000 && est > 3){
            aum =  pat * 3 / 100;
           valM = valM + aum;
       }
       return valM;
       }
}
