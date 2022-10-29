package poop5;
/**
 *
 * @author poo01alu36
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        if(dia>0 && dia<32){
            this.dia = dia;
        }
        else{
            System.out.println("Dia invalido");
            this.dia = 0;
        }
        if(mes>0 && mes<13){
            this.mes = mes;
        }
        else{
            System.out.println("Mes ivalido");
            this.mes = 0;
        }
        if(anio>0){
            this.anio = anio;
        }
        else{
            System.out.println("Anio invalido");
            this.anio = 0;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0 && dia<32){
            this.dia = dia;
        }
        else{
            System.out.println("dia incorrecto");
            this.dia = 0;            
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0 && mes<13){
            this.mes = mes;
        }
        else{
            System.out.println("Mes incorrecto");
            this.mes = 0;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio>0){
            this.anio = anio;
        }
        else{
            System.out.println("Anio invalido");
            this.anio = 0;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + anio + '}';
    }
    
}
