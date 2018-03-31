package Razas;

import Logica.Raza;

public class Hobbit extends Raza{
    public Hobbit(){
        //Atributos de la raza Hobbit
        this.nombre= "Hobbit";
        this.fuerza= 30;
        this.agilidad= 40;
        this.tamanio= 40;
        this.punteria= 50;
        this.inteligencia= 70;
        this.belleza= 50;
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