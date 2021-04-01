
/**
 * verifica si una unidad o decimal esta formado por par o impar.
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio3Dariel
{
  public String verificarDecimal(int numero){
    String respuesta="" ;
    if(numero<10){
        int resp = numero%2;
        if(resp == 0){
            respuesta = "normal";
        }else{
            respuesta = "dia cruz de Dariel";
        }
    }else{
        if(numero <= 31){
            int respuesta1 = numero/10;
            int respuesta2 = numero %10;
            if(respuesta1 % 2 == 0){
                if(respuesta2 % 2 ==0){
                    respuesta ="dia Normal";
                }else {
                    respuesta = "dia cruz de dariel";
                }
            }else {
                    if(respuesta2%2 == 0)
                    {
                        respuesta = "dia Cruz de Dariel";
                    }else {
                        respuesta = "dia normal";
                    }
            }
        
        }
    }
    return respuesta;
    }
}
