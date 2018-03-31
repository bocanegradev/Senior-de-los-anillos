package Razas;

import Logica.Raza;

public class Orco extends Raza{
    public Orco(){
        //Atributos de la raza Orco
        this.nombre= "Orco";
        this.fuerza= 80;
        this.agilidad= 60;
        this.tamanio= 50;
        this.punteria= 60;
        this.inteligencia= 30;
        this.belleza= 10;
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