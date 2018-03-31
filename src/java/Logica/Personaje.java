package Logica;

public class Personaje extends Raza{
    private String nombre;
    private int salud= 100;
    private Raza raza;
    private Arma armaPrincipal;
    private Escudo escudo;
    
    public Personaje(String nom, Raza razaPersonaje, Arma armaPersonaje, Escudo escudo){
        this.nombre= nom;
        this.raza= razaPersonaje;
        this.armaPrincipal= armaPersonaje;
        this.escudo= escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
    
    
    
    @Override
    public String descripcionRaza() {
        //Creamos un String que contatene los datos a mostrar
        String datos = "<h3>DATOS PERSONAJE:<br>Nombre: "+this.nombre+".<br>"
                + "Salud: "+this.salud+"%."
                + this.raza.descripcionRaza()
                + "<br><br>DATOS ARMA PRINCIPAL:"
                + this.armaPrincipal.descripcionArma()
                + "<br><br>DATOS ESCUDO:"
                + this.escudo.descripcionEscudo()+"</h3>";
        //Devolvemos la descripción completa de la raza
        return datos;
    }
}
