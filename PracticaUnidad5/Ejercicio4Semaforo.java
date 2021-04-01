
/**
 * Write a description of class semaforo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio4Semaforo
{
    public String verificarColor(String estadoColor, int cambio){

        String resp;
        int verde        = 0;
        int anaranjado   = 1; 
        int rojo         = 2;
        int estadoActual;
        if(estadoColor.equals("verde")){
            estadoActual = 0;
        }else{
            if(estadoColor.equals("amarillo")){
                estadoActual = 1;
            }else{
                estadoActual = 2; 
            }
        }
        int estadoFinal = (estadoActual+cambio) %3;
        if (estadoFinal == 0 ){
            resp = "verde";
        }else{
            if(estadoFinal==1){
                resp = "amarillo";
            }else {
                resp = "rojo"; 
            }
        }
        
        return resp;
    }
}
