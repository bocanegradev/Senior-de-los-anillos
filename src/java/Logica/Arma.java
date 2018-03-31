package Logica;


public abstract class Arma {
    //Atributos de cada arma que se definirá
    protected String nombre;
    protected String material;
    protected int peso;
    protected int danio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
 
    //Creamos el método abstracto para obligar a usar el método
    public abstract String descripcionArma();
}