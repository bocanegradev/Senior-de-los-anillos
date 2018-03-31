package Armas;

import Logica.Arma;
import Logica.Juego;

public class Arco extends Arma{
    public Arco(){
        //Atributos del arma Arco
        this.nombre= "Arco";
        this.material= "Madera";
        this.peso= 30;
        this.danio= 70;
    }

    @Override
    public String descripcionArma() {
        //Creamos un String que contatene los datos a mostrar
        String datos = "<br>Arma: "+this.nombre+".<br>"
                + "Material: "+this.material+".<br>"
                + "Peso: "+this.peso+"%.<br>"
                + "Daño: "+this.danio+"%.";
        //Devolvemos la descripción completa del arma
        return datos;
    }
}