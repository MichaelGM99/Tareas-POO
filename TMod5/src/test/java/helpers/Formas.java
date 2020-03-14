package helpers;

/**
 *
 * @author Michael GM
 */
public abstract class Formas {
    //Atributos
    private String color;
    private String dibujar;
    private double radio;
    private double largo;
    private double angulo;
    private double area;
    
    //CONSTRUCTOR
    public Formas(){
        //Vacio
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
    
    
    //Calculo de Radio
    public void establecerRadio(double _numero){
        this.radio = _numero;    
    }
    
    public double obtenerRadio(){
        return radio;
    }    
    //Establecer Largo
    public void establecerLargo (double _linea){
        this.largo = _linea;    
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    //Establecer Angulo
    public void establecerAngulo (double _angulo){
        this.angulo = _angulo;    
    }
    
    public double obtenerAngulo(){
        return angulo;
    }
    
    //Establecer Areae
    public void establecerArea (double _area){
        this.area = _area;    
    }
    
    public double obtenerArea(){
        return area;
    }
    
    //Objeto Abstrato
    
    public abstract String obtenerInformacionForma();
    
    //IMPRIMIR
    
     public void imprimirInformacionCirculo(){
        System.out.println("Forma: " + dibujar);
        System.out.println("Color: " + color);
        System.out.println("Radio: " + radio);
    }
     
    public void imprimirInformacionLinea(){
        System.out.println("Forma: " + dibujar);
        System.out.println("Color: " + color);
        System.out.println("Largo en cm: " + largo);
    }
    public void imprimirInformacionTriangulo(){
        System.out.println("Forma: " + dibujar);
        System.out.println("Color: " + color);
        System.out.println("Angulo: " + angulo);
    }
    
    public void imprimirInformacionCuadrado(){
        System.out.println("Forma: " + dibujar);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
     
}
