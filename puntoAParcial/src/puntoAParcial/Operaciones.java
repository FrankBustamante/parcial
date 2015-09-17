
package puntoAParcial;


public class Operaciones {
    double ra, cateto1, cateto2,  resultado, base, altura, lado;
    
    double calcularelradio(double ra){ 
        resultado = Math.PI * ra *ra;
        return resultado;
    }
    double calcularlahipotenusa(double cateto1, double cateto2){ 
        resultado =Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return resultado;
    }
    double areadelrectangulo(double base, double altura){ 
        resultado = base * altura;
        return resultado;
    }        
    double areadelcuadrado(double lado){ 
        resultado = lado * lado;
        return resultado;
}
    }
