package pe.edu.utp.tallerprogramacion.objetos;

/**
 *
 * @author Christiam Calero
 */
public class Persona {
    
    private String dni;
    private String apellidos;
    private String nombres;
    private int edad;
    private String ciudad;
    private char genero; //'F', 'M'

    public Persona(String dni, String apellidos){
        this.dni = dni;
        this.apellidos= apellidos;
    }

    public Persona(String dni, String apellidos, String nombres, int edad, String ciudad, char genero) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.edad = edad;
        this.ciudad = ciudad;
        this.genero = genero;
    }        
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    

    
    public void comer(){
    }
    
    public void dormir(){
    }
    
    public void caminar(){
    }
}
