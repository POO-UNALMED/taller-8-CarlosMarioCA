/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author SAM
 */
public class Jugador extends Futbolista {   
    
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
    public Jugador(){
        super();
        this.golesMarcados =289;
        this.dorsal = 7;
    }
    
    public String toString(){
        return "El futbolista "+ this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + ". Ha marcado " + this.getGolesMarcados();
    }
    
    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    public int compareTo(Futbolista t) {
        int diferenciaEdad = this.getEdad() - t.getEdad();
        return Math.abs(diferenciaEdad);
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    

}
