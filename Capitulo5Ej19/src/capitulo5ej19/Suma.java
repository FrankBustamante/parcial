
package capitulo5ej19;

import java.util.ArrayList;


public class Suma {
   ArrayList<Double> dato = new ArrayList();
   
   public void agregar_datos(double data)
   {
       dato.add(data);
   }
   
   public void borrar_datos()
   {
       dato.clear();
   }
   
   public double sumar()
   {
       double suma=0;
       for (int i = 0; i < dato.size(); i++) {
           suma = suma + dato.get(i);
         }
    
       return suma;
   }
   
   public double promedio(double suma)
   {
    double prom = 0;
       prom = suma / dato.size();
       
       return prom;
   }
   
}
