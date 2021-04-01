
/**
 * veririfica sii un numero es capicua.
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercico1Capicua
{
   public String verNumCapicua(int numero){
       String respuesta;
       int primerDig = numero/100;
       int ultimoDig = numero%10;
       if(primerDig == ultimoDig){
           respuesta = numero +" si es capicua"; 
        }else{
            respuesta = numero+" no es capicua";
        }
        return respuesta;
    }
}
