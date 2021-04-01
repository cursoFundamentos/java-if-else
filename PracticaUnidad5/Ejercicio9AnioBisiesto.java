
/**
 * evalua si es un anio bisiesto.
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio9AnioBisiesto
{
   public String evaluarAnioBisiesto(int anio){
    String resp="";
    if(anio % 4 == 0){
        if(anio % 100 != 0 ){
        
            resp ="el anio "+anio+" es bisiesto";
        }else{
        
            if(anio % 400 == 0){
                
                resp ="el anio "+anio+" es bisiesto";
            }else{
                 resp ="el anio "+anio+" no es bisiesto";
            }
        }
    
    }else{
        resp ="el anio "+anio+" no es bisiesto";
    }
    return resp;
    }
}
