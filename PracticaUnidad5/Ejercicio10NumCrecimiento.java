
/**
 * verifica si un numero esta en crecimiento 
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio10NumCrecimiento
{
    public String verificarNum(int numero){
        String respuesta="ingrese valores con tres digitos";
        if (numero > 9)
        {
            if(numero<= 999){
                int resCociente1 = numero/10;//45
                int resResto1 = numero % 10;//8

                int resCociente2 = resCociente1/10;//4
                int resResto2 = resCociente1%10;//5

                //pasando valores a+b+c=resCociente2+resResto2+resResto1
                int a = resCociente2;
                int b = resResto2;
                int c = resResto1;

                //comparo valores
                if (a<=b){
                    if(b<=c){
                        respuesta = "Es un numero en crecimiento";
                    }else {
                        respuesta = "no es numero en crecimiento";
                    }
                }

            }else {
                respuesta = " Ingrese valores menores a 1000";
            }
        }else {
            respuesta ="ingrese valores mayor a 9";
        }
        return respuesta;
    } 
}
