package Razas;

import Logica.Raza;

public class Elfo extends Raza{
    public Elfo(){
        //Atributos de la raza Elfo
        this.nombre= "Elfo";
        this.fuerza= 60;
        this.agilidad= 80;
        this.tamanio= 40;
        this.punteria= 90;
        this.inteligencia= 50;
        this.belleza= 100;
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