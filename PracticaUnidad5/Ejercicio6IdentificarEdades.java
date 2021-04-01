
/**
 * identificar las edades de tres individuos
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio6IdentificarEdades
{
   public String identificarEdad(String nombre1,int edad1,String nombre2,int edad2,String nombre3, int edad3)
   {
       String respuesta="";//30   20 10    30  20 40    10 20 11    10 20  30   10   20   9  10 20 30
         String respuesta2="";
       String repuesta3="";
       if( edad1 > edad2 ){
           if(edad1> edad3){
               if(edad2 > edad3){
                   respuesta ="el hernmano mayor es " +nombre1 + " El hermano del medio es "+nombre2 + " el hermano menor es "+nombre3;       
                }else{
                    respuesta ="el hermano mayor es " +nombre1 +" El hermano del medio es "+nombre3+ " el hermano menor es "+nombre2;
                }
              }else {
                if(edad1 > edad2){
                    respuesta= "El hemano mayor es "+nombre3+ " el hermano medio es "+nombre1+ " el hermano menor es "+nombre2;
                    }else {
                        respuesta= "El hemano mayor es "+nombre3+ " el hermano medio es "+nombre2+ " el hermano menor es "+nombre1;
                    }
                }
            }else{
                if(edad2 > edad3){
                    if(edad1> edad3){
                        respuesta = "El mayor es "+ nombre2+ " el hermano de medio es "+nombre1+ " el hermano menor es "+ nombre3;
                    }else {
                        respuesta = "El mayor es "+ nombre2+ " el hermano de medio es "+nombre3+ " el hermano menor es "+ nombre1;
                    }
                }else {
                    if(edad1 > edad2){
                        respuesta = "El mayor es "+nombre3+" el hermano medio es "+ nombre1+" el hermano menor es " + nombre2;
                    }else{
                        respuesta = "El mayor es "+nombre3+" el hermano medio es "+ nombre2+" el hermano menor es " + nombre1 ;
                    }
            }
        }
      
       return respuesta;
       
    }
}
