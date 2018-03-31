package Escudos;

import Logica.Escudo;

public class GilGalad extends Escudo{
    public GilGalad(){
        //Atributos del escudo GilGalad
        this.nombre= "GilGalad";
        this.material= "Acero";
        this.color= "Azul";
        this.peso= 40;
        this.proteccion= 40;
    }

    @Override
    public String descripcionEscudo() {
        //Creamos un String que contatene los datos a mostrar
        String datos = "<br>Arma: "+this.nombre+".<br>"
                + "Material: "+this.material+".<br>"
                + "Color: "+this.color+".<br>"
                + "Peso: "+this.peso+"%.<br>"
                + "Daño: "+this.proteccion+"%.";
        //Devolvemos la descripción completa del escudo
        return datos;
    }
}