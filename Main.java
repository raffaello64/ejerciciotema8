package ejercicio_persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Persona persona = new Persona();
        
        persona.setEdad(36);
        
        persona.setNombre("Rafael");
        
        persona.setTelefono(3569874);
        
        
        System.out.println("El individuo " + persona.getNombre() + " tiene " + persona.getEdad() + 
        		" anos de edad y su numero telefonico es " + persona.getTelefono());
        
	}

}
class Persona {
	
	 private int edad;
	 
	 private String nombre;
	 
	 private int telefono;
	 
	 
	 public Persona(int edad, String nombre, int telefono) {
		 
		 this.edad = edad;
		 
		 this.nombre = nombre;
		 
		 this.telefono = telefono;
	 }
	 
	 public Persona() {
		 
		 this.edad = 36;
		 
		 this.nombre = "Rafael";
		 
		 this.telefono = 3569874;
		 
	 }
	 
	 public void setEdad(int edad) {
		 
		 this.edad = edad;
		 
	 }
	 
	 public void setNombre(String nombre) {
		 
		 this.nombre = nombre;
		 
	 }
	 
	 public void setTelefono(int telefono) {
		 
		 this.telefono = telefono;
		 
	 }
	 
	 
	 public int getEdad() {
		 
		 return edad;
		 
	 }
	 
	 public String getNombre() {
		 
		 return nombre;
	 }
	 
	 public int getTelefono() {
		 
		 return telefono;
	 }
	 
	 }
