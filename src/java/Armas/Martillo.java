package Armas;

import Logica.Arma;

public class Martillo extends Arma{
    public Martillo(){
        //Atributos del arma Lanza
        this.nombre= "Martillo";
        this.material= "Acero";
        this.peso= 50;
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