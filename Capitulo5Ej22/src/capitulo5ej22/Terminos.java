
package capitulo5ej22;

import java.util.ArrayList;


public class Terminos {
   
   
   ArrayList<Double> dato = new ArrayList();
   
   public void intagregar_dato(double data)
   {
    dato.add(data);
   }
   
   double sumar_dato()
   {
       double suma =0;
       for (int j = 0; j < dato.size() ; j++) {
           suma = suma + dato.get(j);
       }
     return suma;
   }
   
    double dato_negativo()
    {
       double valN =0;
       for (int j = 0; j < dato.size() ; j++)
       {
           if(dato.get(j) < 0)
           {
            valN++;
           }
       }
       
     return valN;
     }
   
     public void borrar_datos()
    {
        dato.clear();
    }
     
     double dato_positivo()
      {
       double valP =0;
       for (int j = 0; j < dato.size() ; j++) 
       {
           if(dato.get(j) > 0)
           {
            valP++;
           }        
       }
       return valP;
      } 
    
      double dato_cero()
      {
       double val0 =0;
       for (int j = 0;j < dato.size() ; j++) {
           if(dato.get(j) == 0)
           {
            val0++;
           }
       }
       return val0;
      }
     
}
