
package capitulo4ej9;


public class Valores {
    int A , Y , B , C , X;
    int calcular( int A ,int Y , int B , int C)
    {   
     int X;
     if(Y<A && (A<B && B<C)){
            X=0;
        }
        else if(A<=Y && Y<B){
            X=1;
        }
        else if(B<=Y && Y<C){
            X=2;
        }
        else if(C<=Y){
            X=3;
        }
        else{
            X=4;
        }
     
     return X;
    }
}
