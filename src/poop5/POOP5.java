package poop5;
/**
 *
 * @author poo01alu36
 */
public class POOP5 {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setNombre("Sofia");
        per1.setApellido("Rodriguez");
        per1.setfNacimineto(new Fecha(21, 10, 22));
        System.out.println(per1);
        Persona per2 = new Persona("Alexis", "Solis", new Fecha(24, 06, 2003));
        System.out.println(per2);
        Coche carro = new Coche();
        carro.setChofer(per1);
        carro.setCopiloto(per2);
        System.out.println(carro);
    }
}
