package uth.tareamodulo3;

public class Estudiante {


    public static void main(String[] args) {
        EstudianteDatos estudianteDatos=new EstudianteDatos();
        estudianteDatos.setNombre("Michael");
        estudianteDatos.setApellido("Guerra");
        estudianteDatos.setTrabajo("Productor");
        estudianteDatos.setEdad(20);
        
        EstudianteDatos estudianteDatos1=new EstudianteDatos();
        estudianteDatos1.setNombre("Keylin");
        estudianteDatos1.setApellido("Rodriguez");
        estudianteDatos1.setTrabajo("Editora");
        estudianteDatos1.setEdad(21);
    
        System.out.println("Nombre: "+ estudianteDatos.getNombre());
        System.out.println("Apellido: "+ estudianteDatos.getApellido());
        System.out.println("Trabajo: "+ estudianteDatos.getTrabajo());
        System.out.println("Edad: "+ estudianteDatos.getEdad());
        
        System.out.println("Nombre: "+ estudianteDatos1.getNombre());
        System.out.println("Apellido: "+ estudianteDatos1.getApellido());
        System.out.println("Trabajo: "+ estudianteDatos1.getTrabajo());
        System.out.println("Edad: "+ estudianteDatos1.getEdad());
    }
    
    public static class EstudianteDatos{
        private String nombre;
        private String apellido;
        private String trabajo;
        private int edad;
        
        public String getNombre(){
            return nombre;
        }
        
        public String getApellido(){
            return apellido;
        }
        
        public String getTrabajo(){
            return trabajo;
        }
        
        public int getEdad(){
            return edad;
        }
        
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        
        public void setTrabajo(String trabajo){
            this.trabajo=trabajo;
        }
        
        public void setEdad(int edad){
            this.edad=edad;
        }
    }
    
}
