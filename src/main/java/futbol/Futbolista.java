package futbol;

import java.lang.Comparable;

/**
 *
 * @author SAM
 */
public class Futbolista implements Comparable<Object> {

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }

    public boolean equals(Futbolista f) {
        int comparar = this.compareTo(f);
        if (comparar == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        int comparar = this.compareTo(o);
        if (comparar == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean jugarConLasManos(){
        if(this.posicion.equals("Portero")){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getPosicion(){
        return this.posicion;
    }
    
    
}
