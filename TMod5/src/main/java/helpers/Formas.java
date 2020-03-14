package helpers;

public class Formas {
    //Atributos
    private String color;
    private String dibujar;
    
    //Constructor
    public Formas(){
        //VACIO
    }
    
    //Establecer y obtener
    public void establecerColor(String _color){
        this.color = _color;
    }
    
    public String obtenerColor(){
        return this.color;
    }
    
    //Establecer y obtener
    public void establecerDibujar(String _dibujar){
        this.dibujar = _dibujar;
    }
    
    public String obtenerDibujar(){
        return this.dibujar;
    }
}
