
/**
 * calcula el costo de tres productos y selecciona los dos menores .
 * 
 * @author (chelo) 
 * @version (1.0)
 */
public class Ejercicio2EvaluarCostoMinimo
{
   public int evaluarCostosMenores(int costo1,int costo2,int costo3){
       int respuesta ;
       int suma1= costo1+costo2;
       int suma2 = costo1+costo3;
       int suma3 = costo2 +costo3;
       if(suma1 <= suma2){
           if(suma1 <= suma3){
               respuesta = suma1;
            }else{
                respuesta = suma3;
            }
        }else{
            if(suma2 <= suma3){
                respuesta = suma2;
            }else {
                respuesta = suma3;
           }
        }
        return respuesta ;
    }
   
}
