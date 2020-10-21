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

/*
    public boolean equals(Futbolista f) {
        if ((this.getNombre().equals(f.getNombre()))&&(this.getEdad()==f.getEdad())&&(this.getPosicion().equals(f.getPosicion()))) {
            return true;
        } else {
            return false;
        }
    }
*/  
    
    public boolean equals(Futbolista f){
        return this==f;
    }
    
    @Override
    public int compareTo(Object o){
        return this.compareTo(o);
    }

    public boolean jugarConLasManos() {
        if (this.posicion.equals("Portero")) {
            return true;
        } else {
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

    public String getPosicion() {
        return this.posicion;
    }

}
