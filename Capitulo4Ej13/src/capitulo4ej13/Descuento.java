
package capitulo4ej13;


public class Descuento {
    
         String COLOR;
          double PDES ;  
         
         double descuentoo(String COLOR)
         {
          double  VALCOMP=0, VALPAG;
          
        switch (COLOR) {
            case "verde":
                PDES = VALCOMP *10 / 100 ;
                break;
            case "amarillo":
                PDES = VALCOMP *25 / 100 ;
                break;
            case "azul":
                PDES = VALCOMP *50 / 100 ;
                break;
            case "rojo":
                PDES = VALCOMP ;
                break;
        }
       
        VALPAG =   VALCOMP - PDES;
        return VALPAG;
         }
    
}
