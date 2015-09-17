
package capitulo4ej7;


public class Valores {
    int val1 , val2 ;
    String comp;
    
    String Comparar_peso(int val1 , int val2)
    {
        
        if(val1==val2){
            comp = "ambos datos son iguales";
        }
        else{
            if(val1>val2){
                comp =  "el primer dato es el mayor ";
            }
            else{
                comp =  "el primer dato es el menor ";
            }
        }
        return comp;
    }
    
}
