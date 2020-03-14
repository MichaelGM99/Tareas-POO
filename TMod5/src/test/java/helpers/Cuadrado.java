package helpers;

/**
 *
 * @author Michael GM
 */
public class Cuadrado extends Formas {
    
    public Cuadrado(){
        establecerDibujar("Cuadrado");
        establecerColor("Morado"); 
        establecerArea(233);
    }

    @Override
    public String obtenerInformacionForma() {
        return "Informacion de Cuadrado";
    }
}
