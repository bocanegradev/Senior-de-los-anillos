package Logica;


public abstract class Raza{
    //Atributos de cada raza que se definirá
    protected String nombre;
    protected int fuerza;
    protected int agilidad;
    protected int tamanio;
    protected int punteria;
    protected int inteligencia;
    protected int belleza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getBelleza() {
        return belleza;
    }

    public void setBelleza(int belleza) {
        this.belleza = belleza;
    }
 
    
    //Creamos el método abstracto para obligar a usar el método
    public abstract String descripcionRaza();
}