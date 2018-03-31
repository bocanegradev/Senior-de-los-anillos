package Razas;

import Logica.Raza;

public class Enano extends Raza{
    public Enano(){
        //Atributos de la raza Enano
        this.nombre= "Enano";
        this.fuerza= 40;
        this.agilidad= 30;
        this.tamanio= 20;
        this.punteria= 50;
        this.inteligencia= 40;
        this.belleza= 30;
    }

    @Override
    public String descripcionRaza() {
        //Creamos un String que contatene los datos a mostrar
        String datos = "<br>Raza: "+this.nombre+".<br>"
                + "Fuerza: "+this.fuerza+"%.<br>"
                + "Agilidad: "+this.agilidad+"%.<br>"
                + "Tamaño: "+this.tamanio+"%.<br>"
                + "Puntería: "+this.punteria+"%.<br>"
                + "Inteligencia: "+this.inteligencia+"%.<br>"
                + "Belleza: "+this.belleza+"%.";
        //Devolvemos la descripción completa de la raza
        return datos;
    }
}