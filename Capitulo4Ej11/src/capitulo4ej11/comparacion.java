
package capitulo4ej11;


public class comparacion {
    int N1 , N2 , N3;
    String texto;
    
    String Comparar_valores(int N1 ,int N2 ,int N3)
    {
     if(N1 == N2 && N1 == N3)
        {
            texto=" todos los valores son iguales";
        }
        else{
             if(N1 == N2)
                       {
                           texto=" los primeros valores son iguales ";
                       }
        else if(N1 == N3)
        {
             texto=" el primer valor y el ultimo son iguales ";  
        }
        else if(N3==N2)
        {
            texto=" el segundo valor y el tercero son iguales ";  
        }
        else{
        
        if(N1 > N2 && N1 > N3){
           texto=N1+" Es el mayor de todos";
        }
        else if(N2 > N1 && N2 > N3){
            texto=N2+" Es el mayor de todos";
        }
        else{
          texto=N3+" Es el mayor de todos";
        }
        
        }
        }
     return texto;
    }

    
}
