
package capitulo5ej16;

/**
 *
 * @author Linda Charris
 */
public class Suma {
    int suma,limit;
    
    int calculo_suma(int limit)
    {
        suma = 0;
        int i , n=0;
        for(i=1 ; i<=limit ; i++ ){
            n = n + 1; 
            suma = suma + n;
        }
        return suma;
    }
}
