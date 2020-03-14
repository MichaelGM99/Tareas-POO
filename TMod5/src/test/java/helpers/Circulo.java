package helpers;

/**
 *
 * @author Michael GM
 */
public class Circulo extends Formas {
    public Circulo(){
        establecerDibujar("Circulo");
        establecerColor("Azul");
        establecerRadio(23);
    }

    @Override
    public String obtenerInformacionForma() {
        return "Informacion de Circulo";
    }
}
