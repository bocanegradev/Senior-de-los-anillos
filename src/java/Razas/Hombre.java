package Razas;

import Logica.Raza;

public class Hombre extends Raza{
    public Hombre(){
        //Atributos de la raza Hombre
        this.nombre= "Hombre";
        this.fuerza= 50;
        this.agilidad= 50;
        this.tamanio= 40;
        this.punteria= 30;
        this.inteligencia= 30;
        this.belleza= 40;
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