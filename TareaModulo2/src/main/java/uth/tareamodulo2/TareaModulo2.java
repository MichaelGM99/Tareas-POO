package uth.tareamodulo2;

public class TareaModulo2 {

    public static void main(String[] args) {   
        Recursos recursos = new Recursos();
        recursos.Mensaje();
        recursos.Nota(69);
        recursos.Division(10,5);
        recursos.Numeros(10);
    }

    public static class Recursos{
        
        public void Mensaje(){
            System.out.println("Estoy Aprendiendo, pero sere el muejor programador del mundo");
            System.out.println("\n");
        } 
        
        public void Nota(int nota){
            if(nota>=70){
                System.out.println("Su nota es: "+nota+"  Aprobado");
                System.out.println("\n");
            }
            else{
                System.out.println("Su nota es: "+nota+"  Reprobado");
                System.out.println("\n");
            }
        }
        
        public void Division(int x, int y){
            int resultado=0;
            
            if(y !=0){
              resultado=(x/y);   
            }else{
                System.out.println("Indefinido");
            }
            System.out.println("La division de "+x+" / "+y+" = "+resultado+"\n");
        }
        
        public void Numeros(int variable){
            System.out.println("Impresion de numeros del 1 al "+ variable+"\n");
            for(int i=1; i<=variable;i++){
                System.out.println(i+"\n");
            }
        }
    }
}
