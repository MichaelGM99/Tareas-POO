
import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author Michael GM
 */
public class TareaMod5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(circulo.obtenerInformacionForma());
        circulo.imprimirInformacionCirculo();
        System.out.println("\n");
        
        System.out.println(linea.obtenerInformacionForma());
        linea.imprimirInformacionLinea();
        System.out.println("\n");
        
        System.out.println(triangulo.obtenerInformacionForma());
        triangulo.imprimirInformacionTriangulo();
        System.out.println("\n");
        
        System.out.println(cuadrado.obtenerInformacionForma());
        cuadrado.imprimirInformacionCuadrado();
        
    }
    
    
    
}
