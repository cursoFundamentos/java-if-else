
/**
 * modifica el mes de numero a literal.
 * 
 * @author (Chelo) 
 * @version (1.0)
 */
public class Ejercicio8MesLiteral
{
    public String modificarMesALiteral(int dia,int mes, int anio){
        String resp="";
        int enero=1, febrero=2,marzo=3, abril=4, mayo=5, junio=6, julio=7, agosto=8, septiembre=9, octubre=10, noviembre=11,diciembre=12 ;
        
        
        if(dia>=1 ){
            if(dia<=31){
                if(mes >= 1){
                    if(mes <= 12){
                        
                        if(anio>=1){
                          if(mes == enero){
                              resp = dia+" de enero de "+anio;                                        
                            }else{
                                if(mes == febrero){
                                    resp =dia+" de febrero de "+anio;
                                }else{
                                    if(mes == marzo){
                                       resp=  dia+" de marzo de "+anio;
                                    }else {
                                        if(mes == abril){
                                            resp = dia+" de abril de "+anio;
                                        }else{
                                            if(mes == mayo){
                                                resp = dia+" de mayo de "+anio;
                                            }else {
                                            if(mes == junio){
                                                resp = dia+" de Junio de "+anio;
                                            }else {
                                                if(mes == julio){
                                                    resp = dia+" de Julio de "+anio;
                                                }else {
                                                    if(mes == agosto){
                                                        resp = dia+" de agosto de "+anio;
                                                    }else{
                                                        if(mes == septiembre){
                                                            resp = dia+" de septiembre de "+anio;
                                                        }else{
                                                            if(mes == octubre ){
                                                                resp = dia+" de octubre de "+anio;
                                                            }else {
                                                                if(mes == noviembre){
                                                                    resp = dia+" de noviembre de "+anio;
                                                                }else{
                                                                    if(mes == diciembre){
                                                                        resp = dia+" de diciembre de "+anio;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                          }  
                                        }
                                    }
                                }
                            }
                        }else{
                            resp ="para anio ingrese valores mayores a 1 ";
                        }

                    }else{
                        resp ="para el mes ingrese valores de 1 al 12";
                    }
                }else{
                    resp ="para el mes ingrese valores de 1 al 12";
                }
            }else{
                resp ="para la fecha ingrese valores de 1 al 31";
            }
        }else{
            resp ="para la fecha ingrese valores de 1 al 31";
        }
        return resp; 
    }
}
