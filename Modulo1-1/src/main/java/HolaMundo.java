
package uth.ejerciciosmodulo1;


public class HolaMundo {
    
    //Hola Mundo
   
        public static void main(String[] args) {
     System.out.println("Mi Nombre\n");
        System.out.println("Michael Guerra Melendez");
        System.out.println("\n");

    //Operaciones
    System.out.println("Operaciones Matematicas\n");
        double num1=5;
        double num2=10;
        double suma,resta,multiplicacion,division=0;
        
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        
        if(num2 != 0){
            division=num1/num2;
        }
        
        System.out.println("La suma es "+ suma);
        System.out.println("La resta es "+ resta);
        System.out.println("La multiplicacion es "+ multiplicacion);
        System.out.println("La division es "+ division); 
        System.out.println("\n");

    //Comparacion con Boolean
    System.out.println("Comparacion con Boolean\n");
       int M=6,T=1,K=-10;
       
        boolean comparador=M>T;
        System.out.println(M +" ES MAYOR QUE "+T+"?\n"+comparador);
        System.out.println("\n");
    
    //Arreglo Impresion
    System.out.println("Imprimir Arreglo\n");
        String[]nombre={
        "Jahaciel Adali \n","Javier Alonso \n","Jose Yovany\n","Juan Carlos\n","Allison Faviola\n","Yerti Estefany\n","Jose Daniel\n","Isua Monserrat\n","Edith Maclavo\n","Josue Ely\n"
        };
        for(int i=0; i<=9;i++){
        System.out.println(nombre[i]);
    }
    
    //Arreglo Bidimencional
    System.out.println("Arreglo Bidimencional\n");
        String [][]datos = new String[5][4];
        datos[0][0]= "Michael";
        datos[0][1]="Guerra";
        datos[0][2]="Ing Computacion";
        datos[0][3]="Ebenezer";
        datos[1][0]="Jose";
        datos[1][1]="Zelaya";
        datos[1][2]="Produccion Ind.";
        datos[1][3]="Desconocido";
        datos[2][0]="Jose";
        datos[2][1]="Fuente";
        datos[2][2]="Produccion Ind";
        datos[2][3]="Ban Pais";
        datos[3][0]="Crist";
        datos[3][1]="Navarro";
        datos[3][2]="Ing Computacion";
        datos[3][3]="STAE";
        datos[4][0]="Josue";
        datos[4][1]="Alvaro";
        datos[4][2]="Ing Computacion";
        datos[4][3]="Desconocido";
        
        for (int x=0;x<=4;x++){
            System.out.println(datos[x][0] + "\t\t" + datos[x][0+1] + "\t\t"+ datos[x][0+2] +"\t\t" + datos[x][0+3]);
            
        }
    //Notas
    System.out.println("Notas de Aprobacion\n");
        String []NombreN=new String[3];
        NombreN[0]="Pablo";
        NombreN[1]="Monica";
        NombreN[2]="Fany";
        
        System.out.println("\n\n");
        
        int []NotaT=new int[3];
        NotaT[0]=54;
        NotaT[1]=76;
        NotaT[2]=100;
        String Coment="";
        for(int i=0;i<=2;i++){
           if(NotaT[i]<=69){
               Coment="Reprobado";
           }
           
           if(NotaT[i]>=70){
               Coment="Aprobado";
           }
           
            System.out.println(NombreN[i] + "\t\t" + NotaT[i] + "\t\t" + Coment + "\n\n");
        }
        
    //Numeros Primos
    System.out.println("Numeros Primos\n");
        int Primo=0;
        for(int i=0; i<=49; i++){
            Primo=Primo+2;
            System.out.println(Primo+"\n");
        }
    }
}
