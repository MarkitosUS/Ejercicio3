public class Main {


   public static void main(String[] args){

        Persona persona = new Persona();

        persona.setNombre("Marcos");

        String Nombre = persona.getNombre();

        persona.setEdad(24);

        int Edad = persona.getEdad();

        persona.setTelefono(622444555);

        int Telefono = persona.getTelefono();

        System.out.println("Mi nombre es " + Nombre + ", tengo " + Edad + " años y mi telefono es " + Telefono);

    }

}

    class Persona {
        // Quise hacerlo con @Getter y @Setter pero me decidi a hacerlo como lo enseñan vosotros para aprender bien
        // Y aprender a mas!
     private int Edad;
     private String Nombre;
     private int Telefono;

     public void setNombre(String Nombre){

         this.Nombre = Nombre;

     }

     public String getNombre() {

         return this.Nombre;

     }

     public void setEdad(int Edad) {

         this.Edad = Edad;

     }

     public int getEdad(){

         return this.Edad;

     }

     public void setTelefono(int Telefono){

          this.Telefono = Telefono;

     }

     public int getTelefono(){

         return this.Telefono;

     }
}

