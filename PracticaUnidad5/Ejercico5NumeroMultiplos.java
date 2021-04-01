
/**
 * Verifica si son multiplos los datos que ingreasa el usuario
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercico5NumeroMultiplos
{
   public String calcularMultiplos(int num1,int num2){
       String respuesta="";
       
       if(num1 <= 2147483647){
        if(num2<=2147483647){
            int resp = num1%num2;
            if(resp == 0){
                respuesta="son parientes";
            }else{
                respuesta = "no son parientes";
            } 
            
        }
    }
    return respuesta;
    }
}
