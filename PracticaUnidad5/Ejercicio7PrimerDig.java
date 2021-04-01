
/**
 * halla el primer digito de un numero de tres digitos.
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio7PrimerDig
{
   public int hallarPrimerDigito(int numero){
       int respuesta = 0;
    
        if(numero >= 100){
            if(numero<=999){
                numero = numero/100;
                respuesta = numero;
            }
        }
        return respuesta;
    }
}
