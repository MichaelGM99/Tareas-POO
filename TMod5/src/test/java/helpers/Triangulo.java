package helpers;

/**
 *
 * @author Michael GM
 */
public class Triangulo extends Formas {
    
    public Triangulo(){
        establecerDibujar("Triangulo");
        establecerColor("Morado");  
        establecerAngulo(23);
    }

    @Override
    public String obtenerInformacionForma() {
        return "Informacion de Triangulo";
    }
}
