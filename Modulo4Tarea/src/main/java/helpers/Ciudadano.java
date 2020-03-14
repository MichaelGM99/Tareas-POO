
package helpers;
//MICHAEL ALEJANDRO GUERRA MELENDEZ 201810010296
/**
 *
 * @author MICHAEL GUERRA M
 */
public class Ciudadano {
    //ESTABLECIENDO VARIABLES PRIVADAS
    private String Nombre;
    private int Edad;
    private int AExperencia;
    
    
    public Ciudadano (){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.AExperencia = AExperencia;
    }
    
    //ESTABLECER DATOS PR MEDIO DEL METODO PRINCIPAL 
    public void setNombre(String _nombre){
        this.Nombre = _nombre;
    }
    public void setEdad(int _edad){
        this.Edad = _edad;
    }
    
    public void setAExperencia(int _aExperencia){
        this.AExperencia = _aExperencia;
    }
    
    
    //METODOS PARA IMPRIMIR EL CONTENIDO DE VARIABLES PRIVADAS
    public String obtenerNombre(){
        return Nombre;
    }
    
    public int obtenerEdad(){
        return Edad;
    }
    
    public int obtenerAExperencia(){
        return AExperencia;
    }
}
