package poop5;
/**
 *
 * @author poo01alu36
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimineto;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimineto = fNacimineto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimineto() {
        return fNacimineto;
    }

    public void setfNacimineto(Fecha fNacimineto) {
        this.fNacimineto = fNacimineto;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", fNacimineto:" + fNacimineto;
    }
}
