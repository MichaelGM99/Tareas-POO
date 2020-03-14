package helpers;

/**
 *
 * @author Michael GM
 */
public class Linea extends Formas{
    
    public Linea(){
        establecerDibujar("Linea");
        establecerColor("Verde");
        establecerLargo(100);
    }

    @Override
    public String obtenerInformacionForma() {
        return "Informacion de Linea";
    }
              
}
