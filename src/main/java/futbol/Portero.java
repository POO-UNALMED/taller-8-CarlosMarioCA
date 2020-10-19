package futbol;
import java.lang.Comparable;
/**
 *
 * @author SAM
 */
public class Portero extends Futbolista {
    
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Portero p) {
        int diferenciaGoles = this.getGolesRecibidos() - p.getGolesRecibidos();
        return Math.abs(diferenciaGoles);
    }
    
    public String toString(){
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos();
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    public int compareTo(Futbolista t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
