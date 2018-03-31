package Logica;


public abstract class Escudo {
    //Atributos de cada escudo que se definirá
    protected String nombre;
    protected String material;
    protected String color;
    protected int peso;
    protected int proteccion;
 
    //Creamos el método abstracto para obligar a usar el método
    public abstract String descripcionEscudo();
}