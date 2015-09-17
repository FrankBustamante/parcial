/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4ej15;

/**
 *
 * @author Linda Charris
 */
public class Pesos {
     double PESOA, PESOB, PESOC, PESOD, PESO;
     String pesos ;
     String comparar(double PESOA , double PESOB , double PESOC , double  PESOD)
     {
         if (PESOA == PESOB && PESOA ==PESOC && PESOA ==PESOD)
             {
                  pesos="todas las esferas son de igual peso";
             }
         else
         {
    if (PESOA == PESOB && PESOA ==PESOC){
            
            if (PESOD > PESOA){
         pesos="La esfera D es la diferente y es de mayor peso";
            }
            else {
            pesos="La esfera D es la diferente y es la de menor peso";
              }
                 
        }
          else if (PESOA == PESOB && PESOA ==PESOD){
                        
          if (PESOC > PESOA){
                            pesos="La esfera C es la diferente Y es de mayor peso";
                              }
                               else {
                                       pesos="La esfera C es la diferente Y es de menor peso";        
                                     }
                      }
        
                      else   if (PESOA == PESOC && PESOA == PESOD){
                  
                    if (PESOB > PESOD) {
                       pesos="La esfera B es la diferente Y es de mayor peso";
                         }
                   else {
               pesos="La esfera B es la diferente Y es de menor peso";
                    }
                 
            }
                else {
             
                if (PESOA > PESOB ){
                     pesos="La esfera A es la diferente Y es de mayor peso";
                } 
                else {
                 pesos="La esfera A es la diferente Y es de menor peso";
                }
                      }
         }
    return pesos;
     }
}
