package poop5;
/**
 *
 * @author Alexis
 */
public class Coche {
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    public Coche() {
    }

    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    public Persona getChofer() {
        return chofer;
    }
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }

    @Override
    public String toString() {
        return "Chofer: " + chofer + ", Copiloto: " + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
}
